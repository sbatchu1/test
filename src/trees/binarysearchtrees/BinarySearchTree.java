package trees.binarysearchtrees;

public class BinarySearchTree {

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);

//		 bst.inorder();
		Node pre = bst.new Node(0);
		Node suc = bst.new Node(0);
		bst.findPreSuc(pre, suc, 65);

		System.out.println("predecessor :" + pre.data);
		System.out.println("succesor :" + suc.data);
	}

	private void findPreSuc(Node pre, Node suc, int key)
	{
		preSuc(root, pre, suc, key);
	}

	private void preSuc(Node root, Node pre, Node suc, int key) {

		if (root == null)
			return;

		// if found at root, find the max element of left & right they are pre
		// and suc
		if (root.data == key)
		{
			if (root.left != null) 
			{
				Node temp = root.left;
				while (temp.right != null) 
				{
					temp = temp.right;
				}
				pre = temp;
			}

			if (root.right != null) 
			{
				Node temp = root.right;
				while (temp.left != null) 
				{
					temp = temp.left;
				}
				suc = temp;
			}
			return;
		}

		// traverse left subtree
		if (root.data > key) 
		{
			suc = root;
			preSuc(root.left, pre, suc, key);
		}
		// traverse right subtree
		else 
		{
			pre = root;
			preSuc(root.right, pre, suc, key);
		}
	}

	private void insert(int data) {
		root = insertRec(root, data);
	}

	public Node insertRec(Node root, int data) {

		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insertRec(root.left, data);

		else if (data > root.data)
			root.right = insertRec(root.right, data);
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	void inorderRec(Node root) {
		if (root == null)
			return;
		inorderRec(root.left);
		System.out.println(root.data);
		inorderRec(root.right);
	}

}

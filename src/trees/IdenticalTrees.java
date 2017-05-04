package trees;

public class IdenticalTrees {

	public static void main(String[] args) {
		TNode root = new TNode(5);
		root.left = new TNode(10);
		root.right = new TNode(15);

		root.left.left = new TNode(20);
		root.left.right = new TNode(25);
		root.right.left = new TNode(30);
		root.right.right = new TNode(35);

		root.left.left.left = new TNode(40);
		root.left.left.right = new TNode(45);

		TNode root2 = new TNode(5);
		root2.left = new TNode(10);
		root2.right = new TNode(15);

		root2.left.left = new TNode(20);
		root2.left.right = new TNode(25);
		root2.right.left = new TNode(30);
		root2.right.right = new TNode(35);

		root2.left.left.left = new TNode(40);
		root2.left.left.right = new TNode(45);

		IdenticalTrees trees = new IdenticalTrees();
		System.out.println(trees.isIdentical(root, root2));
	}

	public boolean isIdentical(TNode node1, TNode node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null) {
			return node1.data == node2.data && isIdentical(node1.left, node2.left)
					&& isIdentical(node1.right, node2.right);
		}
		return false;
	}

}

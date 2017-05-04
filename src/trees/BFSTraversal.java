package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
	public static void main(String[] args) {
		TNode root = new TNode(5);
		root.left = new TNode(10);
		root.left.left = new TNode(20);
		root.left.left.left = new TNode(40);
		root.left.left.right = new TNode(45);
		root.left.right = new TNode(25);
		root.right = new TNode(15);
		root.right.left = new TNode(30);
		root.right.right = new TNode(35);
		root.right.right.right = new TNode(50);

		BFSTraversal bfs = new BFSTraversal();
		bfs.levelOrderQueue(root);
		
//		bfs.levelOrderIterative(root);
	}

	public void levelOrderIterative(TNode root) {
		
		int height = findHeight(root);
		for(int i = 1; i<=height; i++){
			printGivenLevel(root, i);
		}
		
	}

	private void printGivenLevel(TNode root, int level) {
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.data+" ");
		else if(level > 1){
			printGivenLevel(root.left, level);
			printGivenLevel(root.right, level);
		}
	}

	private int findHeight(TNode root) {
		if(root == null)
			return 0;
		else{
			int lheight = findHeight(root.left);
			int rheight = findHeight(root.right);
			
			if(lheight > rheight)
				return lheight + 1;
			else
				return rheight + 1;
		}
	}

	public void levelOrderQueue(TNode root) {

		if (root == null)
			return;

		Queue<TNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TNode head = q.remove();

			System.out.print(head.data + " ");

			if (head.left != null)
				q.add(head.left);

			if (head.right != null)
				q.add(head.right);

		}

	}

}

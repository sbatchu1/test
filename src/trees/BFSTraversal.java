package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
	public static void main(String[] args){
		TNode root = new TNode(5);
		root.left = new TNode(10);
		root.left.left = new TNode(20);
		root.left.left.left = new TNode(40);
		root.left.left.right = new TNode(45);
		root.left.right = new TNode(25);
		root.right = new TNode(15);
		root.right.left = new TNode(30);
		root.right.right= new TNode(35);
		root.right.right.right= new TNode(50);
		
		BFSTraversal bfs = new BFSTraversal();
		bfs.levelOrderQueue(root);
	}

	private void levelOrderQueue(TNode root) {
		
		if(root == null)
			return;
		
		Queue<TNode> q = new LinkedList<>();
		q.add(root);
		while(true){
			int nodeCount = q.size();
			if(nodeCount == 0)
				break;
			while(nodeCount > 0){
				TNode head = q.remove();
				
				System.out.print(head.data +" ");
				
				if(head.left != null)
					q.add(head.left);
					
				if(head.right != null)
					q.add(head.right);
				
				nodeCount--;
			}
			System.out.println();
		}

	}

}

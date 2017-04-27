package trees;

import java.util.Stack;

public class BFSSprialOrder {
	
	void spiralOrder(TNode root){
		
		if (root == null) {
			return;
		}
		
		Stack<TNode> s1 = new Stack<>();
		Stack<TNode> s2 = new Stack<>();
		
		s1.push(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()){
			
			while(!s1.isEmpty()){
				TNode head = s1.pop();
				System.out.print( head.data + " ");
				
				if(head.right != null)
					s2.push(head.right);
				
				if(head.left != null)
					s2.push(head.left);
			}
			
			while(!s2.isEmpty()){
				TNode head = s2.pop();
				System.out.print( head.data + " ");
				
				if(head.left != null)
					s1.push(head.left);
				
				if(head.right != null)
					s1.push(head.right);
			}
		}
		
	}
	
	public static void main(String[] args){
		TNode root = new TNode(5);
		root.left = new TNode(10);
		root.right = new TNode(15);
		
		root.left.left = new TNode(20);
		root.left.right = new TNode(25);
		root.right.left = new TNode(30);
		root.right.right = new TNode(35);
				
		root.left.left.left = new TNode(40);
		root.left.left.right = new TNode(45);
		
		BFSSprialOrder sprial = new BFSSprialOrder();
		sprial.spiralOrder(root);
		
	}

}

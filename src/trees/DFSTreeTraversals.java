package trees;

public class DFSTreeTraversals {
	
	public void preOrder(TNode node){
		if(node == null)
			return;
		//visit root first
		System.out.print(node.data + " ");
		
		//visit left node
		preOrder(node.left);
		
		//visit right node
		preOrder(node.right);
		
	}
	
	public void inOrder(TNode node){
		if(node == null)
			return;
		
		//visit left subtree
		inOrder(node.left);
		
		//visit root node
		System.out.print(node.data + " ");
		
		//visit right node
		inOrder(node.right);
	}
	
	
	public void postOrder(TNode node){
		if(node == null)
			return;
		
		
		//visit left subtree
		postOrder(node.left);
		
		//visit right subtree
		postOrder(node.right);
		
		//vist root node
		System.out.print(node.data + " ");
		
		
	}
	
	public static void main(String[] args){
	
		TNode tree = new TNode(1);
		tree.left = new TNode(2);
		tree.right = new TNode(3);
		tree.left.left = new TNode(4);
		tree.left.right = new TNode(5);
		
		DFSTreeTraversals dfs = new DFSTreeTraversals();
		
		dfs.preOrder(tree);
		
		System.out.println("");
		dfs.inOrder(tree);
		
		System.out.println("");
		dfs.postOrder(tree);
		
	}
}

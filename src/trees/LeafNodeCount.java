package trees;

public class LeafNodeCount {
	
	int leafCount;
	
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
		
		LeafNodeCount leafs = new LeafNodeCount();
		
		System.out.println(leafs.dive(root));
	}

	private int dive(TNode root) {
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null)
		{
			System.out.println(root.data);
			return 1;
		}
			
		else
			return dive(root.left) + dive(root.right);
		
	}

}

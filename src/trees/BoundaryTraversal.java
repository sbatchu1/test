package trees;

public class BoundaryTraversal {
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
		
		BoundaryTraversal boundary = new BoundaryTraversal();
		boundary.printBoundary(root);
	}

	private void printBoundary(TNode root) {
		if(null != root){
			System.out.print(root.data + " ");
			printLeftBoundary(root.left);
			
			printLeafs(root.left);
			printLeafs(root.right);
			
			printRightBoundary(root.right);
		}
	}

	private void printRightBoundary(TNode node) {
		if(node != null)
		{
			if(node.right != null)
			{
				printRightBoundary(node.right);
				System.out.print(node.data +" ");
			}
			else if(node.left != null)
			{
				printRightBoundary(node.left);
				System.out.print(node.data +" ");
			}
		}
		
	}

	private void printLeafs(TNode left) {
		// TODO Auto-generated method stub
		
	}

	private void printLeftBoundary(TNode node) {
		if(node != null)
		{
			if(node.left != null)
			{
				System.out.print(node.data +" ");
				printLeftBoundary(node.left);
			}
			else if(node.right != null)
			{
				System.out.print(node.data +" ");
				printLeftBoundary(node.right);
			}
		}
		
	}

}

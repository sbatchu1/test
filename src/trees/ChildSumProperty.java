package trees;

public class ChildSumProperty {
	
	public static void main(String[] args){
		TNode root = new TNode(10);
		root.left = new TNode(8);
		root.right = new TNode(2);
		
		root.left.left = new TNode(3);
		root.left.right = new TNode(5);
		root.right.left = new TNode(2);
		
		ChildSumProperty tree = new ChildSumProperty();
		
        if (tree.isSumProperty(root) != 0)
            System.out.println("The given tree satisfies children"
                    + " sum property");
        else
            System.out.println("The given tree does not satisfy children"
                    + " sum property");
	}

	public int isSumProperty(TNode root) {
		int left_data = 0, right_data = 0;
		
		if(root == null || (root.left == null && root.right ==null)){
			return 1;
		}else{
			if(root.left != null)
				left_data = root.left.data;
			
			if(root.right != null)
				right_data = root.right.data;
			
			if(root.data == left_data + right_data && isSumProperty(root.left) !=0 && isSumProperty(root.right) != 0)
				return 1;
			else
				return 0;
		}
	}

}

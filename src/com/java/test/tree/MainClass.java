package com.java.test.tree;

public class MainClass {
	public static void main(String[] args){
		Node rootNode = new Node(null);
		rootNode.setId("root");
		
		//add children
		Node child10 = new Node(rootNode);
		child10.setId("child10");
		rootNode.getChildNodes().add(child10);
		
		Node child11 = new Node(rootNode);
		child11.setId("child11");
		rootNode.getChildNodes().add(child11);
		
		Node child21 = new Node(child11);
		child21.setId("child21");
		child11.getChildNodes().add(child21);
		
		Node child12 = new Node(rootNode);
		child12.setId("child12");
		rootNode.getChildNodes().add(child12);
		
		Node child22 = new Node(child12);
		child22.setId("child22");
		child12.getChildNodes().add(child22);
		
		Node child23 = new Node(child12);
		child23.setId("child23");
		child12.getChildNodes().add(child23);
		
		//System.out.println(child2.getParent().getId());
		System.out.println(child12.getChildNodes().toString());
		
		//delete node
		child23.deleteNode();
		
		System.out.println(child12.getChildNodes().toString());
		
		Node newParent = rootNode.deleteRootNode();
		System.out.println(newParent.getId());
		
	}
}

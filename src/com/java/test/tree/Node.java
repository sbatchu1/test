package com.java.test.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public String id;
	public List<Node> childNodes = new ArrayList<>();
	public Node parent;
	
	public Node getRoot(){
		//System.out.println(parent.getId());
		if(parent == null){
			return this;
		}
		System.out.println("parent ID:"+parent.getId());
	  return parent.getRoot();	
	}
	
	public Node(Node parent){
		this.parent = parent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public List<Node> getChildNodes(){
		return childNodes;
		
	}
	
	public Node getParent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
	}
	
	public void deleteNode(){
		if(parent != null){
			int currentIndex = this.parent.getChildNodes().indexOf(this);
			this.parent.getChildNodes().remove(currentIndex);
			for(Node childNode: getChildNodes()){
				childNode.setParent(this.parent);
			}
			this.parent.getChildNodes().addAll(currentIndex, this.getChildNodes());
		}
		this.getChildNodes().clear();	
	}
	
	public Node deleteRootNode(){
		//get the first child of root node and make it as new root and remove it as child.
		//get the remaining children and make them as childs to new root
		
		Node newParent = null;
		if(null != getChildNodes()){
			
			newParent = getChildNodes().get(0);
			getChildNodes().remove(0);
			for(Node child: getChildNodes()){
				child.setParent(newParent);
			}
		}
		getChildNodes().clear();
			
		return newParent;
	}
	
}

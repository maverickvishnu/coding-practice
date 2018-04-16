package com.lowes.vishnu.tree;

public class InOrderTraversal {

	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	

	public void inOrder(Node root) {
	    if(root == null)
	        return;
	    inOrder(root.left);
	    System.out.print(root.data+ " ");
	    inOrder(root.right);
	}
}

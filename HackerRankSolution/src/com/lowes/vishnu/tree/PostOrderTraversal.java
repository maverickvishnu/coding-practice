package com.lowes.vishnu.tree;

public class PostOrderTraversal {
	class Node {
	    int data;
	    Node left;
	    Node right;
	}

	void postOrder(Node root) {
	    if(root != null){
	        postOrder(root.left);
	        postOrder(root.right);
	        System.out.print(root.data + " ");
	    }
	   
	}
}

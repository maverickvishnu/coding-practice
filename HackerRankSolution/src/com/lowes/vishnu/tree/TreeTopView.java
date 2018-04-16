package com.lowes.vishnu.tree;

public class TreeTopView {

	class Node {
		int data;
	    Node left;
	    Node right;
	}
    

void travLeft(Node root){
 if(root.left!= null) { 
    travLeft(root.left);}
    System.out.printf(root.data+ " ");
 }
 void travRight(Node root){
  System.out.printf(root.data + " ");
  if(root.right!= null){
      travRight(root.right);
   }
 }

void topView(Node root) {
    if(root.left != null){
         travLeft(root.left);
    }
    System.out.printf(root.data+" ");
    if(root.right != null){
       travRight(root.right);
    }      
 }

}

/*
 * Second solution
 * 
 * public static int count =0;
   void topView(Node root){
    if(root.left !=null && count >=0){
        count++;
        topView(root.left);
    }
    System.out.print(root.data + " ");
    count--;

 	if (root.right!= null && count<0) {
    	count--;
    	topView(root.right);
	}
}
 */

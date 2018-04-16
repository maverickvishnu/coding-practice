package com.lowes.vishnu.tree;

import java.util.Scanner;

public class HeightOfBT {

	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left =null;
			right=null;
		}
	}
	

static int height(Node root) {
  	 int len =0;
    if(root ==null){
        return -1;
    }
    int leftHeight = 1 +height(root.left);
    int rightHeight = 1+ height(root.right);
    return leftHeight > rightHeight ? leftHeight :rightHeight;
}

public  static Node insert(Node root, int data) {
    if(root == null){
        return new Node(data);
    }
    else {
        Node cur;
        if(data <= root.data){
            cur = insert(root.left, data);
            root.left = cur;
        }
        else{
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    Node root = null;
    while(t-- > 0){
        int data = scan.nextInt();
        root = insert(root, data);
    }
    scan.close();
    int height = height(root);
    System.out.println(height);
}	

}

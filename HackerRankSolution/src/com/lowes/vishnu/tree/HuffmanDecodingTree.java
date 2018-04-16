package com.lowes.vishnu.tree;

public class HuffmanDecodingTree {

	class Node {
		public  int frequency; 
	     public  char data;
	     public  Node left, right;
	}

void decode(String S ,Node root)
  {
      StringBuilder sb = new StringBuilder();
      Node curr = root;
      for (int i = 0; i < S.length(); i++) {
          curr = S.charAt(i) == '1' ? curr.right : curr.left;
          if (curr.left == null && curr.right == null) {
              sb.append(curr.data);
              curr = root;
          }
      }
  System.out.print(sb);
}
}

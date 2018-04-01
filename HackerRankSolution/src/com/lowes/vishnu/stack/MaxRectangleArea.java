package com.lowes.vishnu.stack;


import java.util.Stack;

public class MaxRectangleArea {

	static int largestRectangle(int[] a)
    {
		int i,area=0;
		int maxArea=0;
		Stack<Integer> st=new Stack<>();
			for(i=0;i<a.length;)
				{
					if(st.isEmpty()||a[st.peek()]<=a[i])
						{
							st.push(i++);
						}  
					else
						{
							int x=st.pop();
							if(st.isEmpty())
							{
								area=a[x]*i;
							}
							else
							{
								area=a[x]*(i-st.peek()-1);
							}
							if(area>maxArea)
								maxArea=area;

						}   
				}

			while(!st.isEmpty())
				{
					int x=st.pop();
					if(st.isEmpty())
					{
						area=a[x]*i;
					}
					else
					{
						area=a[x]*(i-st.peek()-1);
					}
					if(area>maxArea)
						maxArea=area;  
				}
			return maxArea;  
}
	
	public static void main(String [] args) {
		MaxRectangleArea  ar= new MaxRectangleArea ();
		int [] arr = {2 ,1, 2 };
		int result = ar.largestRectangle(arr);
		System.out.println(result);
	}
}

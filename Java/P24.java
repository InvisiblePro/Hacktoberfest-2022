//Reference: https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/ 

import java.util.*;
class P24
{
	/*
	
	Approach 1: requires extra space
	
	public static int[] commonElementsInThree(int a1[],int a2[],int a3[])
	{
		int temp[]=commonElementsInTwo(a1,a2);
		int ans[]=commonElementsInTwo(temp,a3);
		return ans;
	}
	
	public static int[] commonElementsInTwo(int a1[],int a2[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		int i=0,j=0;
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]==a2[j])
			{
				al.add(a1[i]);
				i++;
				j++;
			}
			else if(a1[i]<a2[j])
			{
				i++;
			}
			else	//a1[i]>a2[j]
			{
				j++;
			}
		}
		int ans[]=new int[al.size()];
		for(i=0;i<ans.length;i++)
		{
			ans[i]=al.get(i);
		}
		return ans;
	}
	
	*/
	
	// Approach 2: without extra space
	
	public static int[] commonElementsInThree(int a1[],int a2[],int a3[])
	{
		int i=0,j=0,k=0;
		ArrayList<Integer> al=new ArrayList<>();
		while(i<a1.length && j<a2.length && k<a3.length)
		{
			if(a1[i]==a2[j] && a2[j]==a3[k])
			{
				al.add(a1[i]);
				i++;
				j++;
				k++;
			}
			else if(a1[i]<a2[j])
			{
				i++;
			}
			else if(a2[j]<a3[k])
			{
				j++;
			}
			else	// a1[i]>a2[j]>a3[k]
			{
				k++;
			}
		}
		int ans[]=new int[al.size()];
		for(i=0;i<ans.length;i++)
		{
			ans[i]=al.get(i);
		}
		return ans;
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("Enter array 1 size:");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		System.out.println("Enter array 1 elements:");
		for(i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter array 2 size:");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		System.out.println("Enter array 2 elements:");
		for(i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		
		System.out.println("Enter array 3 size:");
		int n3=sc.nextInt();
		int a3[]=new int[n3];
		System.out.println("Enter array 3 elements:");
		for(i=0;i<n3;i++)
		{
			a3[i]=sc.nextInt();
		}
		
		System.out.println("Array 1:");
		for(i=0;i<n1;i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println("Array 2:");
		for(i=0;i<n2;i++)
		{
			System.out.println(a2[i]);
		}
		
		System.out.println("Array 3:");
		for(i=0;i<n3;i++)
		{
			System.out.println(a3[i]);
		}
		
		System.out.println("Common Elements:");
		int ans[]=commonElementsInThree(a1,a2,a3);
		for(i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
}
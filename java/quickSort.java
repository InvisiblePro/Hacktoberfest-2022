import java.util.Scanner;
class Sorting{
	void partition(int arr[],int start,int end){ 

		int pivot=0 ,i=0,j=0;
		if(start<end) {  
			i=start+1;
			j=end;
			pivot=start;
		while(i<j) {
			 while(arr[i]<=arr[pivot]) { 
				i++; 
				if(i>end)
				  break; 
			  }
			while(arr[j]>arr[pivot]) { 
				j--;
				if(j<start)
				  break;         
			}                      
			if(i<j) {
				int temp=arr[i];         
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if(arr[j]<arr[pivot]) {  //swap only if condition is satisfied
		int temp=arr[pivot]; 
		arr[pivot]=arr[j];
		arr[j]=temp;
		}
		partition(arr,start,j-1);
		partition(arr,j+1,end);
	    }
		
	}
	void display(int array[]) {
		System.out.println("The sorted elements are ");
		for(int i=0;i<array.length;i++) {
        	System.out.print(array[i]+" ");
        }
	}
}

public class QuickSort {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter total number of elements");
		    int num_elements=sc.nextInt();
		    int array[]=new int[num_elements];
            System.out.println("Enter array elements");
            for(int i=0;i<array.length;i++) {
            	array[i]=sc.nextInt();
            	}
            Sorting obj=new Sorting();
            obj.partition(array, 0, array.length-1);
            obj.display(array);
	}

}


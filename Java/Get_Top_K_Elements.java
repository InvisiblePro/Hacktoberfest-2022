import java.util.Arrays;
import java.util.Scanner;

public class Get_Top_K_Elements {

    void buildHeap(int arr[], int n)
    {
        int startIdx = (n / 2) - 1;

        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            swap(arr, i, largest);

            heapify(arr, n, largest);
        }
    }

    void getTopKElements(int arr[], int size, int k)
    {
        buildHeap(arr, size);
        System.out.println(Arrays.toString(arr));
        int n = size;
        int i = 0;

        while(i < k)
        {
            swap(arr, 0, n-1);
            n--;
            heapify(arr, n, 0);
            i++;
        }
        System.out.println(Arrays.toString(arr));
        for(i = size-1; i > size-k-1; i--)
            System.out.println(arr[i]);
    }

    void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Get_Top_K_Elements obj = new Get_Top_K_Elements();

        int size, i, k;

        size = sc.nextInt();

        int arr[] =new int[size];

        for(i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        k = sc.nextInt();

        obj.getTopKElements(arr, size, k);
    }
}

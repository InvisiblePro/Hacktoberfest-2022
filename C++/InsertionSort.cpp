#include <iostream>
#include <conio.h>
using namespace std;

void insertionSort_forLoop(int arr[], int n) {
    for(int i=1; i<n; i++) {
        int temp=arr[i], j;
        
        for(j=i-1; j>=0; j--) {
            if(arr[j] > temp) {
                arr[j+1] = arr[j];
            } else {
                break;
            }
        }
        
        arr[j+1] = temp;
    }
}

void insertionSort_whileLoop(int arr[], int n) {
    for(int i=1; i<n; i++) {
        int temp=arr[i], j=i-1;

        while(arr[j]>temp && j>=0) {
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[j+1] = temp;
    }
}

int main() {
    int arr[100], n;

    cout<<"Enter the size of array: ";
    cin>>n;

    cout<<"Enter the elements of the array: ";
    for(int i=0; i<n; i++) {
        cin>>arr[i];
    }

    insertionSort_forLoop(arr, n);

    cout<<"The sorted array is: ";
    for(int i=0; i<n; i++) {
        cout<<arr[i]<<"  ";
    }

    return 0;
}
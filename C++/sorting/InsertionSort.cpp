#include<iostream>
using namespace std;

int main(){
    int size,arr[100];
    cout << "Enter the size of the array: ";
    cin >> size;
    cout << "Enter the array elements separated with space: ";
    for(int i{0}; i<size; ++i){
        cin >> arr[i];
    }
    for(int i{1}; i<size; ++i){
        int j{i-1};
        int flag{arr[i]};
        while(j >= 0 && arr[j] > flag){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = flag;
    }
    cout << "Sorted array: ";
    for(int i{0}; i<size; ++i){
        cout << arr[i] << " ";
    }
    return 0;
}

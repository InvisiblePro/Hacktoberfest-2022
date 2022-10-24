//record breaker
#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int max_till_now=INT_MIN;
    int count=0;
    if(arr[0]>arr[1]){
        count++;
    }
    for(int i=2;i<n;i++){
        if(arr[i-1]>arr[i]&& arr[i-1]>max_till_now){
            count++;
            max_till_now=max(arr[i-1],max_till_now);
        }
    }
    if(arr[n-1]>max_till_now){
        count++;
    }
    cout<<count<<endl;
    return 0;
}
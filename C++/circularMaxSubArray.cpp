//circular maximum susb array problem
#include<bits/stdc++.h>
using namespace std;
int kadane(int arr[],int n){
    int currSum=0;
    int maxsum=INT_MIN;
    for(int i=0;i<n;i++){
        currSum+=arr[i];
        if(currSum<0){
            currSum=0;
        }
    }
    maxsum=max(maxsum,currSum);
    return maxsum;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int wrapsum;
    int non_wrapsum;
    non_wrapsum=kadane(arr,n);

    int total_sum=0;
    for(int i=0;i<n;i++){
        total_sum+=arr[i];
        arr[i]=-arr[i];
    }
    wrapsum=total_sum+kadane(arr,n);//remember that now the array is reversed signed

    cout<<max(wrapsum,non_wrapsum);
    return 0;
}
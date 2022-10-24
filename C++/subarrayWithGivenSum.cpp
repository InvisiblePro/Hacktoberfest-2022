//subarray with given sum
#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,s;
    cin>>n>>s;

    int a[n];
    for(int i=0; i<n;i++){
        cin>>a[i];
    }

    int i=0,j=0, st=-1, en=-1, sum=0;

    while(j<n&&sum+a[j]<s){
        sum+=a[j];
        j++;
    }

    if(sum==s){
        cout<<i+1<<" "<<j<<endl;    //because j is already ++
        return 0;
    }

    // in the following program i stores the starting position of the subset and j stores the position till where the sum is more than or equal to the given sum in the question. to find the perfect subarray we subtract the i th element of the array and stop if we find the element in the subset else we move on to the next subset. where i has new position somewhere in the between of the array. AND I GUESS THE ABPVE PROGRAM IS OF NO USE it is just a simple case. THE MAIN CODE IS BELOW.

    
    while(j<n){
        // cout<<"Before "<<sum<<endl;
        sum+=a[j];
        // cout<<"After "<<sum<<endl;
        while(sum>s){
            sum-=a[i];
            i++;
        }
        if(sum==s){
            st=i+1;
            en=j+1;
            break;
        }
        j++;
    }

    cout<<st<<" "<<en<<endl;

    return 0;
}


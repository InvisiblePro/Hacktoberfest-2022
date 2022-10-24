// find smallest positive missing integer.
#include<bits/stdc++.h>
using namespace std;

const int N=1e6+2;
bool temp_arr[N];

int main(){
    int n;
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    //we have to follow the principle of count sort.
    for(int i=0;i<N;i++){
        temp_arr[i]=false;
    }
    int max_element=INT_MIN;
    //NOTE: we r finding max element of array for better optimisation of the problem.
    //no need else wise.
    for(int i=0;i<n;i++){
        if(temp_arr[arr[i]]==false){
            temp_arr[arr[i]]=true;
        }
        max_element=max(max_element,arr[i]);
    }
    int ans=-1;
    for(int i=0;i<N;i++){
        if(temp_arr[i]==false){
            ans=i;
            break;
        }
    }
    if(ans<max_element){
        cout<<ans;
    }
    else{
        cout<<-1<<endl;
    }
    return 0;
}
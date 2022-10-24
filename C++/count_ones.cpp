// write a program to count the number of ones?
#include<bits/stdc++.h>
using namespace std;

int clear_last_significant_bit(int a){
    return (a&a-1);
}

int main(){
    int count =0;
    int n;
    cin>>n;
    while(n!=0){
        n=clear_last_significant_bit(n);
        count++;
    }
    cout<<count;
    return 0;
}
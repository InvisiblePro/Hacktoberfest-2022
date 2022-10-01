// This program is to print pyramid like patter using asterisk using C++

#include<iostream>
using namespace std;

int main(){
    int m,n,spce,rows,i;

    cout<<"\n Pyramid like Pattern Using Asterisk \n"<<endl;
    cout<<"----------------------------------------"<<endl;
    cout<<"Enter Number of Rows for Pyramid :- ";
    cin >> rows;

    spce = rows + 4 - 1;
    for(m = 1; m<=rows;m++)
    {
        for(i=spce;i>=1;i--)
        {
            cout<<" ";
        }
        for(n=1;n<=m;n++)
        {
            cout<<"*"<<" ";
        }
        cout<<endl;
        spce--;
    }
    return 0;
}
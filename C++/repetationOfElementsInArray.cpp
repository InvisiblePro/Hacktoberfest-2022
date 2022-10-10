/******************************************************************************
Find the occurrence of an integer in the array
*******************************************************************************/

#include <iostream>
using namespace std;
int countNumberIntArray(int a[],int size,int key){
int count = 0; 
for(int i=0;i<size;i++){
    if(key==a[i]){
        count++;
    }
}
return count;
 }
int main()
{
    int a[6]={4,3,2,3,9,8};
    int size = sizeof(a)/sizeof(a[1]);
    cout<<countNumberIntArray(a,size,3);
    return 0;
}

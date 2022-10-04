#include <bits/stdc++.h>
using namespace std;

int tables(int n){
  for (int x = 1; x <= 10; x++){
    for (int i = 1; i <= n; i++){
      cout << i << "*" << x << "=" << (x*i) << "\t\t";
    }
    cout<<"\n";
  }
  return 0;
}

int main(){
  int n;
  cin >> n;
  tables(n);
  return 0;
}
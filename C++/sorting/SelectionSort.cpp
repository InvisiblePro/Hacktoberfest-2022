#include <bits/stdc++.h> 
using namespace std;

int main() {
	int n = 5;
	int a[n] = {-2, 45, 0, 11, -9}; 

	for (int i = 0; i < n - 1; i++) {
		int min_ind = i;
		for (int j = i + 1; j < n; j++) {
			if (a[min_ind] > a[j]) min_ind = j;
		}
		swap(a[i], a[min_ind]);
	}

	for (int i = 0; i < n; i++) cout << a[i] << ' ';

	return 0;
}

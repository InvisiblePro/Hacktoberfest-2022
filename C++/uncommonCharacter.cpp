// C++ implementation to find the uncommon
// characters of the two strings
#include <bits/stdc++.h>
using namespace std;

// function to find the uncommon characters
// of the two strings
void findAndPrintUncommonChars(string str1, string str2)
{
	// to store the answer
	string ans = "";
	
	// to handle the case of duplicates
	vector<int> used(26, false);

	// check first for str1
	for (int i = 0; i < str1.size(); i++) {
		// keeping a flag variable
		bool found = false;

		for (int j = 0; j < str2.size(); j++) {
			// if found change the flag
			// and break from loop
			if (str1[i] == str2[j]) {
				found = true;
				break;
			}
		}

		// if duplicate character not found
		// then add it to ans
		if (!found and !used[str1[i] - 'a']) {
			used[str1[i] - 'a'] = true;
			ans += str1[i];
		}
	}

	// now check for str2
	for (int i = 0; i < str2.size(); i++) {
		// keeping a flag variable
		bool found = false;

		for (int j = 0; j < str1.size(); j++) {
			// if found change the flag
			// and break from loop
			if (str2[i] == str1[j]) {
				found = true;
				break;
			}
		}

		// if duplicate character not found
		// then add it to ans
		if (!found and !used[str2[i] - 'a']) {
			used[str2[i] - 'a'] = true;
			ans += str2[i];
		}
	}

	// to match with output
	sort(ans.begin(), ans.end());

	// if not found any character
	if (ans.size() == 0)
		cout << "-1";
	
	// else print the answer
	else
		cout << ans << " ";
}

// Driver program to test above
int main()
{
	string str1 = "characters";
	string str2 = "alphabets";
	findAndPrintUncommonChars(str1, str2);
	return 0;
}

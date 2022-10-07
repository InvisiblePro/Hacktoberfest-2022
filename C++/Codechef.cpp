#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;cin>>t;
	while(t--){
	    string s;cin>>s;int f=0;
	    for(int i=0;i<s.size()-3;i++){
	        if((s[i]=='a' || s[i]=='e'|| s[i]=='i' || s[i]=='o' || s[i]=='u' ) && (s[i+1]=='a' || s[i+1]=='e'|| s[i+1]=='i' || s[i+1]=='o' || s[i+1]=='u' ) && ( (s[i+2]=='a' || s[i+2]=='e'|| s[i+2]=='i' || s[i+2]=='o' || s[i+2]=='u' )) )
	        {//cout<<"Happy"<<endl;
	        f=1;
	        break;}
	        else
	        f=0;
	        //std::cout << "Sad" << std::endl;
	    }
	    if(f==1)cout<<"Happy"<<endl;
	    else
	    std::cout << "Sad" << std::endl;
	}
	return 0;
}


#include <bits/stdc++.h>

using namespace std;

   int lengthOfLongestSubstring(string s) {
         int j=0;
         //if(s.size()==0)
        // return 0;
        map<int,int>mp;int ans=0;
        for(int i=0;i<s.size();i++)
        {
            if(mp[s[i]] > 0)
            {
                while(mp[s[i]]!=0)
                {
                    mp[s[j]]--;
                    j++;
                }
            }
            
            ans = max(ans,i-j+1);
            mp[s[i]]++;
        }
        return ans;
   }
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
       string s;
       cin>>s;
       int ans= lengthOfLongestSubstring(s);
       cout<<ans<<endl;
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

/*
Optimal Algo approach-
Logic:
We need to define a isPossible() function that checks if a distance x is possible between each of the cows. 
We can use a greedy approach here by placing cows at the leftmost possible stalls such that they are at 
least x distance away from the last-placed cow.
We need to sort the given array/list so once we have our sorted array to do the greedy task then we can 
apply the Binary Search algorithm on the sorted input, and use our function isPossible( ) to find the 
largest distance possible.

The time complexity of this approach is O(nlogn) but otherwise bruteforce would be having very high time
complexity.
*/

bool isPossible(vector<int> &stalls, int minDist, int k)
{
    int cows=1;
    int lastCowPosition=stalls[0];
    for(int i=1;i<stalls.size();i++)
    {
        if(stalls[i]-lastCowPosition>=minDist)
        {
            cows++;
            lastCowPosition=stalls[i];
            if(cows>=k) return true;
        }
    }
    return false;
}

int aggressiveCows(vector<int> &stalls, int k)
{
    int n=stalls.size();
    sort(stalls.begin(),stalls.end());
    int low=1,high=stalls[n-1]-stalls[0];
    int res;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(isPossible(stalls,mid,k))
        {
            res=mid;
            low=mid+1;
        }
        else high=mid-1;
    }
    return res;
}



int main(){
    int n;
    cin >> n;

    vector<int> stalls(n);
    for(int i=0;i<n;i++)cin >> stalls[i];

    int k;
    cin >> k;

    int ans=aggressiveCows(stalls,k);

    cout << ans << endl;
    return 0;
}
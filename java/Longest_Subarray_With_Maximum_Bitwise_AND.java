class Solution {
    public int longestSubarray(int[] nums) {
     // int maxx = *max_element(nums.begin(),nums.end());
       int maxx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxx)maxx=nums[i];
        }
        
        int len=0,cur=0;
        for(int x:nums){
            if(x==maxx)cur++;
            else {
                len = Math.max(len,cur);
                cur=0;
            }
        }
        len = Math.max(cur,len);
        return len;  
    }
}

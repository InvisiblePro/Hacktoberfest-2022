class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i=1;i<position.length;i++){
            if(i%2==0)
                even++;
            else
                odd++;
        }
        return Math.min(even,odd);
    }
}
Footer
© 2022 GitHub, Inc.
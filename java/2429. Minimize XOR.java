class Solution {
    public int minimizeXor(int num1, int num2) {
       int n=setBit(num1);
        int m=setBit(num2);
        if(n==m){
            return num1;
        }
        else if(n>m){
            int temp=n-m;
            return nikalo(num1,temp);
        }else{
            
            int temp=m-n;
            return aaaaaaaaaaaaaaaaaaaaa(num1,temp);
            
        }

    
    }
    public  int  aaaaaaaaaaaaaaaaaaaaa(int n,int temp){
        int ans=n;
        int count=1;
        while(temp>0){
            if((n&1)==0){

                ans+=count;
                temp--;
            }
            n=n>>1;
            count*=2;

        }
        return ans;
    }
    public  int nikalo(int n,int temp ){
        int count=1;
        int ans=n;
        while(temp>0){
            if((n&1)==1){
                ans-=count;
                temp--;
            }
            count*=2;
            n=n>>1;
        }
        return ans;
    }
    public int setBit(int n){
        int temp=0;
        while(n>0){
            if((n&(1))==1)temp++;
            n=n>>1;
        }
        return temp;
    }
    
    
}
//1 =5 2=7
    

// 1 0 1
// 
class Solution
{
    public long closestPalindrome(long num)
    {
        String number = String.valueOf(num);
        
        if(isPalindrome(number))
        {
            return num;
        }
        
        if(number.charAt(0)=='1' && Long.parseLong(number.substring(1))==0)
        {
            return num-1;
        }
        
        int n = number.length();
        
        boolean hasEvenDigits = n%2==0;
        
        
        String palRootStr = hasEvenDigits ? number.substring(0, n/2) : number.substring(0, n/2+1);
        
        long palRoot = Long.parseLong(palRootStr);
        
        //Equal
        
        long equal = toPal("" + palRoot, hasEvenDigits);
        long diffEqual = Math.abs(num-equal);
        
        //Bigger
        
        long bigger = toPal("" + (palRoot+1), hasEvenDigits);
        long diffBigger = Math.abs(num-bigger);
        
        //Smaller
        
        long smaller = toPal("" + (palRoot-1), hasEvenDigits);
        long diffSmaller = Math.abs(num-smaller);
        
        
        long closest = diffBigger<diffSmaller ? bigger : smaller;
        
        long minDiff = Math.min(diffBigger, diffSmaller);
        
        if(diffEqual==minDiff)
        {
            closest = Math.min(equal, closest);
        }
        else if(diffEqual<minDiff)
        {
            closest = equal;
        }
        
        
        return closest;
        
        
    }
    
    private long toPal(String num, boolean isEven)
    {
        StringBuilder reverseNum = new StringBuilder(num).reverse();
        
        String palDigits = isEven ? num + reverseNum : num + (reverseNum.deleteCharAt(0)).toString();
        
        return Long.parseLong(palDigits);
    }
    
    
    private boolean isPalindrome(String num)
    {
        int l=0, r=num.length()-1;
        
        while(l<r)
        {
            if(num.charAt(l++)!=num.charAt(r--)) return false;
        }
        
        return true;
    }
    
}

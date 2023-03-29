package slidingwindow;
/*
Given a string s and an integer k, return the number of substrings in s of length k with no repeated characters.



Example 1:

Input: s = "havefunonleetcode", k = 5
Output: 6
Explanation: There are 6 substrings they are: 'havef','avefu','vefun','efuno','etcod','tcode'.
Example 2:

Input: s = "home", k = 5
Output: 0
Explanation: Notice k can be larger than the length of s. In this case, it is not possible to find any substring.


Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
1 <= k <= 104


 */

import java.util.HashSet;
import java.util.Set;

public class KLengthSubstring {

    public static void main(String[] args) {
        String s="havefunonleetcode";
        int k=5;
        int res = findKLenSubstringSize(s,k);
        System.out.println(res);
    }

    private static int findKLenSubstringSize(String s, int k) {

        Set<Character> set = new HashSet<>();
        int count=0,i=0,j=0;
        while(j<s.length()){

            if(set.contains(s.charAt(j)))
                set.remove(s.charAt(i++));
            else
                set.add(s.charAt(j++));
            if(set.size() == k){
                count +=1;
                set.remove(s.charAt(i++));
            }
        }
        return count;
    }


}

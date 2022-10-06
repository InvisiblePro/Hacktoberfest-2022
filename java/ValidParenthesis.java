class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char bracket = s.charAt(i);
            if(bracket=='(' || bracket=='[' || bracket=='{')
            {
                stack.push(bracket);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char bracket2 = stack.pop();
                if(bracket==')' && bracket2=='(')
                {
                    continue;
                }
                else if(bracket=='}' && bracket2=='{')
                {
                    continue;
                }
                else if(bracket==']' && bracket2=='[')
                {
                    continue;
                }
                else
                {
                    return false;
                }
                
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
        
    }
}

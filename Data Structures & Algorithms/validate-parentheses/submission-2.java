class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char [] c = s.toCharArray();

if(c.length == 1)
{
    return false;
}
        for(Character cc : c)
        {
            if(cc == '(' )
            {
                stack.push(')');
            }
            else if (cc == '{' )
            {
                stack.push('}');
            }
            else if( cc == '[')
            {
                stack.push(']');
            }
            if(cc == ')' || cc == ']' || cc == '}' )
            {
            if(stack.isEmpty() || stack.pop() != cc)
            {
                return false;
            
            }}
        }

            
            return stack.isEmpty();
    
    }
}

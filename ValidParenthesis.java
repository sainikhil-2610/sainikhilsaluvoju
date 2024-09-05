import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char x = s.charAt(i);
            if(x == '('|| x=='{' || x=='['){
                stack.push(x);
                continue;
            }
            else{
            char p;
            switch(x){
                        case ')':
                              p=stack.pop();
                             if(p== '{'|| p=='[')
                                    return false;
                             break;
                        case '}':
                              p=stack.pop();
                            if(p=='('||p=='[')
                                 return false;
                             break;
                        case ']': 
                              p=stack.pop();
                             if(p==')' || p=='}')
                                  return false;
                            break;          
                    }
            }
             
            

        }
         return (stack.isEmpty());
    }
    public static void main(String[]args){
        Solution myobj= new Solution();
        System.out.println(myobj.isValid("(]"));
    }
}  

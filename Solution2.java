import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public  static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list= new ArrayList<>();
        char c;
        int len=words.length;
        for(int i=0;i<len;i++){
            String s=words[i];
            for(int j=0;j<s.length();i++){
                    c=s.charAt(j);
               if(x==c){
                 list.add(i);
               }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String [] words={"leet","code"};
        char x='e';
       System.out.print(findWordsContaining(words, x));
    }
    }
     


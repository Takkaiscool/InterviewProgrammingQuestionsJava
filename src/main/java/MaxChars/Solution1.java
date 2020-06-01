package MaxChars;

import java.util.HashMap;
import java.util.Iterator;

//Using hashmap
public class Solution1 {
    public static void main(String[] args) {
        String input = "apple 11234222222";
        HashMap<Character,Integer> counts = new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(counts.get(input.charAt(i))==null){
                counts.put(input.charAt(i),0);
            }else{
                counts.put(input.charAt(i),counts.get(input.charAt(i))+1);
            }
        }
        Iterator<Character> keyset = counts.keySet().iterator();
        int max = 0;
        Character output = null;
        while (keyset.hasNext()){
            Character key = keyset.next();
            if(max<counts.get(key)){
                max= counts.get(key);
                output=key;
            }
        }
        System.out.println(output);
    }
}

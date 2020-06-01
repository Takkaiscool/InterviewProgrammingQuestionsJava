package StringReversal;

public class Solution1 {
    //By using loops
    public static void main(String[] args) {
        String input = "Java Coding";
        String output = new String();
        for(int i=input.length()-1;i>-1;i--){
            output+=input.charAt(i);
        }
        System.out.println(output);
    }
}

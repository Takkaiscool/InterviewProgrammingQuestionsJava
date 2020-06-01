package Palindromes;

public class Solution2 {
    //Reversing string without inbuilt function
    public static void main(String[] args) {
        String input = "malayalam";
        String output = new String();
        for(int i=input.length()-1;i>-1;i--){
            output+=input.charAt(i);
        }
        if(output.equalsIgnoreCase(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

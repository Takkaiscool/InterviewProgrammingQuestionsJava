package Palindromes;

public class Solution1 {
    //Using inbuilt function for reversing
    public static void main(String[] args) {
        String input = "malayalam";
        StringBuffer output = new StringBuffer(input).reverse();
        if(output.toString().equalsIgnoreCase(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

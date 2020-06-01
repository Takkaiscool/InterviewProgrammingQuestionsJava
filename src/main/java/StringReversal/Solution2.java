package StringReversal;



public class Solution2 {
    //By using inbuilt function
    public static void main(String[] args) {
        String input = "Java Coding";
        StringBuffer outpuut = new StringBuffer(input).reverse();
        System.out.println(outpuut.toString());
    }
}

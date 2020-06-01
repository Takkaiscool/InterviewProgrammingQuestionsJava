package FizzBuzzProblem;

public class Solution1 {
    public static void main(String[] args) {
        int n = 30;
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3==0)
                System.out.println("Fizz");
            if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}

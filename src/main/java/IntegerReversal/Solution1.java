package IntegerReversal;

public class Solution1 {
    public static void main(String[] args) {
        int input = -987;
        int temp = Math.abs(input);
        int output=0;
        while (temp>0){
            output = (output*10)+(temp%10);
            temp = temp/10;
        }
        if(input<0)
            output*=-1;
        System.out.println(output);

    }
}

package FindNumberOfDays;

public class Solution1 {
    public static void main(String[] args) {
        int input = 646205100;
        String output = new String();
        int minutes = 60;
        int hr = minutes*60;
        int day = hr*24;
        int year = day*365;

        output += (input/year)+"Years, ";
        input%=year;
        output += (input/day)+"Days, ";
        input%=day;
        output += (input/hr)+"Hours, ";
        input%=hr;
        output += (input/minutes)+"Minutes, ";
        input%=minutes;
        output += input+"Seconds ";
        System.out.println(output);

    }
}

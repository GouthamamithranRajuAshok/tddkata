import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(String numbers) {
        List<Integer> numberList = new ArrayList<Integer>();
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numberStrings = numbers.split(",");
        for (int i = 0; i < numberStrings.length; i++) {
            sum += Integer.parseInt(numberStrings[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(StringCalculator.add(""));
        System.out.println(StringCalculator.add("1"));
        System.out.println(StringCalculator.add("1,2"));
        System.out.println(StringCalculator.add("1,2,3,4,5,6,7"));
    }


}

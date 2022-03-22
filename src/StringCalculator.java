public class StringCalculator {
    public static int add(String numbers) {
        try {
            int sum = 0;
            if (numbers.isEmpty()) {
                return 0;
            }
            String[] numberStrings = numbers.split("\n|,|;|//");
            for (int i = 0; i < numberStrings.length; i++) {
                if (numberStrings[i].isEmpty()) {
                    continue;
                }
                if (Integer.parseInt(numberStrings[i]) < 0) {
                    throw new Exception();
                }
                sum += Integer.parseInt(numberStrings[i]);
            }
            return sum;
        } catch (Exception e) {
            throw new RuntimeException("negatives not allowed");
        }
    }

    public static void main(String[] args) {
        System.out.println(StringCalculator.add(""));
        System.out.println(StringCalculator.add("1"));
        System.out.println(StringCalculator.add("1,2"));
        System.out.println(StringCalculator.add("1,2,3,4,5,6,7"));
        System.out.println(StringCalculator.add("1\n2,3"));
        System.out.println(StringCalculator.add("//;\n1,2;3"));
        System.out.println(StringCalculator.add("1,2,-3"));
    }
}

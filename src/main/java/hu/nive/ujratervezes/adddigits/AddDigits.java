package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.equals("")) {
            return -1;
        }
        char[] digits = input.toCharArray();
        int result = 0;
        for (char digit : digits) {
            try {
                result += Integer.parseInt(String.valueOf(digit));
            } catch (NumberFormatException ignored) {
            }
        }
        return result;
    }
}

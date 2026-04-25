public class SumOfNumbers {
    public static void main(String[] args) {

    }
    public int sumNumbers(String inputText) {
        int sum= 0;
        int numToAdd = 0;
        int digit = 1;
        for (int i = 0; i < inputText.length(); i++){
            char currentChar = inputText.charAt(i);
            if (Character.isDigit(currentChar)) {
                numToAdd = numToAdd + digit * (currentChar - '0');
                digit *= 10;
            } else {
                numToAdd = 0;
                digit = 1;
            }
            sum += numToAdd;
        }
        return sum;
    }
}

public class SumOfNumbers {
    public static void main(String[] args) {
        SumOfNumbers tk10= new SumOfNumbers();
        System.out.println(tk10.sumNumbers("abc123xyz"));
        System.out.println(tk10.sumNumbers("aa11b33"));
        System.out.println(tk10.sumNumbers("7 11"));
    }
    public int sumNumbers(String inputText) {
        int sum= 0;
        int numToAdd = 0;
        for (int i = 0; i < inputText.length(); i++){
            char currentChar = inputText.charAt(i);
            if (Character.isDigit(currentChar)) {
                numToAdd = numToAdd  * 10 + (currentChar - '0');
            } else {
                sum += numToAdd;
                numToAdd = 0;
            }
        }
        sum += numToAdd;
        return sum;
    }
}

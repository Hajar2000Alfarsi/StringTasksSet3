public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits tk6= new SumOfDigits();
        System.out.println(tk6.sumDigits("aa1bc2d3"));
        System.out.println(tk6.sumDigits("aa11b33"));
        System.out.println(tk6.sumDigits("Chocolate"));
    }
    public int sumDigits(String inputText){
        int sum= 0;
        for (int i = 0; i < inputText.length(); i++){
            char currentChar= inputText.charAt(i);
            if (Character.isDigit(currentChar)){
                sum += (currentChar - '0');
            }
        }
        return sum;
    }
}

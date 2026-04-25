public class CountTriple {
    public static void main(String[] args) {
        CountTriple tk5= new CountTriple();
        System.out.println(tk5.countTriple("abcXXXabc"));
        System.out.println(tk5.countTriple("xxxabyyyycd"));
        System.out.println(tk5.countTriple("a"));
    }

    public int countTriple(String inputText) {
        int tripleCount= 0;
        for (int i =0; i < inputText.length()- 2; i++){
            if (inputText.charAt(i + 1) == inputText.charAt(i) &&
                inputText.charAt(i + 2) == inputText.charAt(i)) {
                tripleCount++;
            }
        }
        return tripleCount;
    }
}

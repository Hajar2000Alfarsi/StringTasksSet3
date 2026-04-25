public class EndsMirror {
    public static void main(String[] args) {

    }
    public String mirrorEnds(String inputText) {
            String resultText= "";
            for (int i = 0; i <= inputText.length() / 2; i++) {
                if (inputText.charAt(i) == inputText.charAt(inputText.length()) - 1) {
                    resultText += inputText.charAt(i);
                } else {
                    break;
                }
            }
            return resultText;
    }
}

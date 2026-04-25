public class EndsMirror {
    public static void main(String[] args) {
        EndsMirror tk8= new EndsMirror();

        System.out.println(tk8.mirrorEnds("abXYZba"));
        System.out.println(tk8.mirrorEnds("abca"));
        System.out.println(tk8.mirrorEnds("aba"));
    }
    public String mirrorEnds(String inputText) {
            String resultText= "";
            for (int i = 0; i < inputText.length(); i++) {
                if (inputText.charAt(i) == inputText.charAt(inputText.length()- 1 - i)) {
                    resultText += inputText.charAt(i);
                } else {
                    break;
                }
            }
            return resultText;
    }
}

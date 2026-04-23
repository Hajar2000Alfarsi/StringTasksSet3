public class RemoveSubstring {
    public static void main(String[] args) {
        RemoveSubstring tk2= new RemoveSubstring();

        System.out.println(tk2.withoutString("Hello there", "llo")); // He there
        System.out.println(tk2.withoutString("Hello there", "e"));   // Hllo thr
        System.out.println(tk2.withoutString("Hello there", "x"));
    }
    public String withoutString(String inputText, String removeText) {
        String resultText = "";

        for (int i = 0; i < inputText.length(); i++) {
            if (i <= inputText.length() - removeText.length()){
                String part = inputText.substring(i, i + removeText.length());

                if (part.equals(removeText)) {
                    i = i + removeText.length() -1;
                    continue;
                }
            }
            resultText += inputText.charAt(i);
        }
        return resultText;
    }
}

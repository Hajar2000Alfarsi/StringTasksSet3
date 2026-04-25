public class ReplaceIs {
    public static void main(String[] args) {
        ReplaceIs tk11= new ReplaceIs();

        System.out.println(tk11.notReplace("is test"));
        System.out.println(tk11.notReplace("is-is"));
        System.out.println(tk11.notReplace("This is right"));
    }
    public String notReplace(String inputText) {
        String resultText = "";
        for (int i = 0; i < inputText.length(); i++){
            if(i <= inputText.length()-2 && inputText.substring(i, i+2).equals("is")){
                boolean beforeIs = (i > 0 && Character.isLetter(inputText.charAt(i-1)));
                boolean afterIs = (i < inputText.length() -2 && Character.isLetter(inputText.charAt(i+2)));
                if (!beforeIs && !afterIs){
                    resultText += "is not";
                    i++;
                    continue;
                }
            }
            resultText += inputText.charAt(i);
        }
        return resultText;
    }
}

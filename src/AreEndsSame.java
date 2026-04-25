public class AreEndsSame {
    public static void main(String[] args) {

    }
    public String sameEnds(String inputText) {
        String sameStartEnd= "";

        for (int i = 0; i < inputText.length() / 2; i++){
            String startPart = inputText.substring(0,i);
            String endPart = inputText.substring(inputText.length() - i);

            if(startPart.equals(endPart)){
                sameStartEnd += startPart;
            }
        }
        return sameStartEnd;
    }
}

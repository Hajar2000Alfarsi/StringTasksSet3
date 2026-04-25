public class AreEndsSame {
    public static void main(String[] args) {
        AreEndsSame tk7= new AreEndsSame();

        System.out.println(tk7.sameEnds("abXYab"));
        System.out.println(tk7.sameEnds("xxHelloxx"));
        System.out.println(tk7.sameEnds("xxx"));
    }
    public String sameEnds(String inputText) {
        String sameStartEnd= "";

        for (int i = 0; i <= inputText.length() / 2; i++){
            String startPart = inputText.substring(0,i);
            String endPart = inputText.substring(inputText.length() - i);

            if(startPart.equals(endPart)){
                sameStartEnd = startPart;
            }
        }
        return sameStartEnd;
    }
}

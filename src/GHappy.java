public class GHappy {
    public static void main(String[] args){
        GHappy tk4= new GHappy();

        System.out.println(tk4.gHappy("xxggxx"));      // true
        System.out.println(tk4.gHappy("xxgxx"));       // false
        System.out.println(tk4.gHappy("xxggyygxx"));
    }
    public boolean gHappy(String inputText){
        for (int i = 0; i < inputText.length() -1; i++) {
            if (inputText.charAt(i) == 'g') {
                boolean left= (i > 0 && inputText.charAt(i-1) == 'g');
                boolean right= (i < inputText.length()-1 && inputText.charAt(i+1) == 'g');

                if (!left && !right) {
                        return false;
                }
            }
        }
        return true;
    }
}

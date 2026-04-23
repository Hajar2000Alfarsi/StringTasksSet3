public class IsEqualNot {
    public static void main(String[] args){
        IsEqualNot tk3= new IsEqualNot();
        System.out.println(tk3.equalIsNot("This is not"));
        System.out.println(tk3.equalIsNot("This is notnot"));
        System.out.println(tk3.equalIsNot("noisxxnotyynotxisi"));
    }
    public boolean equalIsNot(String inputText) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < inputText.length(); i++) {
            if (i <= inputText.length() -2 && inputText.substring(i, i+2).equals("is")){
                countIs++;
            }
            if (i <= inputText.length() -3 && inputText.substring(i, i+3).equals("not")){
                countNot++;
            }
        }
        return countIs == countNot;
    }
}

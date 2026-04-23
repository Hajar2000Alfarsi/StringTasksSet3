public class CountWordEndWithYOrZ {
    public static void main(String[] args){
        String testExampleOne = "fez day";
        String testExampleTwo = "day fez";
        String testExampleThree = "day fyyyz";

        CountWordEndWithYOrZ tk1= new CountWordEndWithYOrZ();
        System.out.println(tk1.countYZ(testExampleOne));
        System.out.println(tk1.countYZ(testExampleTwo));
        System.out.println(tk1.countYZ(testExampleThree));
    }
    public int countYZ(String inputText) {
        int countYAndZ = 0;
        for (int i = 0; i < inputText.length(); i++){
            char currentChar = inputText.charAt(i);

            if (currentChar == 'y' || currentChar == 'Y' ||
                currentChar == 'z' || currentChar == 'Z'){
                if (i == inputText.length() - 1  || !Character.isLetter(inputText.charAt(i + 1))){
                    countYAndZ++;
                }
            }
        }
        return countYAndZ;
    }
}

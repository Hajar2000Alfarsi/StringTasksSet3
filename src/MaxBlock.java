public class MaxBlock {
    public static void main(String[] args){

    }
    public int maxBlock(String inputText) {
        int currentBlock= 0;
        int maxBlock = 0;
        if (inputText.length() == 0){
            return 0;
        }
        for (int i = 0; i < inputText.length(); i++) {
            if (inputText.charAt(i) == inputText.charAt(i+1)){
                currentBlock ++;
            } else {
                currentBlock =0;
            }
        }
        if (maxBlock < currentBlock) {
            maxBlock= currentBlock;
        }
        return maxBlock;
    }
}

public class MaxBlock {
    public static void main(String[] args){
        MaxBlock tk9 = new MaxBlock();
        System.out.println(tk9.maxBlock("hoopla"));
        System.out.println(tk9.maxBlock("abbCCCddBBBxx"));
        System.out.println(tk9.maxBlock(""));
    }
    public int maxBlock(String inputText) {
        int currentBlock= 1;
        int maxBlock = 0;
        if (inputText.length() == 0){
            return 0;
        }
        for (int i = 0; i < inputText.length() -1; i++) {
            if (inputText.charAt(i) == inputText.charAt(i+1)){
                currentBlock ++;
            } else {
                currentBlock =1;
            }
            if (maxBlock < currentBlock) {
                maxBlock= currentBlock;
            }
        }
        return maxBlock;
    }
}

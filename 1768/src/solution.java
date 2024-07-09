public class solution {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";

        int firstStringPointer = 0;
        int secondStringPointer = 0;

        while (firstStringPointer < word1.length() && secondStringPointer < word2.length()){
            result = result + word1.charAt(firstStringPointer) + word2.charAt(secondStringPointer);
            firstStringPointer++;
            secondStringPointer++;
        }
        if (firstStringPointer < word1.length()){
            result = result + word1.substring(firstStringPointer);
        }else if (secondStringPointer < word2.length()){
            result = result + word2.substring(secondStringPointer);
        }
        return result;
    }
}
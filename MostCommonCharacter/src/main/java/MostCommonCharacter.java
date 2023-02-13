
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if (str == null || str.isEmpty()) {
            return ' ';
        }
        int[] charCount = new int[256];
        char[] charArray = str.toCharArray();
        int maxCount = 0;
        char maxChar = ' ';
        for (char c : charArray) {
            charCount[c]++;
            if (charCount[c] > maxCount) {
                maxCount = charCount[c];
                maxChar = c;
            }
        }
        return maxChar;
    }
}

class Solution {
    public String removeOccurrences(String up, String part) {
        int partLen = part.length();
        return skipApple("", up, part, partLen);
    }

    static String skipApple(String unprocessed, String str, String part, int partLen) {
        if (str.isEmpty()) {
            return unprocessed;
        }

        char ch = str.charAt(0);

        if (str.startsWith(part)) {
            int unLen = unprocessed.length();
            int diff = unLen - partLen;
            if (diff < 0) {
                return skipApple("",unprocessed + str.substring(partLen),part,partLen);
            }
            String Splitfr = unprocessed.substring(0, diff);// first part of the string;
            String SplitSc = unprocessed.substring(diff);
            return skipApple(Splitfr, SplitSc + str.substring(partLen),part,partLen);
        } else {
            unprocessed += ch;
            return skipApple(unprocessed ,str.substring(1),part,partLen);
        }
    }
}
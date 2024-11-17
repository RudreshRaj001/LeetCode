class Solution {
    public String removeOccurrences(String up, String part) {
        // String ans = removes(up, part);
        // int len = ans.length();
        // while(true){
        // ans = removes(ans, part);
        // if(len == ans.length()){
        // break;
        // }else{
        // len = ans.length();
        // }
        // }
        // return ans;

        // int partLen = part.length();
        // return skipApple("", up, part, partLen);
        if (!up.contains(part)) {
            return up; // Base case: no more `part` in `up`
        }
        // Remove first occurrence of `part` and recurse
        return removeOccurrences(up.replaceFirst(part, ""), part);
    }

    static String skipApple(String unprocessed, String str, String part, int partLen) {
        if (str.isEmpty()) {
            return unprocessed;
        }

        // up + ch + str(1)
        // up + str(5)
        // up / 5
        // up (len - 5)

        char ch = str.charAt(0);

        if (str.startsWith(part)) {
            int unLen = unprocessed.length();
            int diff = unLen - partLen;
            if (diff < 0) {
                return skipApple("",unprocessed + str.substring(partLen),part,partLen);
            }
            String Splitfr = unprocessed.substring(0, diff);// first part of the string;
            String SplitSc = unprocessed.substring(diff);
            return Splitfr + skipApple("",SplitSc + str.substring(partLen),part,partLen);
        } else {
            unprocessed += ch;
            return unprocessed + skipApple("",str.substring(1),part,partLen);
        }
    }

    // public String removes(String up, String part) {
    // if(up.isEmpty()){
    // return "";
    // }

    // if(up.startsWith(part)){
    // return removeOccurrences(up.substring(part.length()), part);
    // }else{
    // return up.charAt(0) + removeOccurrences(up.substring(1), part);
    // }
    // }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.addAll(helper("", digits));
        return list;
    }

    static ArrayList<String> helper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2
        ArrayList<String> result = new ArrayList<>();

        // int i = (digit - 1) * 3;
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= ((digit - 1) * 3); i++) {
                char ch = (char) ('a' + i);
                result.addAll(helper(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = (digit - 2) * 3 + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                result.addAll(helper(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = (digit - 2) * 3 + 1; i < (digit * 3) - 1; i++) {
                char ch = (char) ('a' + i);
                result.addAll(helper(p + ch, up.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                result.addAll(helper(p + ch, up.substring(1)));
            }
        }
        return result;
    }
}
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        String str2 = "[.]";
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                sb.append(str2);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String firstCap = "QWERTYUIOP";

        String second = "asdfghjkl";
        String secondCap = "ASDFGHJKL";

        String third = "zxcvbnm";
        String thirdCap = "ZXCVBNM";

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        HashSet<Character> set3 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set1.add(first.charAt(i));
            set1.add(firstCap.charAt(i));
        }

        for (int i = 0; i < 9; i++) {
            set2.add(second.charAt(i));
            set2.add(secondCap.charAt(i));
        }

        for (int i = 0; i < 7; i++) {
            set3.add(third.charAt(i));
            set3.add(thirdCap.charAt(i));
        }

        ArrayList<String> arraylist = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            boolean status = false;

            if (set1.contains(temp.charAt(0))) {
                for (int j = 1; j < temp.length(); j++) {

                    if (!set1.contains(temp.charAt(j))) {
                        status = true;
                        break;
                    }
                }
            } else if (set2.contains(temp.charAt(0))) {
                for (int j = 1; j < temp.length(); j++) {

                    if (!set2.contains(temp.charAt(j))) {
                        status = true;
                        break;
                    }
                }
            } else {
                for (int j = 1; j < temp.length(); j++) {
                    if (!set3.contains(temp.charAt(j))) {
                        status = true;
                        break;
                    }
                }
            }
            if (!status) {
                arraylist.add(temp);
            }
        }

        return arraylist.toArray(new String[0]);
    }
}
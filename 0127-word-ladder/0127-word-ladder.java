class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
         Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int length = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            length++;
            for (int i = 0; i < size; i++) {
                String c = q.poll();
                char[] temp = c.toCharArray();
                for (int j = 0; j < c.length(); j++) {
                    char originalChar = temp[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == originalChar)
                            continue;
                        temp[j] = ch;
                        String newWord = new String(temp);
                        if (newWord.equals(endWord)) {
                            return length + 1;
                        }

                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                    temp[j] = originalChar;
                }
            }
        }
        return 0;
    }
}
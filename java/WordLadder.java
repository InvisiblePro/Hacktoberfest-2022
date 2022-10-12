import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;

public class WordLadder {

    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) {
            return 0;
        }
        Queue<String> queue = new LinkedBlockingDeque<>();
        queue.add(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int changes = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                final String word = queue.poll();
                if (word.equals(endWord)) {
                    return changes;
                }
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 'a'; j <= 'z'; j++ ) {
                        final char[] arr = word.toCharArray();
                        arr[i] = (char) j;
                        String str = new String(arr);
                        if (set.contains(str) && !visited.contains(str)) {
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            changes++;
        }

        return -1;
    }
}

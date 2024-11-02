import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0; // Track the maximum length of the substring
        int left = 0;   // Left pointer of the window
        HashMap<Character, Integer> map = new HashMap<>(); // Maps character to its latest index

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map, move the left pointer
            // to the position right after the previous occurrence
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the character's latest index
            map.put(currentChar, right);

            // Calculate the max length of the substring without repeating characters
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}

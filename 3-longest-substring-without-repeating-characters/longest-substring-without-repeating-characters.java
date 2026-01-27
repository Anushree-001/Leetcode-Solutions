class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];   // frequency of characters (ASCII)
        int left = 0;                // start of window
        int maxLen = 0;              // answer

        // right = end of window
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            freq[c]++;               // add character to window

            // if duplicate appears, shrink window from left
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            // update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

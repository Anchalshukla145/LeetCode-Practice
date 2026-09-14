class Solution {
    public String minWindow(String s, String t) {
     if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int[] targetCounts = new int[128];
        for (char c : t.toCharArray()) {
            targetCounts[c]++;
        }
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        int requiredChars = t.length();
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (targetCounts[rightChar] > 0) {
                requiredChars--;
            }
            targetCounts[rightChar]--;
            right++;

          
            while (requiredChars == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                targetCounts[leftChar]++;

                
                if (targetCounts[leftChar] > 0) {
                    requiredChars++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);

}
}
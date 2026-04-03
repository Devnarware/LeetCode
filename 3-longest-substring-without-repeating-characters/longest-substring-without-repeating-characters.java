class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) {
            return s.length();
        }

        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int max = 0,
            sum = 0;

        while (j < s.length()) {
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i) {
                max = Math.max(max, sum);
                i = map.get(s.charAt(j)) + 1;
                sum = j - i;
                
            }
            map.put(s.charAt(j), j);
            sum++;
            j++ ;
        }
        max = Math.max(max, sum);
        return max;

    }
}
class Solution {
    public int maxVowels(String s, int k) {
        int currCount = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for(int i=0; i<k; i++) {
            if(vowels.contains(s.charAt(i))) {
                currCount++;
            }
        }

        int maxCount = currCount;

        for(int i=k; i<s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                currCount++;
            }

            if(vowels.contains(s.charAt(i-k))) {
                currCount--;
            }

            maxCount = Math.max(currCount, maxCount);

            if(maxCount == k) {
                return maxCount;
            }
        }

        return maxCount;
    }
} 
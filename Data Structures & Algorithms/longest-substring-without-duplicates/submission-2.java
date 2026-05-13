class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> indexes = new HashMap<>();

        int count = 0;; 
        int window = 0;

        int leftIndex = 0; 

        boolean FOUND = true;

        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++){
            char letter = letters[i];
            if (!indexes.containsKey(letter) || !indexes.get(letter)){
                indexes.put(letter, FOUND); // letter isn't found
                count++;
            } else {
                window = Math.max(window, count);

                for (int j = leftIndex; j < i; j++){
                    if (letters[j] == letters[i]){
                        leftIndex = j + 1;
                        break;
                    } else {
                        indexes.replace(letters[j], !FOUND);
                        count--;
                    }
                }

            }
        }

        window = Math.max(window, count);

    
        return window;
    }
}

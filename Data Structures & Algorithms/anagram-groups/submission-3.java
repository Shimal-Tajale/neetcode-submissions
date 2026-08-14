class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap<String, ArrayList<String>> keys = new HashMap<>();
        
        for (String word : strs){
            indexAnagram(word, keys);
        }

        List<List<String>> sol = new ArrayList();

        for (String key : keys.keySet()){
            sol.add(keys.get(key));
        }

        
        return sol;
        
    }

    private void indexAnagram(String word, HashMap<String, ArrayList<String>> keys){

        int[] wordBank = new int[26];
        for (char letter : word.toCharArray()){
            wordBank[letter - 'a']++;
        }

        String wordKey = Arrays.toString(wordBank);
        if (!keys.containsKey(wordKey)){
            keys.put(wordKey, new ArrayList<String>());
        }

        keys.get(wordKey).add(word);
        
    }


}

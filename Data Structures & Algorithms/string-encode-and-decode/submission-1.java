class Solution {

    public String encode(List<String> strs) {
        char divder = (char)257;
        StringBuilder finalString = new StringBuilder();
        for (String str : strs){
            finalString.append(str);
            finalString.append(divder);
        }

        return finalString.toString();
    }

    public List<String> decode(String str) {
        List<String> finalList = new ArrayList<>();
        char divder = (char)257;

        StringBuilder currentWord = new StringBuilder();

        for (char item : str.toCharArray()){
            if (item == divder){
                finalList.add(currentWord.toString());
                currentWord.setLength(0);
            } else{
                currentWord.append(item);
            }
        }
        
        return finalList;

    }
}

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       if(strs == null || strs.length == 0){
        return new ArrayList<>();
       }
       Map<String, List<String>> map = new HashMap<>();
       for(String word: strs){
        char[] CharArray = word.toCharArray();
        Arrays.sort(CharArray);
        String sortedKey = new String(CharArray);

        if(!map.containsKey(sortedKey)){
            map.put(sortedKey,new ArrayList<>());
        }
        map.get(sortedKey).add(word);

       }
       return new ArrayList<>(map.values());
    }}
package Ransom_Note_383;

public class OptimalSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] alphabet=new int[26];
        for(char myChar:magazine.toCharArray()){
            alphabet[myChar-'a']++;
        }
        for(char myChar:ransomNote.toCharArray()){
            if(alphabet[myChar-'a']==0){
                return false;
            }
            alphabet[myChar-'a']--;
        }
        return true;
    }
}

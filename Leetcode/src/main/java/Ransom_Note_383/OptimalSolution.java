package Ransom_Note_383;

public class OptimalSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){//aab ->magazine    aa->ransomNote
            return false;
        }
        int[] alphabet=new int[26];
        for(char myChar:magazine.toCharArray()){
            alphabet[myChar-'a']++; //charlarda toplama veya çıkarma işlemi yapma ascII ye karşılık gelir.
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

package Valid_Palindrome_125;

public class Solution {
  public boolean isPalindrome(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
    if(cleaned.length()==0 || cleaned.length()==1){
      return true;
    }
    cleaned=cleaned.toLowerCase();

    for(int i=0,j=cleaned.length()-1;i<cleaned.length()/2;i++){
      if(cleaned.charAt(i)!=cleaned.charAt(j)){
        return false;
      }
      j--;
    }
    return true;
  }
}

package ValidAnagram;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        Solution2 solution2=new Solution2();
        Solution3 solution3=new Solution3();

        //System.out.println(solution.isAnagram("anagramm","nagaram"));
        //System.out.println(solution2.isAnagram("anagram","nagaram"));
        //System.out.println(solution3.isAnagram("anagram","nagaram"));
        System.out.println(solution3.isAnagram("rat","cat"));




        /*
        String test="bcdea";
        char[] chars=test.toCharArray();
        Arrays.sort(chars);
        String sorted=new String(chars);

        System.out.println("test:"+test+"\nsort:"+sorted);

         */
    }
}

package String_Encode_and_Decode_NeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        List<String> list = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));
        solution.encode(list);
        String toDecode="4#neet4#code4#love3#you";
        solution.decode(toDecode);
    }
}

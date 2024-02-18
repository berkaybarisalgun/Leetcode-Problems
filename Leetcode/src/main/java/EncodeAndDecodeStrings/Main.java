package EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();

        ArrayList<String> list = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));


        System.out.println("encode islemi:"+solution.encode(list));
        System.out.println("decode islemi:"+solution.decode(solution.encode(list)));




    }
    }


package ValidSudoku_36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
     Set<String> exist=new HashSet<>();

     for(int i=0;i<9;i++){
         for(int j=0;j<9;j++){
             char num=board[i][j];
             if(num!='.'){
                 System.out.println(exist);
                 if(!exist.add(num+"at row"+i) ||
                         !exist.add(num+"at col"+j) ||
                         !exist.add(num+"at box"+i/3 + "-"+j/3)){
                     return false;
                 }
             }
         }
     }
     return true;
    }
}
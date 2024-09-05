package Two_Sum_II_167;

public class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int[] num=new int[2];

    for(int i=0;i<numbers.length-1;i++){   //2,7,11,15     i=0(2)    j=1(7)   2+7=9    i=0 j=2
      for(int j=i+1;j<numbers.length;j++){
        if(numbers[i]+numbers[j]==target){
          num[0]=i+1;
          num[1]=j+1;
        }
      }
    }
    return num;
  }


}

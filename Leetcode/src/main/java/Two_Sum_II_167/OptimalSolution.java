package Two_Sum_II_167;

public class OptimalSolution {


  public int[] twoSum(int[] numbers, int target) {
    int[] num=new int[2];
    int pointerA=0;
    int pointerB=numbers.length-1;

    while(pointerA<=pointerB){
      int sum=numbers[pointerA]+numbers[pointerB];

      if(sum>target){
        pointerB--;
      }
      else if(target>sum){
        pointerA++;
      }
      else{
        num[0]=pointerA+1;
        num[1]=pointerB+1;
        return num;
      }

    }
    System.out.println(num);
    return num;
  }

}

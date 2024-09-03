package Valid_Parentheses_20;

public class SolutionWithOutStack {

  public static boolean isValid(String s) {
    while(true){
      if(s.contains("()")){
        s=s.replace("()","");
      }
      else if(s.contains("[]")){
        s=s.replace("[]","");
      }
      else if(s.contains("{}")){
        s=s.replace("{}","");
      }
      else{
        return s.isEmpty();
      }
    }
  }

}

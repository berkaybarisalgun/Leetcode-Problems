package Valid_Parentheses_20;

import java.util.Stack;

public class SolutionMoreUnderstandable {

  public boolean isValid(String s){
    Stack<Character> stack=new Stack<>();

    for(char c:s.toCharArray()){
      if(c=='('||c=='['||c=='{'){
        stack.push(c);
      }
      else{
        if(stack.isEmpty()){
          return false;
        }
        char check=stack.peek();
        if((c==')'&&check=='(')||(c=='}'&&check=='{')||(c==']'&&check=='[')){
          stack.pop();
        }
        else{
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

}

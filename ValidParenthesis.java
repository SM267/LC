import java.util.*;
class ValidParenthesis {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')' && top!='('||ch==']' && top!='['||ch=='}' && top!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();
        ValidParenthesis sol = new ValidParenthesis();
        boolean result = sol.isValid(input);
        System.out.println(result);
    }
}


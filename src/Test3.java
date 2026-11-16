import java.util.Stack;

public class Test3 {
    public static void main(String[] args) {
        String s = "asds(asds[asds]asds{asds}asds)";
        System.out.println(isValid(s));
    }
    public  static  boolean isValid (String text){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            switch (c){
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '('){
                       stack.pop();
                    }else {
                        return  false;
                    }
                    break;
                case  ']':
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        return  false;
                    }
                    break;
                case  '}':
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else {
                        return  false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}

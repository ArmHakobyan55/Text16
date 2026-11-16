import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(65);
        list.add(32);
        list.add(13);
        Stack<Integer> stack = new Stack<>();
        for(Integer i: list){
            stack.push(i);
        }
        List<Integer> revers = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            revers.add(stack.pop());
        }
        System.out.println(list);
        System.out.println(revers);
        System.out.println(stack);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
//        System.out.println(stack);
    }
}

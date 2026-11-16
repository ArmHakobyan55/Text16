import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {
        HashSet<Integer> set  = new HashSet<>();
        set.add(4);
        set.add(53);
        set.add(98);
        set.add(21);
        set.add(32);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

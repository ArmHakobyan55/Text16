import model.Language;
import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) {
        HashMap<Integer, Language> map = new HashMap<>();
        map.put(1, new Language("One", "mek"));
        map.put(2, new Language("Twe", "etku"));
        map.put(3, new Language("Three", "ereq"));
        map.put(4, new Language("Fore", "chors"));
        map.put(5, new Language("Five","hing"));

        int x = 2, y = 3;
        System.out.println(map.get(x).en + " + " + map.get(y).en + " = " + map.get(x + y).en);
        System.out.println(map.get(x).hy + " + " + map.get(y).hy + " = " + map.get(x + y).hy);
    }
}

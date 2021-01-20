package collection;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", "b");
        map.put("d", "b");
        map.put("q", "b");
        map.put("y", "b");
        System.out.println(map);
    }
}

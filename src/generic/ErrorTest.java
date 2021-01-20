package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei.jiang
 * @since 2018/10/31
 */
public class ErrorTest {

    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            System.out.println("item = " + item);
        }
    }
}

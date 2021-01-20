package generic;

import generic.impl.GenericInterfaceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei.jiang
 * @since 2018/10/31
 */
public class JustProve {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("类型相同");
        }

        System.out.println(new GenericInterfaceImpl().next());
    }
}

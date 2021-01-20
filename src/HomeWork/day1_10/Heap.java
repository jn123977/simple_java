package HomeWork.day1_10;

import java.util.ArrayList;

public class Heap {

    static class XXX{

    }

    public static void main(String[] args) {
        //堆内存移出OutOfMemoryError

        ArrayList list=new ArrayList();
        while (true){
            list.add(new XXX());
        }
    }
}



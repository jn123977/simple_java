package io.fileTest;

import java.io.File;
import java.io.IOException;

/**
 * 判断文件夹中是否存在文件，如果存在将其删除，如果不存在就将其删除
 */
public class fileExists {
    public static void main(String[] args) {
        File file=new File("world.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已经删除了");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件已经存在了");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

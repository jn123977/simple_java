package io.fileTest;

import java.io.File;

public class fileMessage {
    public static void main(String[] args) {
        File file=new File("world.txt");
        if(file.exists()){
            String name=file.getName();
            long length=file.length();
            boolean hidden=file.isHidden();   //是否为隐藏文件
            System.out.println("文件名称:   "+name);
            System.out.println("文件长度:   "+length);  //英文1个字符，中文按编码格式
            System.out.println("是否为隐藏文件:    "+hidden);
        }else {
            System.out.println("文件不存在!");
        }
    }
}

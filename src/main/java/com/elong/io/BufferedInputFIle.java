package com.elong.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 创建人 : peierlong
 * 描述 :
 */
public class BufferedInputFIle {

    public static String read(String file) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s;
        StringBuffer sb = new StringBuffer();
        while ((s = bufferedReader.readLine()) != null){
            sb.append(s + "\n");
        }
        bufferedReader.close();
        return sb.toString();
    }
}

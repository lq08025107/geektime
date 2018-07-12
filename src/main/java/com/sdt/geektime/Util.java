package com.sdt.geektime;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Util {

    public final static String User_Agent = "iPhone8,1(iOS/11.4) GeekbangApp(Zeus/1.1.6) Weex/0.16.1 ExternalUA 750x1334";
    public final static String Content_Type = "application/json";
    public final static String Host = "time.geekbang.org";
    public final static String Accept_Encoding = "br, gzip, deflate";
    public final static String Connection = "keep-alive";
    public final static String Accept = "application/json, text/plain, */*";
    public final static String Refer = "https://time.geekbang.org/column/article/10603?device=geekTime.ios";
    public final static String Cookie = "your cookie";

    public final static String GEEKTIME_ROOT_URL = "https://time.geekbang.org";

    public final static String Articles_URL = "/serv/v1/column/articles";
    public final static String Article_URL = "/serv/v1/article";

    public final static String HTML_Header = "<html>";
    public final static String HTML_Footer = "</html>";

    public final static String Data_Path = "D:\\javaworkspace\\geektime\\data\\";

    public final static List<String> DO_NOT_USE = Arrays.asList("\\", "/", ":", "*", "?", "\"",  "<", ">", "|");

    public static String jugdeTitle(String title){
        String newTitle = title;
        for(int i = 0; i < DO_NOT_USE.size(); i++){

            String bad = DO_NOT_USE.get(i);
            if(title.contains(bad) == true){
                newTitle = newTitle.replace(bad, "");
            }
        }
        return newTitle == title ? title : newTitle;
    }
    public static void saveFile(String content, String path) {

        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(path);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        System.out.println(Util.jugdeTitle("12345"));
        System.out.println("123*45".replace("*", ""));
    }

}

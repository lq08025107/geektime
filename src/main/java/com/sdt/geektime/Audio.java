package com.sdt.geektime;

import okhttp3.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class Audio {
    private OkHttpClient okHttpClient;
    public Audio(){
        okHttpClient = new OkHttpClient();
    }
    public void download(String audioUrl, String path){
        File file = new File(path);
        if(file.exists()){file.delete();}
        else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStream is = null;
        FileOutputStream fos = null;
        try{
            Request request = new Request.Builder().url(audioUrl).build();
            Call call = okHttpClient.newCall(request);
            Response response = call.execute();
            byte[] buf = new byte[2048];
            int len = 0;
            is = response.body().byteStream();
            fos = new FileOutputStream(file);
            while((len = is.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
            fos.flush();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
                if(fos != null) fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args){
        Audio audio = new Audio();
        audio.download("https://res001.geekbang.org/resource/audio/37/eb/37043620aea394d126cb1bc07d9117eb.mp3", "E:\\test.mp3");
        System.out.println("download complete");
    }
}

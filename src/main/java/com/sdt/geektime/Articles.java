package com.sdt.geektime;

import com.google.gson.Gson;
import com.sdt.geektime.bean.ListSetting;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Articles {
    private String result = null;

    public String getArticleList(String columnId, int size, int prev, String order){
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS).build();

        ListSetting listSetting = new ListSetting();
        listSetting.setCid(columnId);
        listSetting.setSize(size);
        listSetting.setPrev(prev);
        listSetting.setOrder(order);

        Gson gson = new Gson();
        String listSettingJson = gson.toJson(listSetting);
        System.out.println(listSettingJson);
        RequestBody body = FormBody.create(MediaType.parse("text"), listSettingJson);
        String URL = Util.GEEKTIME_ROOT_URL + Util.Articles_URL;
        System.out.println(URL);
        Request request = new Request.Builder().url(URL).
                addHeader("X-GEEK-OS-VER", "11.4").
                addHeader("Ticket", "BAYE5_53jAQEIBwAAAcETk5hjQME5UZEWwkBAQgBAQsCBAABBBGdEQAKBAEAAAAFBIDGEwACBPoYRFsMAQE-").
                addHeader("X-GEEK-VER-NAME", "1.1.6").
                addHeader("Host", "time.geekbang.org").
                addHeader("X-GEEK-APP-NAME", "time").
                addHeader("X-GEEK-DEVICE-MODEL", "iPhone8,1").
                addHeader("Accept", "*/*").
                addHeader("Device-Id", "5C126548-3698-47D9-82A6-AF4F5717BA4C").
                addHeader("Device-Token", "d4d1e6264f91bd2f52c5911486eacbf8aefc5107d46e38fc9242c03c33890d95").
                addHeader("Accept-Language", "zh-cn").
                addHeader("Accept-Encoding", "br, gzip, deflate").
                addHeader("Content-Type", "application/json").
                //addHeader("Content-Length", "48").
                addHeader("User-Agent", "iPhone8,1(iOS/11.4) GeekbangApp(Zeus/1.1.6) Weex/0.16.1 ExternalUA 750x1334").
                addHeader("X-GEEK-OS-PLATFORM", "iOS").
                addHeader("Referer", "http://www.geekbang.org/").
                addHeader("X-GEEK-OS-NAME", "iOS").
                addHeader("Connection", "keep-alive").
                addHeader("Cookie", "your cookie").
                post(body).build();
//        Request request = new Request.Builder().url("https://www.baidu.com/").build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            result = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        call.enqueue(new Callback() {
//            public void onFailure(Call call, IOException e) {
//                System.out.println("连接失败");
//            }
//
//            public void onResponse(Call call, Response response) throws IOException {
//                result = response.body().string();
//            }
//        });

        return result;
    }
    public static void main(String[] args){
        //System.out.println(new Articles().getArticleList());
    }
}

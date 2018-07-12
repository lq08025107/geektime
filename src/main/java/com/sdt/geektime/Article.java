package com.sdt.geektime;

import com.google.gson.Gson;
import com.sdt.geektime.bean.ArticleSetting;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Article {
    private String result = null;

    public String getArticleSetting(String id){
        ArticleSetting articleSetting = new ArticleSetting();
        articleSetting.setId(id);
        Gson gson = new Gson();
        String articleSettingJson = gson.toJson(articleSetting);
        return articleSettingJson;
    }

    public String getArticle(String articleId){
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS).build();


        RequestBody body = FormBody.create(MediaType.parse("text"), getArticleSetting(articleId));
        String URL = Util.GEEKTIME_ROOT_URL + Util.Article_URL;
        Request request = new Request.Builder().url(URL).
                addHeader("Host", "time.geekbang.org").
                addHeader("Accept", "*/*").
                addHeader("Accept-Language", "zh-cn").
                addHeader("Accept-Encoding", "br, gzip, deflate").
                addHeader("Content-Type", "application/json").
                addHeader("User-Agent", "iPhone8,1(iOS/11.4) GeekbangApp(Zeus/1.1.6) Weex/0.16.1 ExternalUA 750x1334").
                addHeader("Referer", "http://www.geekbang.org/").
                addHeader("Connection", "keep-alive").
                addHeader("Cookie", "your cookie").
                post(body).build();

        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            result = response.body().string();
            System.out.println("获取" + articleId + " 号文章成功");
        } catch (IOException e) {
            System.out.println("！！！！获取" + articleId + " 号文章失败！！！！");
        }

        return result;
    }
    public static void main(String[] args){
        System.out.println(new Article().getArticle("10603"));
    }
}

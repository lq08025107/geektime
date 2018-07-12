package com.sdt.geektime;

import com.google.gson.Gson;
import com.sdt.geektime.bean.ArticleBean;
import com.sdt.geektime.bean.ColumnListBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Articles articles = new Articles();
        String columnList = articles.getArticleList("48", 99, 0, "newest");
        Gson gson = new Gson();
        ColumnListBean columnListBean = gson.fromJson(columnList, ColumnListBean.class);
        int articleCount = columnListBean.getData().getList().size();

        Article article = new Article();
        List<ArticleBean> articleList = new ArrayList<ArticleBean>();
        Map<String, String> audioUrlMap = new HashMap<String, String>();

        for(int i = 0; i < articleCount; i++){
            String articleString = article.getArticle(String.valueOf(columnListBean.getData().getList().get(i).getId()));

            ArticleBean articleBean = gson.fromJson(articleString, ArticleBean.class);
            articleList.add(articleBean);
        }
        Audio audio = new Audio();
        for(int i = 0; i < articleList.size(); i++){
            String articleTitle = articleList.get(i).getData().getArticle_title();
            String articleContent = articleList.get(i).getData().getArticle_content();
            String articleContentHtml = Util.HTML_Header + articleContent + Util.HTML_Footer;

            String audioUrl = articleList.get(i).getData().getAudio_download_url();

            articleTitle = Util.jugdeTitle(articleTitle);
            String path = Util.Data_Path + articleTitle + ".html";
            String audioPath = Util.Data_Path + articleTitle + ".mp3";
            audioUrlMap.put(articleTitle, audioUrl);
            Util.saveFile(articleContentHtml, path);
            System.out.println(articleTitle + " 保存成功");
            if(audioUrl.equals("")){
                System.out.println(articleTitle + " 没有音频");
            }
            else{
                audio.download(audioUrl, audioPath);
                System.out.println(articleTitle + " mp3保存成功");
            }

        }
        System.out.println("");
    }
}

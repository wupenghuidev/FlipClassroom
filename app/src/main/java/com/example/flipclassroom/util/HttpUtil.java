package com.example.flipclassroom.util;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * Created by WPH on 2019/3/6.
 * 创建和服务器交互类
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

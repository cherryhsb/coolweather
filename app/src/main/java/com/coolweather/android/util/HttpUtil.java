package com.coolweather.android.util;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ssc on 2018/3/15.
 */

public class HttpUtil {

    //向服务器get数据
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();//客户端
        Request request = new Request.Builder().url(address).build();//请求
        Call call = client.newCall(request);//发起请求
        call.enqueue(callback);//排队,异步执行
    }
}

package club.xianfu;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建一个客户端

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().url("http://www.baidu.com").build();
        //发送请求
        Response response = okHttpClient.newCall(request).execute();
        String result= response.body().string();
        System.out.println(result);
    }
}

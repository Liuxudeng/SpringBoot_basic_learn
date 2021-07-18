package club.xianfu.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class HttpUtil {
    public static String sendGetRequest(String url) {
        //创建一个客户端

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();
        //发送请求

        String result= null;
        try {Response response = okHttpClient.newCall(request).execute();
            result = response.body().string();
            return result;
        } catch (IOException ex) {
           throw new RuntimeException(ex);
        }

    }
}

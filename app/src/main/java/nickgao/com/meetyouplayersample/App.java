package nickgao.com.meetyouplayersample;

import android.app.Application;

import com.meetyou.crsdk.util.ImageLoader;
import com.meetyou.media.player.client.MeetyouPlayerEngine;

import okhttp3.OkHttpClient;

/**
 * Created by Linhh on 16/12/27.
 */

public class App extends Application{

    public static OkHttpClient mHttpClient;

    @Override
    public void onCreate() {
        super.onCreate();
        mHttpClient = new OkHttpClient.Builder().build();
        MeetyouPlayerEngine.Instance().init(this,true);
        ImageLoader.initialize(this, false);

    }
}

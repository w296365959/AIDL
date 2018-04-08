package github.wzm.com.myaidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Okline(Hangzhou)co,Ltd<br/>
 * Author: wangzhongming<br/>
 * Email:  wangzhongming@okline.cn</br>
 * Date :  2018/4/4 15:55 </br>
 * Summary:
 */

public class RemoteService extends Service {
    public static final String TAG = RemoteService.class.getSimpleName();
    private MyBinder mMyBinder;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        mMyBinder = null;
        mMyBinder = new MyBinder();

        return mMyBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate:RemoteService ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onCreate:RemoteService ");
        return super.onStartCommand(intent, flags, startId);
    }
}










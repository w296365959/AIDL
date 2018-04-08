package github.wzm.com.myaidl;

import android.os.RemoteException;
import android.util.Log;

/**
 * Okline(Hangzhou)co,Ltd<br/>
 * Author: wangzhongming<br/>
 * Email:  wangzhongming@okline.cn</br>
 * Date :  2018/4/4 15:48 </br>
 * Summary:
 */

public class MyBinder extends MyRemoteService.Stub {
    public static final String TAG=MyBinder.class.getSimpleName();
    @Override
    public void getBookName() throws RemoteException {
        //具体实现
        Log.i(TAG, "getBookName: 这里是服务端的具体实现，得到书名 小莫历险记");
    }

    @Override
    public void setBookNumber(int number) throws RemoteException {
        //具体实现
        Log.i(TAG, "setBookNumber: 这里是服务端的具体实现，得到数量   "+number);
    }
}














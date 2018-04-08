package github.wzm.com.myaidl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*    Intent intent = new Intent(this, RemoteService.class);
        startService(intent);*/
    }
}

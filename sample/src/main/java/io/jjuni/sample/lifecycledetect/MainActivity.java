package io.jjuni.sample.lifecycledetect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.jjuni.library.lifecycledetect.LifecycleDetectActivity;

public class MainActivity extends LifecycleDetectActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}

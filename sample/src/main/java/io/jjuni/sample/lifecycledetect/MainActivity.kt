package io.jjuni.sample.lifecycledetect

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.lifecycle.ViewModelProviders
import io.jjuni.library.lifecycledetect.LifecycleDetectActivity

class MainActivity : LifecycleDetectActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register(viewModel)
    }

}

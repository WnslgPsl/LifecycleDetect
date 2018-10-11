package io.jjuni.sample.lifecycledetect

import android.util.Log
import androidx.lifecycle.ViewModel
import io.jjuni.library.lifecycledetect.LifecycleCallback
import io.jjuni.library.lifecycledetect.LifecycleEvent

/**
 * Created by Jo on 2018. 10. 12.
 */

class MainViewModel : ViewModel(), LifecycleCallback {

    override fun apply(event: LifecycleEvent) {
        when (event) {
            LifecycleEvent.ON_CREATED -> onViewCreate()
            LifecycleEvent.ON_STARTED -> onViewStart()
            LifecycleEvent.ON_RESUMED -> onViewResume()
            LifecycleEvent.ON_PAUSED -> onViewPause()
            LifecycleEvent.ON_STOPPED -> onViewStop()
            LifecycleEvent.ON_DESTROYED -> onViewDestroy()
        }
    }

    override fun onCleared() {
        super.onCleared()
    }

    private fun onViewCreate() {
        // ...
    }

    private fun onViewStart() {
        // ...
    }

    private fun onViewResume() {
        // ...
    }

    private fun onViewPause() {
        // ...
    }

    private fun onViewStop() {
        // ...
    }

    private fun onViewDestroy() {
        // ...
    }
}
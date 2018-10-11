package io.jjuni.library.lifecycledetect

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Jo on 2018. 10. 11.
 */

open class LifecycleDetectActivity : AppCompatActivity() {

    private val lifecycleOwner : LifecycleOwner = LifecycleOwner()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        notifyEvent(LifecycleEvent.ON_CREATED)
    }

    override fun onStart() {
        super.onStart()
        notifyEvent(LifecycleEvent.ON_STARTED)
    }

    override fun onResume() {
        super.onResume()
        notifyEvent(LifecycleEvent.ON_RESUMED)
    }

    override fun onPause() {
        super.onPause()
        notifyEvent(LifecycleEvent.ON_PAUSED)
    }

    override fun onStop() {
        super.onStop()
        notifyEvent(LifecycleEvent.ON_STOPPED)
    }

    override fun onDestroy() {
        super.onDestroy()
        notifyEvent(LifecycleEvent.ON_DESTROYED)
    }

    open fun register(callback : LifecycleCallback) {
        lifecycleOwner.register(callback)
    }

    open fun unregister(callback : LifecycleCallback) {
        lifecycleOwner.unregister(callback)
    }

    private fun notifyEvent(event : LifecycleEvent) {
        lifecycleOwner.notifyEvent(event)
    }
}
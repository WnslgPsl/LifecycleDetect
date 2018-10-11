package io.jjuni.library.lifecycledetect

/**
 * Created by Jo on 2018. 10. 11.
 */

interface LifecycleCallback {
    fun apply(event: LifecycleEvent)
}
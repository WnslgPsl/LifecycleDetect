package io.jjuni.library.lifecycledetect

/**
 * Created by Jo on 2018. 10. 11.
 */

class LifecycleOwner {

    private val callbacks = mutableListOf<LifecycleCallback>()
    private var lastEvent : LifecycleEvent = LifecycleEvent.ON_CREATED

    fun register(callback : LifecycleCallback) {
        callback.apply(lastEvent)
        callbacks.add(callback)
    }

    fun unregister(callback : LifecycleCallback) {
        callbacks.remove(callback)
    }

    fun notifyEvent(event : LifecycleEvent) {
        callbacks.forEach { it.apply(event) }
    }

}
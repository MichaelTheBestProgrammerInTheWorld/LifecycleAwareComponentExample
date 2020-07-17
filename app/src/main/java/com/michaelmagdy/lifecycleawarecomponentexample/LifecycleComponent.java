package com.michaelmagdy.lifecycleawarecomponentexample;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class LifecycleComponent implements LifecycleObserver {

    private final String activityName;
    public static final String TAG = "lifecycle_tag";

    public LifecycleComponent(String activityName) {
        this.activityName = activityName;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected void onCreate() {

        Log.i(TAG, activityName + "  onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onStart() {

        Log.i(TAG, activityName + "  onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected void onResume() {

        Log.i(TAG, activityName + "  onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    protected void onPause() {

        Log.i(TAG, activityName + "  onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    protected void onStop() {

        Log.i(TAG, activityName + "  onStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected void onDestroy() {

        Log.i(TAG, activityName + "  onDestroy");
    }
}

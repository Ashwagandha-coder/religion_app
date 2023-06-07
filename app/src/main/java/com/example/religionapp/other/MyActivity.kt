package com.example.religionapp

import android.app.Activity
import android.app.ActivityManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Intent
import android.os.Binder
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.MessageQueue
import android.os.Parcel
import android.os.Parcelable
import android.view.Choreographer
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.RecyclerView
import com.example.religionapp.ui.activity.MainActivity
import java.util.concurrent.Callable
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicIntegerArray
import javax.net.ssl.X509TrustManager

class MyActivity : AppCompatActivity() {

    private val lifecycle: Lifecycle
    private val lifecycleObserver: LifecycleObserver


    private lateinit var activityRecord: ActivityRecord
    private lateinit var activityMangerService: ActivityManager
    private lateinit var activity: Activity
    private lateinit var task: TaskStackBuilder
    private lateinit var iBinder: IBinder
    private lateinit var system: System
    private val binder: Binder

    private val fragment: Fragment
    private val handler: Handler
    private val looper: Looper
    private val messageQueue: MessageQueue

    private val recyclerView: RecyclerView
    private val glide_cacheStrategy: Glide


    private lateinit var choreographer: Choreographer
    private lateinit var intent: Intent
    private lateinit var pendingIntent: PendingIntent

    private lateinit var x509TrustManager: X509TrustManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num = 1
        val obj = MyAny()

        savedInstanceState?.putInt("num", 1)
        savedInstanceState?.putParcelable("obj", obj)
    }

    fun test() {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    fun otherTest() {
        val param = viewModelStore

    }


}

class MyAny() : Parcelable {


    constructor(parcel: Parcel) : this() {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<MyAny> {
        override fun createFromParcel(parcel: Parcel): MyAny {
            return MyAny(parcel)
        }

        override fun newArray(size: Int): Array<MyAny?> {
            return arrayOfNulls(size)
        }
    }
}
package com.example.religionapp.other

import java.lang.ref.SoftReference
import java.lang.ref.WeakReference
import java.util.*
import java.util.concurrent.atomic.AtomicLong

class TestReference {

    fun make() {

        val any = Any()

        val reference: WeakReference<Any> = WeakReference<Any>(any)
        val softReference = SoftReference<Any>(any)


    }

    fun phantom() {}

    fun weak() {}

    fun soft() {}

    fun strong() {}

    fun queue() {}

    fun method() {

        val myObject = Object()
        val atomicLong = AtomicLong()

    }


    fun stack() {

        val stack: Stack<Int> = Stack()
        val vector: Vector<Int> = Vector()

    }


}
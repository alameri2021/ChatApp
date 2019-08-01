package com.artf.chatapp

import android.app.Application
import com.google.firebase.database.FirebaseDatabase


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}
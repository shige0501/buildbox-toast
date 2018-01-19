package net.buildbox.sample.buildbox_toast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.buildbox.sample.buildbox_toast.extension.showToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast("テストメッセージ")
    }
}

package net.buildbox.sample.buildbox_toast.extension

import android.content.Context
import android.widget.Toast

fun Context.showToast(text: CharSequence) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
package net.buildbox.sample.buildbox_toast.misc

import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

fun Context.showToast(text: CharSequence) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

fun Context.showToast(@StringRes res: Int) =
    Toast.makeText(this, res, Toast.LENGTH_SHORT).show()
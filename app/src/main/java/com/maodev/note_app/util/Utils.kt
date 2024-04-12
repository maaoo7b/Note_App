package com.maodev.note_app.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("EEE, d MMM yyyy - hh:mm:ss aaa", Locale.getDefault())
    return format.format(date)
}
package com.example.fragment_library

import android.widget.TextView

class SetText {


    companion object {
        fun setText (textView: TextView, text: String){
            textView.text = text
        }
    }
}
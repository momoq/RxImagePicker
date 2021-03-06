package com.qingmei2.rximagepicker_extension_wechat.ui.widget

import android.content.Context
import android.support.v7.widget.ListPopupWindow
import android.view.View
import android.widget.AdapterView

import com.qingmei2.rximagepicker_extension.ui.widget.AlbumsSpinner

class WechatAlbumsSpinner(context: Context) : AlbumsSpinner() {

    init {
        mListPopupWindow = ListPopupWindow(context)
        mListPopupWindow.isModal = true

        mListPopupWindow.setContentWidth(context.resources.displayMetrics.widthPixels)
        mListPopupWindow.setOnItemClickListener { parent, view, position, id ->
            this@WechatAlbumsSpinner.onItemSelected(parent.context, position)
            if (mOnItemSelectedListener != null) {
                mOnItemSelectedListener!!.onItemSelected(parent, view, position, id)
            }
        }
    }
}

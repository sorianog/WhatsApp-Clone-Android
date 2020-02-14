package com.example.whatsappclone.ui.channel_list

import android.view.LayoutInflater
import android.view.ViewGroup
import com.getstream.sdk.chat.MarkdownImpl
import com.getstream.sdk.chat.adapter.BaseChannelListItemViewHolder
import com.getstream.sdk.chat.adapter.ChannelListItemAdapter
import com.getstream.sdk.chat.adapter.ChannelViewHolderFactory
import com.getstream.sdk.chat.model.Channel

class CustomViewHolderFactory : ChannelViewHolderFactory() {

    override fun createChannelViewHolder(
        adapter: ChannelListItemAdapter,
        parent: ViewGroup,
        viewType: Int
    ): BaseChannelListItemViewHolder? {
        val style = adapter.style
        val v = LayoutInflater.from(parent.context).inflate(style.channelPreviewLayout, parent, false)
        val holder = CustomChannelListItemViewHolder(v)
        configureHolder(holder, adapter)
        return holder
    }
}
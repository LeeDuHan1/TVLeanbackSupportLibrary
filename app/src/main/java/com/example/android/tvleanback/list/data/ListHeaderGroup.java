package com.example.android.tvleanback.list.data;

import android.text.TextUtils;

import com.example.android.tvleanback.list.ContentTypeManager;

import java.util.ArrayList;

public class ListHeaderGroup extends Group {
    @Override
    public int getViewType() {
        if (TextUtils.isEmpty(getTitle())) {
            return ContentTypeManager.LIST_HEADER;
        } else {
            return ContentTypeManager.LIST_EMPTY_HEADER;
        }
    }

    public ListHeaderGroup() {
        setContents(new ArrayList<Content>());
    }
}
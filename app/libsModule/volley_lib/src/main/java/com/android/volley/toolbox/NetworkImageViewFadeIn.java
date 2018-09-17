package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;

import com.android.volley.toolbox.NetworkImageView;

/**
 * 벨리 NetworkImageView사용
 * 에니메이션 추가
 * 
 * @Author : sanghyoun
 * @Since : 2014. 8. 14.
 */
public class NetworkImageViewFadeIn extends NetworkImageView {
    private static final int FADE_IN_TIME_MS = 250;

    public NetworkImageViewFadeIn(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public NetworkImageViewFadeIn(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public NetworkImageViewFadeIn(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void setImageBitmap(Bitmap bitmap, boolean isImmediate) {
        if(isImmediate) {
            setImageBitmap(bitmap);
        }
        else {
            TransitionDrawable td = new TransitionDrawable(new Drawable[] {
                    new ColorDrawable(android.R.color.transparent), 
                    new BitmapDrawable(getContext().getResources(), bitmap)
            });
            setImageDrawable(td);
            td.startTransition(FADE_IN_TIME_MS);
        }
    }
}

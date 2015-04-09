package com.tweetlanes.android.core.widget.urlimageviewhelper;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class UrlLruCache extends LruCache<String, BitmapDrawable> {
    public UrlLruCache(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int sizeOf(BitmapDrawable value) {
        if (value != null) {
            Bitmap b = value.getBitmap();
            if (b != null)
                return b.getRowBytes() * b.getHeight();
        }
        return 0;
    }
}

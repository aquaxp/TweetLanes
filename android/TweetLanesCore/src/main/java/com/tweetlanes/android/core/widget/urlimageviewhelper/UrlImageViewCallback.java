package com.tweetlanes.android.core.widget.urlimageviewhelper;

import android.graphics.drawable.Drawable;

/**
 * Callback that is invoked with a success/failure after attempting to
 * load a drawable from an url.
 * Note: If an ImageView has multiple setUrlDrawable calls made on it, only the last callback
 * will be invoked. This scenario arises when using ListViews which recycle their views.
 * This is done to prevent callbacks from being erroneosly invoked on ImageViews that are no
 * longer interested in the url that was loaded.
 * To guarantee a callback is invoked, one can do the following:
 * First call loadUrlDrawable (with a callback), and then setUrlDrawable. Both loads just get queued into the same request,
 * so you don't need to worry about that being inefficient or that it is making two network calls.
 *
 * @author koush
 */
public interface UrlImageViewCallback {
    /**
     * @param loadedFromCache This will indicate whether the load operation result came from cache, or was retrieved.
     * @param loadedDrawable  The drawable that was loaded by the request.
 *                        If the drawable failed to load, this will be null.
     */
    void onLoaded(Drawable loadedDrawable);
}

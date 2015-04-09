package com.tweetlanes.android.core.widget.urlimageviewhelper;

import android.content.Context;

import java.io.InputStream;

public interface UrlDownloader {
    interface UrlDownloaderCallback {
        void onDownloadComplete(UrlDownloader downloader, InputStream in, String filename);
    }

    void download(Context context, String url, UrlDownloaderCallback callback, Runnable completion);

    boolean doNotCache();

    boolean canDownloadUrl(String url);
}
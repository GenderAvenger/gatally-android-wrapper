package com.genderavenger.gatally;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.net.Uri;

public abstract class TallyWebViewC extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        if (Uri.parse(url).getHost().equals("app.genderavenger.com")) //replace this with the url for your website
            return false;
        return false;
        //launchExternalBrowser(url);
        //return true;
    }

    public abstract void launchExternalBrowser(String url);
}
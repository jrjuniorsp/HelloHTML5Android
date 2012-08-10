package com.jairrillo.hellohtml5;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class HelloHTML5Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView web = (WebView) findViewById(R.id.webView);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setSupportZoom(false);
        settings.setPluginsEnabled(true);
        
        //Main page
        web.loadUrl("file:///android_asset/index.html");
    }
}
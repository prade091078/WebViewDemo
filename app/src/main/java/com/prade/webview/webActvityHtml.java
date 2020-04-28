package com.prade.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webActvityHtml extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_actvity_html);

        WebView webView = (WebView)findViewById(R.id.webViewHtml);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        webView.loadData("<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>HTML Images</h2>\n" +
                "<p>HTML images are defined with the img tag:</p>\n" +
                "\n" +
                "<img src=\"w3schools.jpg\" alt=\"W3Schools.com\" width=\"104\" height=\"142\">\n" +
                "\n" +
                "</body>\n" +
                "</html>\n","text/html","UTF-8");

    }
}

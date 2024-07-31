package com.example.thanking_skills.Activites;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.thanking_skills.R;

public class Html_Contents extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_contents);

        webView = findViewById(R.id.webview1);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        // int condition = getIntent().getIntExtra("key", 0); // Default to -1 if no key provided
        // Load HTML files based on conditions
        int pos = getIntent().getIntExtra("key", 0);
        if (pos == 0) {
            webView.loadUrl("file:///android_asset/thinking_files.html");
        } else if (pos == 1) {
            webView.loadUrl("file:///android_asset/what _are_thinking_skills.html");
        } else if (pos == 2) {
            webView.loadUrl("file:///android_asset/possitive_thinking.html");
        } else if (pos == 3) {
            webView.loadUrl("file:///android_asset/improve_your_memory.html");
        } else if (pos == 4) {
            webView.loadUrl("file:///android_asset/Blocks_of_thinking.html");
        } else if (pos == 5) {
            webView.loadUrl("file:///android_asset/logical_thinking.html");
        } else if (pos == 6) {
            webView.loadUrl("file:///android_asset/creative_thinking.html");
        } else if (pos == 7) {
            webView.loadUrl("file:///android_asset/brainstorming.html");
        } else if (pos == 8) {
            webView.loadUrl("file:///android_asset/decision_taking.html");
        } else if (pos == 9) {
            webView.loadUrl("file:///android_asset/problem_solving.html");
        } else if (pos == 10) {
            webView.loadUrl("file:///android_asset/innovation.html");
        } else {
            Toast.makeText(this, "No content available for the selected item", Toast.LENGTH_SHORT).show();
        }
    }
}

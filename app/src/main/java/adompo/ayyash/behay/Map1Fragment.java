package adompo.ayyash.behay;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Map1Fragment extends Fragment {

    WebView mWebView;

    public Map1Fragment newInstance() {
        Map1Fragment fragment = new Map1Fragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map1, container, false);
        // Inflate the layout for this fragment
        mWebView = (WebView) rootView.findViewById(R.id.webview);
        mWebView.loadUrl("https://goo.gl/maps/zMeB4wkcNGr");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
        return rootView;
    }

}

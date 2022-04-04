package com.guercif.arzone.ui.android;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.guercif.arzone.R;
import com.guercif.arzone.WebViewController;

public class Android extends Fragment {

    private AndroidViewModel androidViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       androidViewModel = new ViewModelProvider(this).get(AndroidViewModel.class);
        WebView mywebview;
        View root = inflater.inflate(R.layout.android_fragment,container,false);
        mywebview = root.findViewById(R.id.web_android);

        mywebview.loadUrl("https://guercifzone-ar.blogspot.com/search/label/Android?&max-results=9");
        mywebview.setWebViewClient(new WebViewController());
        return root;


    }


}
package com.guercif.arzone.ui.computer;

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

public class Computer extends Fragment {

    private ComputerViewModel computerViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        computerViewModel = new ViewModelProvider(this).get(ComputerViewModel.class);
        WebView mywebview;
        View root = inflater.inflate(R.layout.computer_fragment,container,false);
        mywebview = root.findViewById(R.id.web_computer);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.loadUrl("https://guercifzone-ar.blogspot.com/search/label/Computers?&max-results=9");
        mywebview.setWebViewClient(new WebViewController());
        return root;
    }
}
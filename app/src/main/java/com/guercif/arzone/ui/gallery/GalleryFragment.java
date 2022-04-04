package com.guercif.arzone.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.guercif.arzone.R;
import com.guercif.arzone.WebViewController;
import com.guercif.arzone.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        WebView mywebview;
     View root = inflater.inflate(R.layout.fragment_gallery,container,false);
   mywebview = root.findViewById(R.id.Web_gallery);
        mywebview.getSettings().setJavaScriptEnabled(true);
   mywebview.loadUrl("https://guercifzone-ar.blogspot.com/search/label/Programing?&max-results=9");
   mywebview.setWebViewClient(new WebViewController());
   return  root;
    }
}
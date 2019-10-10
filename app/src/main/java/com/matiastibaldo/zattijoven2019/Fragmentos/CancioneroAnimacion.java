package com.matiastibaldo.zattijoven2019.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;
import com.matiastibaldo.zattijoven2019.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CancioneroAnimacion extends Fragment {


    public CancioneroAnimacion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.cancionero_animacion, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();

        PDFView pdfView = (PDFView) getView().findViewById(R.id.pdfViewCancioneroAnimacion);
        pdfView.fromAsset("Cancionero Animacion Zatti Normal.pdf")
                .enableSwipe(true) // allows to block changing pages using swipe
                .enableDoubletap(true)
                .defaultPage(0)
                .enableAnnotationRendering(false) // render annotations (such as comments, colors or forms)
                .password(null)
                .enableAntialiasing(true) // improve rendering a little bit on low-res screens
                // spacing between pages in dp. To define spacing color, set view background
                .spacing(0)
                .load();
    }

}

package com.example.helloarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.Node;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;

public class MainActivity extends AppCompatActivity {
    private ModelRenderable andyRenderable;
    private ArFragment arFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arfragment);
        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {

            Anchor anchor = hitResult.createAnchor();
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//                ModelRenderable.builder()
//                        .setSource(this, Uri.parse("ArcticFox_Posed.sfb"))
//                        .build()
//                        .thenAccept(modelRenderable -> )
//
//
//            }

        });

    }}

//        ModelRenderable.builder()
//                .setSource(this, R.raw.andy)
//                .build()
//                .thenAccept(renderable -> andyRenderable = renderable)
//                .exceptionally(
//                        throwable -> {
//                            Log.e("TAG", "Unable to load Renderable.", throwable);
//                            return null;
//                        });
//
//        Node node = new Node();
//        node.setParent(arFragment.getArSceneView().getScene());
//        node.setRenderable(andyRenderable);
 //   }

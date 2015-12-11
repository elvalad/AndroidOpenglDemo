package com.example.app.opengldemo.TutorialPart6;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by Administrator on 2015/12/11.
 */
public class TutorialPart6 extends Activity {

    private static int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        final GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        final OpenGLTriangle openGLTriangle = new OpenGLTriangle(0);
        glSurfaceView.setRenderer(new OpenGLRender(openGLTriangle));
        glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
        glSurfaceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                switch (count % 3) {
                    case 0:
                        openGLTriangle.setMode(0);
                        break;
                    case 1:
                        openGLTriangle.setMode(1);
                        break;
                    case 2:
                        openGLTriangle.setMode(2);
                        break;
                }
                glSurfaceView.requestRender();
            }
        });
        setContentView(glSurfaceView);
    }
}

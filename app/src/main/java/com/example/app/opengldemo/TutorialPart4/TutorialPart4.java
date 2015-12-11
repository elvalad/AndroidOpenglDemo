package com.example.app.opengldemo.TutorialPart4;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Administrator on 2015/12/10.
 */
public class TutorialPart4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setRenderer(new OpenGLRender(new OpenGLPoint()));
        setContentView(glSurfaceView);
    }
}

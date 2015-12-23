package com.example.app.opengldemo.TutorialPart2;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Administrator on 2015/12/1.
 */
public class TutorialPart2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setRenderer(new OpenGLRender());
        setContentView(glSurfaceView);
    }
}

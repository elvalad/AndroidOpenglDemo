package com.example.app.opengldemo.TutorialPart7;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by Administrator on 2015/12/23.
 */
public class TutorialPart7 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        final GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        final OpenGLIcosa openGLIcosa = new OpenGLIcosa();
        glSurfaceView.setRenderer(new OpenGLRender(openGLIcosa));
        setContentView(glSurfaceView);
    }
}

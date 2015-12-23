package com.example.app.opengldemo.TutorialPart7;

import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2015/12/23.
 */
public class OpenGLRender implements GLSurfaceView.Renderer {
    private OpenGLIcosa openGLIcosa;
    public OpenGLRender(OpenGLIcosa openGLIcosa) {
        this.openGLIcosa = openGLIcosa;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // set the background color to black
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f);
        // Enable Smooth Shading, default not really needed
        gl.glShadeModel(GL10.GL_SMOOTH);
        // Depth buffer setup
        gl.glClearDepthf(1.0f);
        // Enable depth testing
        gl.glEnable(GL10.GL_DEPTH_TEST);
        // The type of depth testing to do
        gl.glDepthFunc(GL10.GL_LEQUAL);
        // Really nice perspective calculations
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();
        GLU.gluPerspective(gl, 45.0f, (float) width / (float) height, 0.1f, 100.0f);
        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        if (null != openGLIcosa) {
            openGLIcosa.drawIcosa(gl);
        }
    }
}

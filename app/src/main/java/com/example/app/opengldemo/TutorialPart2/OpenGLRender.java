package com.example.app.opengldemo.TutorialPart2;

import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2015/12/1.
 */
public class OpenGLRender implements GLSurfaceView.Renderer {
    private Square square = new Square();

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // 设置背景色
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.5f);
        // 开启 Smooth Shading
        gl.glShadeModel(GL10.GL_SMOOTH);
        // 设置 Depth buffer
        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);
        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // Sets the current view port to the new size.
        gl.glViewport(0, 0, width, height);// OpenGL docs.
        // Select the projection matrix
        gl.glMatrixMode(GL10.GL_PROJECTION);// OpenGL docs.
        // Reset the projection matrix
        gl.glLoadIdentity();// OpenGL docs.
        // Calculate the aspect ratio of the window
        GLU.gluPerspective(gl, 45.0f, (float) width / (float) height, 0.1f, 100.0f);
        // Select the modelview matrix
        gl.glMatrixMode(GL10.GL_MODELVIEW);// OpenGL docs.
        // Reset the modelview matrix
        gl.glLoadIdentity();// OpenGL docs.
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(0, 0, -20);

        gl.glPushMatrix();
        gl.glRotatef(30f, 0, 0, 1);
        square.draw(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glRotatef(-30f, 0, 0, 1);
        gl.glTranslatef(2, 0, 0);
        square.draw(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-2, 0, 0);
        gl.glTranslatef(0, 2, 0);
        gl.glScalef(0.5f, 0.5f, 0.5f);
        square.draw(gl);
        gl.glPopMatrix();
    }
}

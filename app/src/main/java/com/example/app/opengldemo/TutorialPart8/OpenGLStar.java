package com.example.app.opengldemo.TutorialPart8;

import android.opengl.GLU;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2015/12/24.
 */
public class OpenGLStar {
    private Star sun = new Star();
    private Star earth = new Star();
    private Star moon = new Star();
    private int angle = 0;

    public void drawStar(GL10 gl) {
        clearCreen(gl);

        gl.glLoadIdentity();
        GLU.gluLookAt(gl, 0.0f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        gl.glPushMatrix();
        gl.glRotatef(angle, 0, 0, 1);
        gl.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
        sun.draw(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glRotatef(-angle, 0, 0, 1);
        gl.glTranslatef(3, 0, 0);
        gl.glScalef(.5f, .5f, .5f);
        gl.glColor4f(0.0f, 0.0f, 1.0f, 1.0f);
        earth.draw(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glRotatef(-angle, 0, 0, 1);
        gl.glTranslatef(2, 0, 0);
        gl.glScalef(.5f, .5f, .5f);
        gl.glRotatef(angle * 10, 0, 0, 1);
        gl.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        moon.draw(gl);
        gl.glPopMatrix();

        angle++;
    }

    private void clearCreen(GL10 gl) {
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
    }
}

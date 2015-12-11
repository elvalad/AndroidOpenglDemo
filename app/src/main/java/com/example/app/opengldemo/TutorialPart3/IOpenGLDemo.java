package com.example.app.opengldemo.TutorialPart3;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2015/12/10.
 */
public class IOpenGLDemo {
    public void drawScene(GL10 gl) {
        gl.glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
    }
}

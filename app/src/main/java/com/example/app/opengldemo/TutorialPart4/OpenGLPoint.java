package com.example.app.opengldemo.TutorialPart4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Administrator on 2015/12/10.
 */
public class OpenGLPoint {
    private float[] vertexArray = new float[] {
            -0.8f, -0.4f * 1.732f, 0.0f,
            0.8f , -0.4f * 1.732f , 0.0f ,
            0.0f , 0.4f * 1.732f , 0.0f ,
    };

    public void drawPoint(GL10 gl) {
        // 首先是使用FloatBuffer 存放三个顶点坐标
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertexArray.length * 4);
        vbb.order(ByteOrder.nativeOrder());
        FloatBuffer vertex = vbb.asFloatBuffer();
        vertex.put(vertexArray);
        vertex.position(0);

        // 使用glColor4f(float red, float green, float blue, float alpha) 将当前颜色设为红色
        gl.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
        // glPointSize(float size) 可以用来设置绘制点的大小
        gl.glPointSize(24f);
        gl.glLoadIdentity();
        gl.glTranslatef(0, 0, -4);

        // 使用glEnableClientState 打开Pipeline 的Vectex 顶点“开关”
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        // 使用glVertexPointer 通知OpenGL ES图形库顶点坐标
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertex);
        // 使用GL_POINTS 模式使用glDrawArrays绘制3个顶点
        gl.glDrawArrays(GL10.GL_POINTS, 0, 3);

        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }
}

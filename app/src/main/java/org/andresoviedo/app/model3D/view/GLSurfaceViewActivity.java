package org.andresoviedo.app.model3D.view;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class GLSurfaceViewActivity extends Activity {
    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGLSurfaceView = new GLSurfaceView(this);
        mGLSurfaceView.setRenderer(new CubeRenderer(false));
        setContentView(mGLSurfaceView);
    }
}

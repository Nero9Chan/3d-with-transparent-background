package org.andresoviedo.app.model3D.view;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;
import android.os.Bundle;


/**
 * Wrapper activity demonstrating the use of {@link GLSurfaceView} to
 * display translucent 3D graphics.
 */
public class TranslucentGLSurfaceViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create our Preview view and set it as the content of our
        // Activity
        mGLSurfaceView = new GLSurfaceView(this);
        // We want an 8888 pixel format because that's required for
        // a translucent window.
        // And we want a depth buffer.
        mGLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        // Tell the cube renderer that we want to render a translucent version
        // of the cube:
        mGLSurfaceView.setRenderer(new CubeRenderer(true));
        // Use a surface format with an Alpha channel:
        mGLSurfaceView.getHolder().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(mGLSurfaceView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGLSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLSurfaceView.onPause();
    }

    private GLSurfaceView mGLSurfaceView;
}

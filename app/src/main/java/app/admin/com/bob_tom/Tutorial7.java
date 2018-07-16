package app.admin.com.bob_tom;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Tutorial7 extends AppCompatActivity {
   //private TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Graphics(this));

        /*to start animation of text
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        animation.reset();

        tv = findViewById(R.id.animate_Tv);
        tv.startAnimation(animation);*/
    }

    private class Graphics extends View {
        private Handler handler;
        int i = 1;
        int x = 100;
        private Runnable r = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
        public Graphics(Tutorial7 classcontext) {
            super(classcontext);
            handler = new Handler();
            }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            if(x < 100)
                i=1;
            if(x > 615)
                i = -1;
            x += i;
            paint.setAntiAlias(false);
            paint.setColor(Color.CYAN);
            canvas.drawCircle(x,150,100,paint);

            paint.setAntiAlias(false);
            paint.setColor(Color.RED);
            canvas.drawCircle(610,x,100,paint);

            paint.setAntiAlias(false);
            paint.setColor(Color.GREEN);
            canvas.drawRect(100,300,500,450,paint);
            handler.postDelayed(r,30);
        }
    }
}

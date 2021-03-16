package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Exp_4");
        Bitmap bg=Bitmap.createBitmap(720,1280, Bitmap.Config.ARGB_8888);
        ImageView i=(ImageView)findViewById(R.id.image_view);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);
        canvas.drawText("Rectangle",450,150, paint);
        canvas.drawRect(400,200,700,400, paint);
        canvas.drawText("Circle",120,150, paint);
        canvas.drawCircle(200,300, 100, paint);
        canvas.drawText("Square",120,800, paint);
        canvas.drawRect(50,850,350,1150, paint);
        canvas.drawText("Line",480,800, paint);
        canvas.drawLine(520,850,520, 1150, paint);
    }
}
package com.example.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View {

	public DrawView(Context context) {
		super(context);
	}

	public float currentX = 40;
	public float currentY = 50;
	Paint p = new Paint();

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		p.setColor(Color.RED);
		canvas.drawCircle(currentX, currentY, 15, p);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		this.currentX = event.getX();
		this.currentY = event.getY();
		// 通知该组件重绘
		this.invalidate();
		return true;
	}
}

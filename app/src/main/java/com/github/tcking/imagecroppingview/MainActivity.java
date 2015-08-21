package com.github.tcking.imagecroppingview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ImageCroppingView croppingView = (ImageCroppingView)findViewById(R.id.cropping_view);
		findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				ImageView target=(ImageView) findViewById(R.id.target_view);
				target.setImageBitmap(croppingView.getCroppedImage());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

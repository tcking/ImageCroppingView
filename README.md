ImageCroppingView
=================

A custom ImageView that can panning, pinch zoom, double tap zoom,fling and cropping it, e.g: cropping a image to get a avatar
![Sample Image](https://github.com/tcking/ImageCroppingView/raw/master/sample.gif "An example")

usage:

1.copy `ImageCroppingView.java` to your project

2.add a ImageCroppingView to layout file:
``` xml
<com.github.tcking.imagecroppingview.ImageCroppingView
	android:id="@+id/cropping_view"
	android:layout_width="wrap_content"
	android:layout_height="wrap_content"
	android:src="@drawable/tom_and_jerry" />
```
3.cropping image:
``` java
final ImageCroppingView croppingView = (ImageCroppingView)findViewById(R.id.cropping_view);
Bitmap target=croppingView.getCroppedImage()
```

<code>ImageCroppingView</code> only help you to cropping a photo,if you want a easy way to get a photo [**PhotoHelper**](https://github.com/tcking/PhotoHelper) may help you

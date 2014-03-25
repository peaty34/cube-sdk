package com.srain.cube.image.iface;

import android.graphics.BitmapFactory;

import com.srain.cube.image.ImageTask;

/**
 * A ImageResizer process the resize logical when loading image from network an disk.
 */
public interface ImageResizer {

	/**
	 * Return the {@link BitmapFactory.Options#inSampleSize}, which will be used when load the image from the disk.
	 * 
	 * You should better calculate this value according the hard device of the mobile.
	 */
	int getInSampleSize(ImageTask imageTask);
}
/**
 * @author Raghav Sood
 */
package com.appaholics.listviewfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Extends the standard Android TextView from android.widget to allow us to have
 * a TextView with a custom font in the ListView (or anywhere else for that
 * matter)
 */
public class FontView extends TextView {

	private Context mContext;

	/**
	 * Instantiates a new font view.
	 * 
	 * @param context
	 *            the context
	 * @param attrs
	 *            the attrs
	 * @param defStyle
	 *            the def style
	 */
	public FontView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
		init();
	}

	/**
	 * Instantiates a new font view.
	 * 
	 * @param context
	 *            the context
	 * @param attrs
	 *            the attrs
	 */
	public FontView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		init();
	}

	/**
	 * Instantiates a new font view.
	 * 
	 * @param context
	 *            the context
	 */
	public FontView(Context context) {
		super(context);
		mContext = context;
		init();
	}

	/**
	 * Inits the setting of the new font
	 */
	public void init() {
		Typeface font = Typeface.createFromAsset(mContext.getAssets(), C.FONT_NAME);
		setTypeface(font);
	}

	@Override
	public void setTypeface(Typeface tf) {
		super.setTypeface(tf);
	}

}

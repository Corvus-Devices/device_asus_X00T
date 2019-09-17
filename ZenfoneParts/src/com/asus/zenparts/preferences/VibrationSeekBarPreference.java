package com.asus.zenparts.preferences;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class VibrationSeekBarPreference extends SecureSettingSeekBarPreference {

    private final Vibrator mVibrator;

    public VibrationSeekBarPreference(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public VibrationSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public VibrationSeekBarPreference(Context context) {
        super(context, null);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }
}

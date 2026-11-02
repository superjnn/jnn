<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:background="#CC222222"
    android:padding="4dp"
    android:gravity="center">

    <TextView
        android:id="@+id/tvLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="50%"
        android:textColor="#FFF"
        android:textSize="10sp"/>

    <SeekBar
        android:id="@+id/seekBar"
        android:layout_width="160dp"
        android:layout_height="36dp"
        android:rotation="270"
        android:progressTint="#4CAF50"
        android:thumbTint="#4CAF50"/>

</LinearLayout>

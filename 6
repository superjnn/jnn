package com.finevolume.app

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(80, 120, 80, 120)
        }

        val title = android.widget.TextView(this).apply {
            text = "精细音量控制"
            textSize = 24f
            setPadding(0, 0, 0, 60)
        }
        layout.addView(title)

        val startBtn = Button(this).apply {
            text = "启动浮窗"
            setOnClickListener { checkAndStart() }
        }
        layout.addView(startBtn)

        val batteryBtn = Button(this).apply {
            text = "电池优化设置"
            setOnClickListener { openBatterySettings() }
        }
        layout.addView(batteryBtn)

        val autoStartBtn = Button(this).apply {
            text = "自启动设置"
            setOnClickListener { openAutoStartSettings() }
        }
        layout.addView(autoStartBtn)

        setContentView(layout)
    }

    private fun checkAndStart() {
        if (!Settings.canDrawOverlays(this)) {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivity(intent)
            Toast.makeText(this, "请允许悬浮窗权限", Toast.LENGTH_SHORT).show()
        } else {
            startService(Intent(this, FloatWindowService::class.java))
            Toast.makeText(this, "浮窗已启动", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun openBatterySettings() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            try {
                val intent = Intent(Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)
                    .setData(Uri.parse("package:$packageName"))
                startActivity(intent)
            } catch (_: Exception) {
                startActivity(Intent(Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS))
            }
        }
    }

    private fun openAutoStartSettings() {
        try {
            val intent = Intent().apply {
                setClassName("com.miui.securitycenter",
                    "com.miui.permcenter.autostart.AutoStartManagementActivity")
            }
            startActivity(intent)
        } catch (_: Exception) {
            Toast.makeText(this, "请手动到系统设置开启自启动", Toast.LENGTH_LONG).show()
        }
    }
}

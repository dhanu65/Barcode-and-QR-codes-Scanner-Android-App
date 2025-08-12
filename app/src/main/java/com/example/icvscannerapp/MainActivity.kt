package com.example.icvscannerapp // IMPORTANT: Make sure this matches your project's package name!

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * MainActivity is the home screen of the application.
 * It's the first screen the user sees when they launch the app.
 * Its only purpose is to display a button that opens the scanner.
 */
class MainActivity : AppCompatActivity() {

    /**
     * The onCreate method is the starting point for this activity.
     * It's called when the screen is first created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // This line connects this Kotlin code file to its XML layout file.
        // It tells the app to display the layout defined in "activity_main.xml".
        setContentView(R.layout.activity_main)

        // Find the button in our layout by its ID ("scan_button").
        val scanButton: Button = findViewById(R.id.scan_button)

        // Set up a listener that waits for the user to click the button.
        scanButton.setOnClickListener {
            // This is the code that will run when the button is clicked.

            // 1. Create an "Intent". An Intent is a request to do something,
            //    in this case, to open another screen (ScannerActivity).
            val intent = Intent(this, ScannerActivity::class.java)

            // 2. Execute the Intent, which starts the new activity.
            startActivity(intent)
        }
    }
}
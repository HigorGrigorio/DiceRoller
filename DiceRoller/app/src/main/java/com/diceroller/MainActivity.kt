package com.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.button);

        /**
         * Append a onClick event listener
         */
        rollButton.setOnClickListener {
            rollDice();
            showMessage();
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val result: TextView = findViewById(R.id.textView);
        result.text = Dice(6).roll().toString();
    }

    private fun showMessage() {
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_LONG);
        toast.show();
    }

}
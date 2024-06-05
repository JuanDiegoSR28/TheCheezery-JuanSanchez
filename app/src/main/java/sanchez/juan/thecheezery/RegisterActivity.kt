package sanchez.juan.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.sign_in_button) as Button
        button.setOnClickListener()
        {
            var intent: Intent = Intent(this, MenuActiviity::class.java)
            startActivity(intent)

        }
    }
}
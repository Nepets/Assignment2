package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveButton = findViewById<Button>(R.id.button)
    }
    fun saveClicked(view: View){
        val txtNameView = findViewById<TextView>(R.id.txtName)
        val txtEmailView = findViewById<TextView>(R.id.txtEmail)
        val txtPasswordView = findViewById<TextView>(R.id.txtPassword)
        val txtPasswordConfirmView = findViewById<TextView>(R.id.txtPasswordConfirm)
        if(txtNameView.text.isBlank()){
            //Toast.makeText(this@FormActivity,"No name detected", Toast.LENGTH_SHORT).show()
            txtNameView.error = getString(R.string.nameError)
        }
        if(txtEmailView.text.isBlank()){
            //Toast.makeText(this@FormActivity,"No email detected", Toast.LENGTH_SHORT).show()
            txtEmailView.error=getString(R.string.emailError)
        }
        if(txtPasswordView.text.isBlank()){
            //Toast.makeText(this@FormActivity,"No password detect", Toast.LENGTH_SHORT).show()
            txtPasswordView.error=getString(R.string.passwordError)
        }
        if(txtPasswordConfirmView.text.isBlank()) {
            //Toast.makeText(this@FormActivity, "No password re-enter", Toast.LENGTH_SHORT).show()
            txtPasswordConfirmView.error=getString(R.string.passwordConfirmError)
        }
        if(!(txtPasswordView.text.toString().equals(txtPasswordConfirmView.text.toString()))){
            Toast.makeText(this@FormActivity,"Password is not the same", Toast.LENGTH_SHORT).show()
        }

    }

}
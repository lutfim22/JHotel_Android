package id.ac.ui.jhotel_android_luthfi;

//import android.support.v7.app.AlertDialog;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText emailInput = findViewById(R.id.inputEmail);
        final EditText passInput = findViewById(R.id.inputPass);
        final Button loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = emailInput.getText().toString();
                final String password = passInput.getText().toString();

                if(email.equals("test@test.com") && password.equals("test")) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(LoginActivity.this);
                    builder1.setMessage("Login success.")
                            .create()
                            .show();
                }
                else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(LoginActivity.this);
                    builder1.setMessage("Login failed.")
                            .create()
                            .show();
                }
            }
        });
    }
}

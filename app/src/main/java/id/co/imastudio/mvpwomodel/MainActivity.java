package id.co.imastudio.mvpwomodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginView {
    LoginPresenter loginPresenter;
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPassword = (EditText) findViewById(R.id.et_pass);
        edtUsername = (EditText) findViewById(R.id.et_username);
        btnLogin = (Button) findViewById(R.id.bt_login);

        loginPresenter = new LoginPresenterImp(this, edtUsername, edtPassword);

    }

    public void doLogin(View view) {
        loginPresenter.login(edtUsername.getText().toString(), edtPassword.getText().toString());
    }

    @Override
    public void showValidationError() {
        Toast.makeText(this, "not valid field", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccesss() {
        Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginError() {
        Toast.makeText(this, "not match in server", Toast.LENGTH_SHORT).show();
    }
}

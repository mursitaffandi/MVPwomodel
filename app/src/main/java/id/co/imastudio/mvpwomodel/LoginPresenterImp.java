package id.co.imastudio.mvpwomodel;

import android.text.TextUtils;
import android.widget.EditText;

/**
 * Created by affandi on 4/12/17.
 */

public class LoginPresenterImp implements LoginPresenter {
    LoginView loginView;
    EditText edtUsername, edtPassword;

    public LoginPresenterImp(LoginView loginView, EditText innerEdt, EditText inneredt2) {
        this.loginView = loginView;
        this.edtUsername =innerEdt;
        this.edtPassword = inneredt2;
    }

    @Override
    public void login(String username, String password) {
        edtUsername.setError(null);
        edtPassword.setError(null);
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            if (TextUtils.isEmpty(username)) {
                edtUsername.setError("can't blank");
                edtUsername.requestFocus();
                loginView.showValidationError();
            }
            else if (TextUtils.isEmpty(password)) {
                edtPassword.setError("can't blank");
                edtPassword.requestFocus();
                loginView.showValidationError();
            }
        }
        else {
            if (username.equals("root") && password.equals("toor")){
                loginView.loginSuccesss();
            } else {
                loginView.loginError();
            }
        }
    }
}

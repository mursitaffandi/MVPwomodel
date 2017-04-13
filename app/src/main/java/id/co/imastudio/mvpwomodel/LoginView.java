package id.co.imastudio.mvpwomodel;

/**
 * Created by affandi on 4/12/17.
 */

public interface LoginView {
    /*
    * Action for error validating input user
    * */
    void showValidationError();

    /*
    * Action for success login
    * */
    void loginSuccesss();

    /*
    * Action for error does not match data in server
    * */
    void loginError();
}

package controllers.workspace;


import controllers.Application;
import controllers.user.UserController;
import models.User;


public class Workspace extends Application {

    public static void dashboard() {

        if (!has_logined()) {
            UserController.login();
        } else {
            User user = fetch_user_or_redirect_to_login();
            boolean has_loggined = true;
            render(has_loggined,user);
        }
    }

}

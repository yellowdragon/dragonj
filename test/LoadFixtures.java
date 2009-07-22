
import forms.myspace.user.UserForm;
import models.User;
import org.junit.*;
import play.test.FunctionalTest;

public class LoadFixtures extends FunctionalTest {

    @Before
    public void cleanup() {
        User.deleteAll();
    }

    @Test
    public void load_fixtures() {
        load_users();
    }

    private void load_users() {

        UserForm joeForm = new UserForm();
        joeForm.name = "Joe";
        joeForm.email = "j@b.cn";
        joeForm.password = "iamjoe";
        joeForm.repeat_password = "iamjoe";


        UserForm kateForm = new UserForm();
        kateForm.name = "Kate";
        kateForm.email = "k@a.cn";
        kateForm.password = "iamkate";
        kateForm.repeat_password = "iamkate";

        User.create(joeForm);
        User.create(kateForm);


        assertEquals(2L, User.count());
    }
}


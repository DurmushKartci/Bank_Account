public class Main{

    ///////////////////////////TOOLS///////////////////////////

    ///////////////////////////MAİN///////////////////////////


    public static void main(String[] args) {
        Menu.introduce();
        User user = Menu.user_login_register();
        user.show_user();
    }

}
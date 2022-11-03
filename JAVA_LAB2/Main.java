public class Main {
    public static void main(String[] args) {
        CustomUser user = new CustomUser("Admin","Admin","admin@poczta.local", Repetytorium.Role.ADMIN);
        user.userInfo();
    }
}
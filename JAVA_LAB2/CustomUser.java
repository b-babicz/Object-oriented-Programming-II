public class CustomUser extends AbstractUser{

    private String email;
    private Repetytorium.Role role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Repetytorium.Role getRole() {
        return role;
    }

    public void setRole(Repetytorium.Role role) {
        this.role = role;
    }

    public CustomUser(String username, String password, String email, Repetytorium.Role role) {
        super(username, password);
        this.email = email;
        this.role = role;
    }


   @Override
    public void login(String username, String password) {
       System.out.println("Użytkownik zalogowany poprawnie");
    }

    @Override
    public void userInfo() {
        System.out.println(getUsername());
        System.out.println(getPassword());
        System.out.println(getEmail());
        System.out.println(getRole());
    }

}

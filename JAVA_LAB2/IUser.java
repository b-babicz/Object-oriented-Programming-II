public interface IUser {

    public String HELLO = "Hello ";

    public abstract void login(String username, String password);

    private static void provideInfo(String username) {
        System.out.println(HELLO + username);
    }
    public default void userInfo(String username)
    {
        IUser.provideInfo(username);
    }
}

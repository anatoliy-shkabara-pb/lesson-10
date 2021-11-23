package hw8;

public class Auth {

    private String login = "admin";
    private String password = "Pa55w0rd";

    /**
     * Registration
     */
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || !login.matches("[a-zA-Z0-9]{5,20}")) {
            throw new WrongLoginException("Login length must be between 5 and 20 symbols, contains only letters and numbers");
        }
        if (password == null || !password.matches("[a-zA-Z0-9_]{5,}")) {
            throw new WrongPasswordException("Password length must be >= 5 symbols, contains only letters, numbers and symbol \"_\"");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password not confirmed");
        }
        this.login = login;
        this.password = password;
    }

    /**
     * Login as registered user
     */
    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login)) {
            throw new WrongLoginException("User not found");
        }
        if (!this.password.equals(password)) {
            throw new WrongLoginException("User not found");
        }
    }
}

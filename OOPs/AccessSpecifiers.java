public class AccessSpecifiers {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount();
        b1.userName = "Rushi";
        // b1.password = "12345";
        b1.setPassword("12345");
        // System.out.println(b1.password);    // we cant check password but we can change password
    }
}

class BankAccount{
    public String userName;
    // private String password;
    public void setPassword(String pasw){
        // password = pasw;
    }
}

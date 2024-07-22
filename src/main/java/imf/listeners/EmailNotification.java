package imf.listeners;

public class EmailNotification implements EventListener{
    private String user;
    private String emailAddress;

    public EmailNotification(String user, String emailAddress) {
        this.user = user;
        this.emailAddress = emailAddress;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(String event) {
        System.out.println(emailDetails(event));
    }

    public String emailDetails(String event) {
        return "emailto:" + this.emailAddress + "\n" +
                "Subject:" + "Stock update\n" +
                "Dear " + user + ",\n\n" +
                event + "\n\n" +
                "Best regards,\n" +
                "Your favourite stockbroker\n\n";
    }
}
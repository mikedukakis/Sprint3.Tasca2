package imf.observers;

import com.imf.listeners.EmailNotification;

public class StockHolder {

    private String name;
    private String emailAddress;
    private EmailNotification emailNotification;

    public StockHolder(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.emailNotification = new EmailNotification(name, emailAddress);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EmailNotification getEmailNotification() {
        return this.emailNotification;
    }
}

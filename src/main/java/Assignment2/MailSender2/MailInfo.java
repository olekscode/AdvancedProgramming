package Assignment2.MailSender2;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private int mailCode;


    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getMailCode() {
        return mailCode;
    }

    public Client getClient() {
        return client;
    }
}

public class NotificationFactory {
    public static Client getNotificationclient(ClientType clientType){
        switch(clientType){
            case MAIL:
                return new MailNotificationClient(25,"SMTP","abc.com");
            case MESSAGE:
                return new SMSNotificationClient(443,"HTTPS","gateway.com");
            default:
                return null;
        }

    }
}

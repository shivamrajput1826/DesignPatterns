public class NotificationMain {
    public static void main(String args[]){
        System.out.println("********Email notification*********");
        Notification emailNotification=
                new Notification(
                        "factor method tutorial",
                        "fac Method",
                        "signature",
                        "rahul.com",
                        "shivam.com");
       Client emailCLient=NotificationFactory.getNotificationclient(ClientType.MAIL);
    if(emailCLient!=null) {emailCLient.notify(emailNotification);}
        System.out.println("**********SMS notification**********");
        Notification smsNotificaiton
                = new Notification("factory method tutorial published",
                "factory method", "signature",
                "8881045313",
                "TM-TUTS");
        Client smsClient = NotificationFactory.getNotificationclient(ClientType.MESSAGE);
      if(smsClient!=null){  smsClient.notify(smsNotificaiton);}

    }
}

package Test;

import library.EmailUtility;

public class SendGmail {
    /*
        when you are using your own google account:
             first Step:
                go to  :
                     https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                        Make sure that your google account allows third part app
    */
    public static void main(String[] args) {
        String userName = "milkysf@gmail.com";
        String passWord = "BuTiMaR9212";
        String[] receiver = {"melike2129@hotmail.com","eslemcinar964@gmail.com","milkysf@gmail.com" };
        String subject = "Esma Mesecan";
        String text = " I love this class and this batch motivates me really good thanks";
        for (String each : receiver) {
            EmailUtility.sendEmails(userName, passWord, each, subject, text);
        }
        System.out.println("Completed");

    }
}

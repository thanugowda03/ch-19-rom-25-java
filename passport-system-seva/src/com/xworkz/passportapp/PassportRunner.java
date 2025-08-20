package com.xworkz.passportapp;


import com.xworkz.passportapp.passportseva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;



public class PassportRunner {
    public static void main(String[] args) {
        PassportUser passportUser=new PassportUser();

        passportUser.setCpvLocation("PO");
        passportUser.setDcdrLocation("Bengaluru");
        passportUser.setGivenName("Thanushree");
        passportUser.setSurName("B G");
        passportUser.setDob("18-04-2003");
        passportUser.setEmail("thanugowda018@gmail.com");
        passportUser.setEmailLoginSame(true);
        passportUser.setLoginId("thanugowda018@gmail.com");
        passportUser.setPwd("Thanu@123");
        passportUser.setConfirmPwd("Thanu@123");
        passportUser.setHintQuestion("Birth Place");
        passportUser.setHintAnswer("Kodagu");
        passportUser.setCaptcha("QW1o99");

        PassportSeva passportSeva=new PassportSeva();

        String cpvLocation=passportUser.getCpvLocation();
        String dcdrLocation=passportUser.getDcdrLocation();
        String givenName=passportUser.getGivenName();
        String  surName=passportUser.getSurName();
        String dob=passportUser.getDob();
        String email=passportUser.getEmail();
        boolean isEmailLoginSame=passportUser.getIsEmailLoginSame();
        String loginId=passportUser.getLoginId();
        String pwd=passportUser.getPwd();
        String confirmPwd=passportUser.getConfirmPwd();
        String hintQuestion=passportUser.getHintQuestion();
        String hintAnswer=passportUser.getHintAnswer();
        String captcha=passportUser.getCaptcha();

        System.out.println("main started");
        System.out.println("CPV Location:"+cpvLocation);
        System.out.println("DCDR Location: "+dcdrLocation);
        System.out.println("Given name: "+givenName);
        System.out.println("SurName: "+surName);
        System.out.println("DOB: "+dob);
        System.out.println("Email: "+email);
        System.out.println("Is Email Login Is same: "+isEmailLoginSame);
        System.out.println("Login Id: "+loginId);
        System.out.println("Password: "+pwd);
        System.out.println("Confirm password: "+confirmPwd);
        System.out.println("Hint Question: "+hintQuestion);
        System.out.println("Hint Answer: "+hintAnswer);
        System.out.println("Captcha: "+captcha);

        System.out.println("main ended");

    }
}

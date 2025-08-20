package com.xworkz.passportapp.passportseva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {
    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;

        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean isEmailLoginSameValid = false;
        boolean loginIdValid = false;
        boolean pwdValid = false;
        boolean confirmPwdValid = false;
        boolean hintQuestionValid = false;
        boolean hintAnswerValid = false;
        boolean captchaValid = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("CPV Location is not valid");
        }
        if (passportUser.getDcdrLocation() != null) {
            dcdrLocationValid = true;
        } else {
            System.out.println("DCDR Location is not valid");
        }
        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("Given name is not valid");
        }
        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("Sur Name is not valid");
        }
        if (passportUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("DOB is not valid");
        }
        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("Email is not valid");
        }
        if (passportUser.getIsEmailLoginSame() != false) {
            emailValid = true;
        } else {
            System.out.println("Email and Login are not valid ");
        }
        if (passportUser.getLoginId() != null) {
            loginIdValid = true;
        } else {
            System.out.println("Login id is not valid");
        }
        if (passportUser.getPwd() != null) {
            pwdValid = true;
        } else {
            System.out.println("PWD is not valid");
        }
        if (passportUser.getConfirmPwd() != null) {
            confirmPwdValid = true;
        } else {
            System.out.println("Confirm password is not valid");
        }
        if (passportUser.getHintQuestion() != null) {
            hintQuestionValid = true;
        } else {
            System.out.println("Hint question is not valid");
        }
        if (passportUser.getHintAnswer() != null) {
            hintAnswerValid = true;
        } else {
            System.out.println("Hint Answer is not valid");
        }
        if (passportUser.getCaptcha() != null) {
            captchaValid = true;
        } else {
            System.out.println("Captcha is not valid");
        }
        if (cpvLocationValid && dcdrLocationValid && givenNameValid && surNameValid && emailValid && dobValid && isEmailLoginSameValid && loginIdValid && pwdValid && confirmPwdValid && hintQuestionValid && hintAnswerValid && captchaValid) {
            passportUserCreated = true;
            this.passportUser = passportUser;
        }
        return passportUserCreated;
    }
}


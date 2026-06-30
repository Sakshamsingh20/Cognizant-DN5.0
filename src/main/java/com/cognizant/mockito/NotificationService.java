package com.cognizant.mockito;

public class NotificationService {
    private EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendOrderConfirmation(String email) {
        emailSender.sendEmail(email, "Your order is confirmed!");
    }

    public void sendWelcomeEmail(String email) {
        emailSender.sendEmail(email, "Welcome to our store!");
    }
}
package com.cognizant.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {

    @Mock
    EmailSender emailSender; // fake email sender (no real emails sent!)

    @InjectMocks
    NotificationService notificationService;

    @Test
    public void testSendOrderConfirmation() {
        // Act
        notificationService.sendOrderConfirmation("test@example.com");

        // Verify - check if sendEmail was actually called with correct values
        verify(emailSender).sendEmail("test@example.com", "Your order is confirmed!");
        System.out.println("Order confirmation email verified!");
    }

    @Test
    public void testSendWelcomeEmail() {
        // Act
        notificationService.sendWelcomeEmail("newuser@example.com");

        // Verify
        verify(emailSender).sendEmail("newuser@example.com", "Welcome to our store!");
        System.out.println("Welcome email verified!");
    }

    @Test
    public void testEmailCalledExactlyOnce() {
        // Act
        notificationService.sendOrderConfirmation("test@example.com");

        // Verify it was called EXACTLY 1 time
        verify(emailSender, times(1)).sendEmail(anyString(), anyString());
        System.out.println("Email called exactly once - verified!");
    }
}
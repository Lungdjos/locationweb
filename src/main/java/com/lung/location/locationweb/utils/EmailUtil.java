package com.lung.location.locationweb.utils;

import jakarta.mail.MessagingException;

public interface EmailUtil{
    void sendEmailString(String toAddress, String toCcAddress, String subject, String body) throws MessagingException;
}

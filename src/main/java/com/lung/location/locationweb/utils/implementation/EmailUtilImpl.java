package com.lung.location.locationweb.utils.implementation;

import com.lung.location.locationweb.utils.EmailUtil;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmailString(String toAddress, String toCcAddress, String subject, String body) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);

        mimeMessageHelper.setTo(toAddress);
        mimeMessageHelper.setCc(toCcAddress);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(body);
        // setting views of the mail
        javaMailSender.send(mimeMessage);
    }
}

package com.example.correction_service_tv.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class MailService {
    public void sendEmail(String to, String subject, String text) {
        System.out.println(to);
        System.out.println(subject);
        System.out.println(text);
    }
}


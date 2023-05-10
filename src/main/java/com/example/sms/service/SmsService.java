package com.example.sms.service;

import org.springframework.stereotype.Service;

@Service
public class SmsService {

    public String sendSMS(String smsNuber, String smsMessage) {

        return "Number: "+ smsNuber + " Message: " + smsMessage;

    }

}
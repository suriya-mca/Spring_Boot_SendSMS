package com.example.sms.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class SmsService {

    @Value("${TWILIO_OUTGOING_SMS_NUMBER}")
    String OUTGOING_SMS_NUMBER;

    public String sendSMS(String smsNumber, String smsMessage) {

        Message message = Message.creator(
            new PhoneNumber(smsNumber),
            new PhoneNumber(OUTGOING_SMS_NUMBER),
            smsMessage
        )
        .create();

        return message.getSid();
    
    }

}
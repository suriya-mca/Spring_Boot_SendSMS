package com.example.sms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sms.model.SMSSendRequest;
import com.example.sms.service.SmsService;

@RestController
@RequestMapping("/api/v1")
public class SmsController {

    private final SmsService smsService;

    public SmsController(SmsService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/sendSMS")
    public String processSMS(@RequestBody SMSSendRequest sendRequest) {

        return smsService.sendSMS(sendRequest.phoneNumber(), sendRequest.message());

    }

}
package com.tanmay.app.activities.impl;

import com.tanmay.app.activities.ExternalAccountCreationActivity;
import com.tanmay.app.dto.ResponseDto;
import org.springframework.web.client.RestTemplate;

public class ExternalAccountCreationActivityImpl implements ExternalAccountCreationActivity {

    private final RestTemplate restTemplate;

    public ExternalAccountCreationActivityImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void createAccount(String phoneNumber) {
        restTemplate.getForObject("https://catfact.ninja/fact", ResponseDto.class);
    }
}

package com.tanmay.app.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface OtpActivity {

    @ActivityMethod
    String generateOtp(String mobileNumber);

    @ActivityMethod
    boolean verifyOtp(String mobileNumber, String otp);
}

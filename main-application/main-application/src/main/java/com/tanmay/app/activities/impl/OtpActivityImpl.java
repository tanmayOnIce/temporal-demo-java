package com.tanmay.app.activities.impl;

import com.tanmay.app.activities.OtpActivity;

public class OtpActivityImpl implements OtpActivity {
    @Override
    public String generateOtp(String mobileNumber) {
        String otp = mobileNumber.substring(mobileNumber.length() - 4);

        return otp;
    }

    @Override
    public boolean verifyOtp(String mobileNumber, String otp) {
        String generateOtp = mobileNumber.substring(mobileNumber.length() - 4);

        return generateOtp.equals(otp);

    }
}

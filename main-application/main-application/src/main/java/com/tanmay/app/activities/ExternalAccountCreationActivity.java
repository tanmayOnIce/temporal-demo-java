package com.tanmay.app.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface ExternalAccountCreationActivity {

    @ActivityMethod
    void createAccount(String phoneNumber);
}

package com.tts.TechTalentTwitter0701.service;

import com.tts.TechTalentTwitter0701.model.Greeting;

public interface GreetingService {

    //this is the contract that anyone who implements GreetingService must fulfill
    Greeting getGreeting();

}
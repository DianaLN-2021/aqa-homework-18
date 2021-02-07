package com.ring.aqa;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        user.login("tomsmith", "SuperSecretPassword!")
                .logout();
    }
}

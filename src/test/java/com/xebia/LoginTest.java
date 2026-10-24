package com.xebia;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {

    LoginService service = new LoginService();

    @Test
    void validLogin() {
        assertTrue(service.login("student", "1234"));
    }

    @Test
    void invalidPassword() {
        assertFalse(service.login("student", "wrong"));
    }

    @Test
    void invalidUsername() {
        assertFalse(service.login("unknown", "1234"));
    }

    @Test
    void emptyUsername() {
        assertFalse(service.login("", "1234"));
    }

    @Test
    void emptyPassword() {
        assertFalse(service.login("student", ""));
    }

    @Test
    void nullUsername() {
        assertFalse(service.login(null, "1234"));
    }

    @Test
    void nullPassword() {
        assertFalse(service.login("student", null));
    }
}

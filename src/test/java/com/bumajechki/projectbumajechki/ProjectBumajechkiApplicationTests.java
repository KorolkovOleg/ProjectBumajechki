package com.bumajechki.projectbumajechki;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
class ProjectBumajechkiApplicationTests {

    @Test
    void generatePassword() {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "123";
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println("password:" + encodedPassword);

        assertThat(rawPassword, not(encodedPassword));
    }

}

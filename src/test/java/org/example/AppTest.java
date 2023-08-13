package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest{


    @BeforeAll
    static void beforeAllMethod() {

    }

    @BeforeEach
    void beforeEachMethod(){

    }

    @AfterEach
    void afterEachMethod(){

    }

    @AfterAll
    static void afterAllMethod(){

    }


    @Test
    void someTest(){
        Object something = null;
        assertThat( something ).isNull();
    }

}

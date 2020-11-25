package com.louis.webservice.etc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void checkSize(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @Test
    void contains(){
        assertThat(numbers.contains(1)).isTrue();
        assertThat(numbers.contains(2)).isTrue();
        assertThat(numbers.contains(3)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4})
    void isContainsNum(int num){
        assertThat(numbers.contains(num)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"1,TRUE","2,TRUE","3,TRUE","4,FALSE","5,FALSE"})
    void csvContains(int num, boolean expected){
        assertThat(numbers.contains(num)).isEqualTo(expected);
    }

}


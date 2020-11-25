package com.louis.webservice.etc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class StudyTest {
    Study study = new Study();
    @Test
    public void splitManyNumber(){

        String[] result = study.splitString("1,2",",");
        System.out.println("result : " + result[0]);
        assertThat(result).contains("1","2");

        String[] result2 = study.splitString("1",",");
        assertThat(result2).containsExactly("1");
    }

    @Test
    public void removeBracket(){
        String result = study.removeBracket("(1,2)");
        assertThat(result).isEqualTo("1,2");
    }
    @Test
    @DisplayName("exception test")
    public void exceptionTest(){
        try {
            char charactor = study.pickCharactor("abc", 3);
        } catch (StringIndexOutOfBoundsException be){
            assertThat(be).hasMessage("String index out of range: 3");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e).hasMessage("Index: 2, Size: 2");
        }

    }

    @Test
    @DisplayName("pick charactor test")
    public void pickChar(){
        char charactor = study.pickCharactor("abc",2);
        assertThat(charactor).isEqualTo('c');
    }

}

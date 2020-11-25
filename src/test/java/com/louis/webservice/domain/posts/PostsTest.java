package com.louis.webservice.domain.posts;




import com.louis.webservice.etc.Study;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class PostsTest {

    Study study;

    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void cleanup(){
        postsRepository.deleteAll();
    }


    @Test
    public void saveAndLoad() {
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
        .title("tesTitle")
        .author("testAuthor")
        .content("testContents")
        .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
/*        Posts posts = postsList.get(0);
        assertThat
        assertThat(posts.getTitle()).("testTitle");
        assertThat(posts.getAuthor(), is("testAuthor"));
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
        assertThat();
        conta*/
    }





}
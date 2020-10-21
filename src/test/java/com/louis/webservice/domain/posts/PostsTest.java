package com.louis.webservice.domain.posts;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PostsTest {

    @Autowired
    PostsRepository postsRepository;


    @Test
    public void saveAndLoad() {
        postsRepository.save(Posts.builder()
        .title("tesTitle")
        .author("testAuthor")
        .content("testContents")
        .build());
        
        List<Posts> postsList = postsRepository.findAll();
        
        Posts posts = postsList.get(0);


        assertThat("tesTitle", is(posts.getTitle()));
    }


}
package com.louis.webservice.web;

import com.louis.webservice.domain.posts.PostsRepository;
import com.louis.webservice.dto.posts.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/init")
    public String init(){
        return "init project";
    }
    @PostMapping("/posts")
    public void saveAndPosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}

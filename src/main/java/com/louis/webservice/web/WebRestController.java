package com.louis.webservice.web;

import com.louis.webservice.domain.posts.PostsRepository;
import com.louis.webservice.dto.posts.PostsSaveRequestDto;
import com.louis.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/init")
    public String init(){
        return "init project";
    }


    @PostMapping("/posts")
    public Long saveAndPosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}

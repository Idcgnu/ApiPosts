package com.devlooping.api.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devlooping.api.entity.Post;
import com.devlooping.api.services.PostService;



@RestController
@RequestMapping("/api")
public class PostRestController {
    private PostService service;


    public PostRestController(PostService pService){
        service = pService;
    }
  
    @GetMapping("/Posts")
    public ResponseEntity<?> buscarTodo(){
        List<Post> posts = service.buscarTodo();

        return ResponseEntity.ok(posts);
        
        
    }
}

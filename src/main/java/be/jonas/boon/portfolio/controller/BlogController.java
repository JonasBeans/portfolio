package be.jonas.boon.portfolio.controller;

import be.jonas.boon.portfolio.DTO.PostsDTO;
import be.jonas.boon.portfolio.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("api/v1/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }

    @GetMapping
    public Set<PostsDTO> getBlogPostNames(){
        return blogService.getBlogPostTitles();
    }
}

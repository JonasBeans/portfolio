package be.jonas.boon.portfolio.service;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import be.jonas.boon.portfolio.DTO.PostsDTO;

@Service
public class BlogService {

    @Value("${posts.blog.path}")
    private String postPath;

    public Set<PostsDTO> getBlogPostTitles(){
        return Stream.of(new File(postPath).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .map(PostsDTO.Mapper::mapTo)
                .collect(Collectors.toSet());
    }
}

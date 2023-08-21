package com.test.postalitemsrest.controller;

import com.test.postalitemsrest.model.PostOffice;
import com.test.postalitemsrest.service.PostOfficeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post-offices")
public class PostOfficeController {
    private final PostOfficeService postOfficeService;

    public PostOfficeController(PostOfficeService postOfficeService) {
        this.postOfficeService = postOfficeService;
    }

    @PostMapping
    public PostOffice createPostOffice(@RequestBody PostOffice postOffice) {
        return postOfficeService.createPostOffice(postOffice);
    }

    @GetMapping
    public List<PostOffice> getAllPostOffices() {
        return postOfficeService.getAllPostOffices();
    }
}

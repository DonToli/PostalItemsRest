package com.test.postalitemsrest.service;

import com.test.postalitemsrest.model.PostOffice;
import com.test.postalitemsrest.repository.PostOfficeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostOfficeService {
    private final PostOfficeRepository postOfficeRepository;

    public PostOfficeService(PostOfficeRepository postOfficeRepository) {
        this.postOfficeRepository = postOfficeRepository;
    }

    public PostOffice createPostOffice(PostOffice postOffice) {
        // Дополнительная бизнес-логика при создании почтового отделения
        return postOfficeRepository.save(postOffice);
    }

    public List<PostOffice> getAllPostOffices() {
        return postOfficeRepository.findAll();
    }
}

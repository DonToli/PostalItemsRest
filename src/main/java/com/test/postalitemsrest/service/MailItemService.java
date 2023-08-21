package com.test.postalitemsrest.service;

import com.test.postalitemsrest.model.MailItem;
import com.test.postalitemsrest.repository.MailItemRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class MailItemService {
    private final MailItemRepository mailItemRepository;

    public MailItemService(MailItemRepository mailItemRepository) {
        this.mailItemRepository = mailItemRepository;
    }

    public MailItem registerMailItem(MailItem mailItem) {
        // Можно добавить бизнес-логику при регистрации почтового отправления
        return mailItemRepository.save(mailItem);
    }

    public MailItem getMailItemById(Long id) {
        return mailItemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("MailItem not found with id: " + id));
    }

}

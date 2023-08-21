package com.test.postalitemsrest.controller;

import com.test.postalitemsrest.model.MailItem;
import com.test.postalitemsrest.service.MailItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail-items")
public class MailItemController {
    private final MailItemService mailItemService;

    public MailItemController(MailItemService mailItemService) {
        this.mailItemService = mailItemService;
    }

    @PostMapping
    public MailItem registerMailItem(@RequestBody MailItem mailItem) {
        return mailItemService.registerMailItem(mailItem);
    }

    @GetMapping("/{id}")
    public MailItem getMailItemById(@PathVariable Long id) {
        return mailItemService.getMailItemById(id);
    }

}

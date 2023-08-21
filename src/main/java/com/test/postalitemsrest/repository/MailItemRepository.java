package com.test.postalitemsrest.repository;

import com.test.postalitemsrest.model.MailItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MailItemRepository extends JpaRepository<MailItem,Long> {
}

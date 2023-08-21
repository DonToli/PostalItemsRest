package com.test.postalitemsrest.repository;

import com.test.postalitemsrest.model.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostOfficeRepository extends JpaRepository<PostOffice,Long> {
}

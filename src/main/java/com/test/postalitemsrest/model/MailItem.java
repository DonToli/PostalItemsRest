package com.test.postalitemsrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;
    private String recipientIndex;
    private String recipientAddress;
    private String recipientName;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

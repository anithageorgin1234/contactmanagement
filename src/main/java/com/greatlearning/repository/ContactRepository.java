package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}

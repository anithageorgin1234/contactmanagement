package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.Contact;

public interface ContactService {
	
	public Contact savecontact(Contact c);
	
	public List<Contact> getContacts();
	public Optional<Contact> getContactById(Long id);
	
	public void deleteContact(Long id);
 
}

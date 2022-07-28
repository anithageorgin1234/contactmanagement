package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Contact;
import com.greatlearning.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepository;
	@Override
	public Contact savecontact(Contact c) {
		// TODO Auto-generated method stub
		return contactRepository.save(c);
	}
	@Override
	public List<Contact> getContacts() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}
	@Override
	public  Optional<Contact> getContactById(Long id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}
	@Override
	public void deleteContact(Long id) {
		  contactRepository.deleteById(id);
		
	}
 

}

package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Contact;
import com.greatlearning.service.ContactService;

@RestController
@CrossOrigin(origins = "*")
public class ContactContoller {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/contact")
   public Contact saveContact(@RequestBody Contact contact)
   {
		System.out.println("===========");
		return  contactService.savecontact(contact);
   }
	
	@GetMapping("/listcontact")
	public List<Contact> list()
	{
		return contactService.getContacts();
	}
	@GetMapping("/listContactById")
	public Optional<Contact> listById(@RequestParam(name="id" ) Long id)
	{
		return contactService.getContactById(id);
	}
	
	@PostMapping("updateContact/{id}")
	public Contact  updateContact(@RequestBody Contact contact,@PathVariable("id") Long id)
	{
		contact.setId(id);
		return  contactService.savecontact(contact);
	}
	@DeleteMapping("deleteContact/{id}")
	public boolean deleteContact(@PathVariable("id") Long id)
	{
		contactService.deleteContact(id);
		return true;
	}
}

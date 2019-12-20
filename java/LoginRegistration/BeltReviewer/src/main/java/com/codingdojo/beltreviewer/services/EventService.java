package com.codingdojo.beltreviewer.services;


import java.util.List;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.codingdojo.beltreviewer.model.Event;
import com.codingdojo.beltreviewer.model.Message;
import com.codingdojo.beltreviewer.model.User;
import com.codingdojo.beltreviewer.repositories.EventRepository;
import com.codingdojo.beltreviewer.repositories.MessageRepository;
import com.codingdojo.beltreviewer.repositories.UserRepository;

@Service
public class EventService {
	private final EventRepository eventRepo;
	private final UserRepository userRepo;
	private final MessageRepository messageRepo;

	
	public EventService(EventRepository eventRepo, UserRepository userRepo,MessageRepository messageRepo) {
		this.eventRepo = eventRepo;
		this.userRepo = userRepo;
		this.messageRepo = messageRepo;
	}


	public Event createEvent(Event events) {
		return eventRepo.save(events);
	}
	public Message createMessage(Message message) {
		return messageRepo.save(message);
	}
	public Event updateEvent(Event events) {
		return eventRepo.save(events);
	}
	 public User findUserById(Long id) {
	    	Optional<User> user = userRepo.findById(id);
	    	
	    	if(user.isPresent()) {
	            return user.get();
	    	} else {
	    	    return null;
	    	}
	    }
	 public User updateUser(User attendee) {
		 return userRepo.save(attendee);
	 }
	 public Event findEventById(Long event_id) {
			return eventRepo.findById(event_id).orElse(null);
		}
	
	//  FIND event in state
	
		public List<Event> eventsInState(String state) {
	    	return eventRepo.findByState(state);
		}
		public List<Event> eventsOutOfState(String state) {
	    	return eventRepo.findByStateIsNot(state);
		}


		public void DeleteEvent(Long eventId) {
			eventRepo.deleteById(eventId);
			
		}


		public List<Event> findAllEvent() {
			return (List<Event>) eventRepo.findAll();
		}


		

		


		

}

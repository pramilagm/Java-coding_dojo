package com.codingdojo.beltreviewer.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="events")
public class Event {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 @Size(min= 1 , message ="Event name cannot be empty")
	 private String eventName;
	
	 
	 @NotNull
	 @FutureOrPresent(message="Enter a present or future date")
	 @DateTimeFormat(pattern ="yyyy-MM-dd")
	 private Date date;
	 @Size(min= 1 , message =" City name cannot be empty")
	 private String city;
	 @Size(min= 1 , message =" State  name cannot be empty")
	 private String state;
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "user_events", 
	        joinColumns = @JoinColumn(name = "event_id"), 
	        inverseJoinColumns = @JoinColumn(name = "user_id")
	    )
	 private List<User> attendees;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="host_id")
	 private User host;
	 @OneToMany(mappedBy="event", fetch = FetchType.LAZY)
	 private List<Message> comments;

	



	public List<Message> getComments() {
		return comments;
	}



	public void setComments(List<Message> comments) {
		this.comments = comments;
	}



	public List<Message> getMessage() {
		return comments;
	}



	public void setMessage(List<Message> message) {
		this.comments = message;
	}



	public List<User> getAttendees() {
		return attendees;
	}



	public void setAttendees(List<User> attendees) {
		this.attendees = attendees;
	}



	public User getHost() {
		return host;
	}



	public void setHost(User host) {
		this.host = host;
	}
	@OneToMany(mappedBy="event", fetch = FetchType.LAZY)
	 private List<Message> messages;
	 

	public List<Message> getMessages() {
		return comments;
	}



	public void setMessages(List<Message> messages) {
		this.comments = messages;
	}



	public Event() {
		 
	 }
	 
	 
	public Event(String eventName,  Date date, String city, String state) {
		this.eventName = eventName;
		
		this.date = date;
		this.city = city;
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	 protected void onCreate(){
	     this.createdAt = new Date();
	 }
	 @PreUpdate
	 protected void onUpdate(){
	     this.updatedAt = new Date();
	 }
	 

}

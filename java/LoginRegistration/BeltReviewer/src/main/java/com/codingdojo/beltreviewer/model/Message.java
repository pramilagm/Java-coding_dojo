package com.codingdojo.beltreviewer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Message {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String message;
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="user_id")
	 private User author;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="event_id")
	 private Event event;
	 public Message() {
		 
	 }
	 
	 public Message(String message) {
		this.message = message;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User user) {
		this.author = user;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
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

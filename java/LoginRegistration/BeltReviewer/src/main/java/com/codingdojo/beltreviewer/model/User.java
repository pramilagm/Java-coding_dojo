package com.codingdojo.beltreviewer.model;

import java.util.Date;



import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


	@Entity
	@Table(name="users")
	public class User {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 @Size(min=4,max=10, message="First name must be between 4-10 characters")
	 private String firstName;
	 @Size(min=4,max=10, message="Last name must be between 4-10 characters")
	 private String lastName;
	 @Email
	 private String email;

	 private String city;

	 private String state;
	 @Size(min=4)
	 private String password;
	 @Transient
	 private String passwordConfirmation;
	 @Column(updatable=false)
	 private Date createdAt;
	 private Date updatedAt;
	 @ManyToMany(fetch = FetchType.LAZY)
	    @JoinTable(
	        name = "user_events", 
	        joinColumns = @JoinColumn(name = "user_id"), 
	        inverseJoinColumns = @JoinColumn(name = "event_id")
	    )
	 private List<Event> attending;
	 @OneToMany(mappedBy="author", fetch = FetchType.LAZY)
	 private List<Message> messages;
	 @OneToMany(mappedBy = "host")
	 private List<Event> hosting;
	 public User() {
	 }
	 public User(String firstName, String lastName, String email, String city, String state, String password,
			String passwordConfirmation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.city = city;
		this.state = state;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
	}
	 
	public List<Event> getHosting() {
		return hosting;
	}
	public void setHosting(List<Event> hosting) {
		this.hosting = hosting;
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




	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public List<Message> getMessages() {
		return messages;
	}


	public void setMessages(List<Message> messages) {
		this.messages = messages;
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

	

	


	public List<Event> getAttending() {
		return attending;
	}
	public void setAttending(List<Event> attending) {
		this.attending = attending;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	 public Long getId() {
		return id;
	}
	 
	 public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}


	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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

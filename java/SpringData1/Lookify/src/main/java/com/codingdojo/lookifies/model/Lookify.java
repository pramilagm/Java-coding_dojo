package com.codingdojo.lookifies.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="lookify")
public class Lookify {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String title;
	@Size(min = 5, max = 200)
	private String artist;		   
	@Range(min = 0, max = 10)
	private Integer rating;
		 
	
			// This will not allow the createdAt column to be updated after creation
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date createdAt;
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date updatedAt;
		    
		   public Lookify() {
			   super();
		   }

			public Lookify(String title, String artist, Integer rating) {
				super();
				this.title = title;
				this.artist = artist;
				this.rating = rating;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getArtist() {
				return artist;
			}

			public void setArtist(String artist) {
				this.artist = artist;
			}

			public Integer getRating() {
				return rating;
			}

			public void setRating(Integer rating) {
				this.rating = rating;
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
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

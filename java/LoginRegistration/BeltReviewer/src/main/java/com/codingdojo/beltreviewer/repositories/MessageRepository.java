package com.codingdojo.beltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.beltreviewer.model.Message;

public interface MessageRepository extends CrudRepository <Message, Long> {

}

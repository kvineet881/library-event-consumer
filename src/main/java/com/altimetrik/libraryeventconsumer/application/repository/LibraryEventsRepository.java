package com.altimetrik.libraryeventconsumer.application.repository;


import com.altimetrik.libraryeventconsumer.application.entity.LibraryEvent;
import org.springframework.data.repository.CrudRepository;

public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}

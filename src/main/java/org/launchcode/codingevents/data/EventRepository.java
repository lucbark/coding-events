package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> { //CrudRepository is the base class storing event
    // objects and the primary key is of the type integer
}


package com.tts.TechTalentTwitter0701.repository;

import com.tts.TechTalentTwitter0701.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
}
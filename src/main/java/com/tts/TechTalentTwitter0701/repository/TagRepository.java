package com.tts.TechTalentTwitter0701.repository;

import com.tts.TechTalentTwitter0701.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    Tag findByPhrase(String phrase);
}
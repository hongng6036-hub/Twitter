package com.tts.TechTalentTwitter0701.repository;
import com.tts.TechTalentTwitter0701.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

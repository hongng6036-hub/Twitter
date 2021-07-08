package com.tts.TechTalentTwitter0701.repository;

import com.tts.TechTalentTwitter0701.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByRole(String role);

}
package com.smartentry.backend.repositories;

import com.smartentry.backend.domain.Role;
import com.smartentry.backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

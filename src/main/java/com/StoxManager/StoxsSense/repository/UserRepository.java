package com.StoxManager.StoxsSense.repository;

import com.StoxManager.StoxsSense.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
}

package com.kingspanapi.kingspanbackend.repository;

import com.kingspanapi.kingspanbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

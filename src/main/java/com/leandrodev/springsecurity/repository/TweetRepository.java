package com.leandrodev.springsecurity.repository;

import com.leandrodev.springsecurity.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
}

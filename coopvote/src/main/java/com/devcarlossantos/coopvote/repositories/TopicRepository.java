package com.devcarlossantos.coopvote.repositories;

import com.devcarlossantos.coopvote.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
}

package com.devcarlossantos.coopvote.repositories;

import com.devcarlossantos.coopvote.models.Topic;
import com.devcarlossantos.coopvote.models.Vote;
import com.devcarlossantos.coopvote.models.enums.VoteType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    boolean existsByAssociateIdAndTopicId(Long associateId, Long topicId);
    long countByTopicAndVoteType(Topic topic, VoteType voteType);
}

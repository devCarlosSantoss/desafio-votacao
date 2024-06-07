package com.devcarlossantos.coopvote.services;

import com.devcarlossantos.coopvote.dtos.VoteDTO;
import com.devcarlossantos.coopvote.models.Topic;
import com.devcarlossantos.coopvote.models.Vote;
import com.devcarlossantos.coopvote.models.enums.VoteType;
import com.devcarlossantos.coopvote.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public VoteDTO saveVote(VoteDTO voteDTO) {
        if (voteRepository.existsByAssociateIdAndTopicId(voteDTO.getAssociateId(), voteDTO.getTopicId())) {
            throw new IllegalStateException("Associate has already voted on this topic");
        }
        Vote vote = new Vote();
        vote.setVoteType(voteDTO.getVoteType());
        voteRepository.save(vote);
        voteDTO.setId(vote.getId());
        return voteDTO;
    }

    public long countVotesByTopicAndVote(Topic topicId, VoteType voteType) {
        return voteRepository.countByTopicAndVoteType(topicId, voteType);
    }
}

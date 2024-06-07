package com.devcarlossantos.coopvote.controllers;

import com.devcarlossantos.coopvote.dtos.VoteDTO;
import com.devcarlossantos.coopvote.models.Topic;
import com.devcarlossantos.coopvote.models.enums.VoteType;
import com.devcarlossantos.coopvote.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/votes")
public class VoteController {
    @Autowired
    private VoteService voteService;

    @GetMapping("/count")
    public long countVotes(@RequestParam Long topicId, @RequestParam VoteType voteType){
        Topic topic = new Topic();
        topic.setId(topicId);
        return voteService.countVotesByTopicAndVote(topic, voteType);
    }

    @PostMapping
    public ResponseEntity<VoteDTO> saveVote(@RequestBody VoteDTO voteDTO){
        return ResponseEntity.ok(voteService.saveVote(voteDTO));
    }
}

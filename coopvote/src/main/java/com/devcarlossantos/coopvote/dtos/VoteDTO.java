package com.devcarlossantos.coopvote.dtos;

import com.devcarlossantos.coopvote.models.enums.VoteType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VoteDTO {
    private Long id;
    private VoteType voteType;
    private Long associateId;
    private Long topicId;
}

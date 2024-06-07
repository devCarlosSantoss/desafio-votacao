package com.devcarlossantos.coopvote.models;

import com.devcarlossantos.coopvote.models.enums.VoteType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private VoteType voteType;
    @ManyToOne
    @JoinColumn(name = "associate_id")
    private Associate associate;
    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

}

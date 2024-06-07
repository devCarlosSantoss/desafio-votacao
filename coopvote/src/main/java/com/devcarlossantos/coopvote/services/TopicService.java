package com.devcarlossantos.coopvote.services;

import com.devcarlossantos.coopvote.dtos.TopicDTO;
import com.devcarlossantos.coopvote.models.Topic;
import com.devcarlossantos.coopvote.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public TopicDTO createTopic(TopicDTO topicDTO) {
        Topic topic = new Topic();
        topic.setName(topicDTO.getName());
        topic.setDescription(topicDTO.getDescription());
        topic = topicRepository.save(topic);
        topicDTO.setId(topic.getId());
        return topicDTO;
    }

    public List<TopicDTO> getAllTopics() {
        return topicRepository.findAll().stream().map(topic -> {
            TopicDTO topicDTO = new TopicDTO();
            topicDTO.setId(topic.getId());
            topicDTO.setName(topic.getName());
            topicDTO.setDescription(topic.getDescription());
            return topicDTO;
        }).collect(Collectors.toList());
    }

}

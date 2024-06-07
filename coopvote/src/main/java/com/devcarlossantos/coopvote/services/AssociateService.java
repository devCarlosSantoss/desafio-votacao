package com.devcarlossantos.coopvote.services;

import com.devcarlossantos.coopvote.dtos.AssociateDTO;
import com.devcarlossantos.coopvote.models.Associate;
import com.devcarlossantos.coopvote.repositories.AssociateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AssociateService {
    @Autowired
    private AssociateRepository associateRepository;

    public AssociateDTO createAssociate(AssociateDTO associateDTO) {
        Associate associate = new Associate();
        associate.setCpf(associate.getCpf());
        associate.setName(associate.getName());
        associate = associateRepository.save(associate);
        associateDTO.setId(associate.getId());
        return associateDTO;
    }

    public List<AssociateDTO> getAllAssociates() {
        return associateRepository.findAll().stream().map(associate -> {
            AssociateDTO associateDTO = new AssociateDTO();
            associateDTO.setId(associate.getId());
            associateDTO.setCpf(associate.getCpf());
            associateDTO.setName(associate.getName());
            return associateDTO;
        }).collect(Collectors.toList());
    }
}

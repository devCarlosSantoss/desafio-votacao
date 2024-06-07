package com.devcarlossantos.coopvote.controllers;

import com.devcarlossantos.coopvote.dtos.AssociateDTO;
import com.devcarlossantos.coopvote.services.AssociateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/associates")
public class AssociateController {
    @Autowired
    private AssociateService associateService;

    @PostMapping
    public ResponseEntity<AssociateDTO> createAssociate(@RequestBody AssociateDTO associateDTO) {
        return ResponseEntity.ok(associateService.createAssociate(associateDTO));
    }

    @GetMapping
    public ResponseEntity<List<AssociateDTO>> getAllAssociates() {
        return ResponseEntity.ok(associateService.getAllAssociates());
    }
}

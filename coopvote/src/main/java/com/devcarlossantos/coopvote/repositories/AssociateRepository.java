package com.devcarlossantos.coopvote.repositories;

import com.devcarlossantos.coopvote.models.Associate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Long> {
}

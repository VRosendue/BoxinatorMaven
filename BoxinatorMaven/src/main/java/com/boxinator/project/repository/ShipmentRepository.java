package com.boxinator.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boxinator.project.models.Shipments;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipments, Long> {

}

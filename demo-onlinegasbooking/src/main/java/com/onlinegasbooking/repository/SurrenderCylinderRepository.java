package com.onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinegasbooking.entity.SurrenderCylinder;

@Repository
public interface SurrenderCylinderRepository extends JpaRepository<SurrenderCylinder, Integer>{

}

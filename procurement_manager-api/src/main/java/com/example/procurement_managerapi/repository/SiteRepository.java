package com.example.procurement_managerapi.repository;

import com.example.procurement_managerapi.entity.SiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SiteRepository extends JpaRepository<SiteEntity,Long> {
}

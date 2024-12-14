package com.ringoxcoffee.database_access.repository;

import com.ringoxcoffee.database_access.model.SampleSaveTarget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleSaveTarget, Long> {
}

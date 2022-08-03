package com.labassistantapi.repository;

import com.labassistantapi.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, String> {
    List<Calculation> findCalculationByTitle(String title) throws Exception;
}

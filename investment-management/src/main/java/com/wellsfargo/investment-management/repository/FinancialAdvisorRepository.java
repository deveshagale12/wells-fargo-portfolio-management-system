package com.wellsfargo.investmentmanagement.repository;

import com.wellsfargo.investmentmanagement.model.FinancialAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FinancialAdvisorRepository 
    extends JpaRepository<FinancialAdvisor, Long> {}

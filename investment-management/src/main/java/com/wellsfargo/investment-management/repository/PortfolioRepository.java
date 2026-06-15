package com.wellsfargo.investmentmanagement.repository;

import com.wellsfargo.investmentmanagement.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PortfolioRepository 
    extends JpaRepository<Portfolio, Long> {}

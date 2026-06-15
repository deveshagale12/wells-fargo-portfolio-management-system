package com.wellsfargo.investmentmanagement.repository;

import com.wellsfargo.investmentmanagement.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository 
    extends JpaRepository<Security, Long> {}

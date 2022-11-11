package com.smartentry.backend.repositories;

import com.smartentry.backend.domain.CarCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCompanyRepository extends JpaRepository<CarCompany, Integer> {
}

package com.capy.capybara_api.repository;

import com.capy.capybara_api.models.Capybara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapibaraRepository extends JpaRepository<Capybara, Long> {
    // métodos do CRUD
}
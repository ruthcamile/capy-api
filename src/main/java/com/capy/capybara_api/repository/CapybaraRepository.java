package com.capy.capybara_api.repository;
// repository: salvar no banco
import com.capy.capybara_api.models.Capybara;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapybaraRepository extends JpaRepository<Capybara, Long> {
    // métodos do CRUD
}
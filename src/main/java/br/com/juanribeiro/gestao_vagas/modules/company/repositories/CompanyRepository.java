package br.com.juanribeiro.gestao_vagas.modules.company.repositories;

import java.util.UUID;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juanribeiro.gestao_vagas.modules.company.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID>{
  Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
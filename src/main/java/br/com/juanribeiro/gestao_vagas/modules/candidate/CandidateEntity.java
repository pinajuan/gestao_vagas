package br.com.juanribeiro.gestao_vagas.modules.candidate;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  
  @Schema(example = "Juan Pina", requiredMode = RequiredMode.REQUIRED, description = "Nome do candidato")
  private String name;

  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços!")
  @Schema(example = "pina", requiredMode = RequiredMode.REQUIRED, description = "Username do candidato")
  private String username;

  @Email(message = "O campo [email] deve conter um email válido!")
  @Schema(example = "juan@gmail.com", requiredMode = RequiredMode.REQUIRED, description = "Email do candidato")
  private String email;

  @Length(min = 10, max = 100, message = "O campo [senha] deve estar entre 10 e 100 caracteres!")
  @Schema(example = "admin@1234", minLength = 10, maxLength = 100, requiredMode = RequiredMode.REQUIRED, description = "Senha do candidato")
  private String password;

  @Schema(example = "Desenvolvedor Java estudando novas linguagens e tecnologias", requiredMode = RequiredMode.REQUIRED, description = "Descrição do candidato")
  private String description;

  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createdAt;
  
}

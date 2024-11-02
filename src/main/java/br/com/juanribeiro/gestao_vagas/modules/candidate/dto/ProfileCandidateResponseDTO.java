package br.com.juanribeiro.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

  private UUID id;

  @Schema(example = "Juan Pina")
  private String name;

  @Schema(example = "pina")
  private String username;

  @Schema(example = "Desenvolvedor Java")
  private String description;
  
  @Schema(example = "juan@gmail.com")
  private String email;
  
}

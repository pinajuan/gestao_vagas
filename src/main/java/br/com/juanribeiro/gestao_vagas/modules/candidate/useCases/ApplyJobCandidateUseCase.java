package br.com.juanribeiro.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.juanribeiro.gestao_vagas.exceptions.JobNotFoundException;
import br.com.juanribeiro.gestao_vagas.exceptions.UserNotFoundException;
import br.com.juanribeiro.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.juanribeiro.gestao_vagas.modules.candidate.repository.ApplyJobRepository;
import br.com.juanribeiro.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {
 
  @Autowired
  private CandidateRepository candidateRepository;
  
  @Autowired
  private JobRepository jobRepository;

  @Autowired
  private ApplyJobRepository applyJobRepository;

  public void execute(UUID idCandidate, UUID idJob) {
    // Validando se o candidato existe
    this.candidateRepository.findById(idCandidate)
      .orElseThrow(() -> {
        throw new UserNotFoundException();
      });

    // Validando se o job existe
    this.jobRepository.findById(idJob)
      .orElseThrow(() -> {
        throw new JobNotFoundException();
      });

    // Inscrevendo o candidata à vaga

  } 

}
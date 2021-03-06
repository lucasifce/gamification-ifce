package io.github.lucasifce.gamification.domain.service;

import io.github.lucasifce.gamification.api.dto.professor.ProfessorDTO;
import io.github.lucasifce.gamification.api.dto.professor.ProfessorFindDTO;
import io.github.lucasifce.gamification.domain.model.Professor;

import java.util.List;

public interface ProfessorService {

    List<ProfessorDTO> findProfessorDTO(Professor filtro);
    List<ProfessorFindDTO> findProfessor(Professor filtro);

    ProfessorDTO getProfessorByIdDTO(Long id);
    Professor getProfessorById(Long id);

    Professor save(Professor professor);
    ProfessorDTO update(ProfessorDTO dto, Long id);
    void deleteProfessor(Long id);

}
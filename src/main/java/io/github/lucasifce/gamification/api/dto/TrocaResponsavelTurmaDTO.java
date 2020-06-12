package io.github.lucasifce.gamification.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
public class TrocaResponsavelTurmaDTO {

    @NotNull
    @JsonProperty("id_turma")
    private Long idTurma;

    @NotNull
    @JsonProperty("id_responsavel")
    private Long idResponsavel;

    @NotNull
    @JsonProperty("id_novo_responsavel")
    private Long idNovoResponsavel;

}
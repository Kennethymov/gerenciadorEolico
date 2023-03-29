package br.com.ada.gerenciadorEolico.dto;

import br.com.ada.gerenciadorEolico.domain.AerogeradorStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
public class AerogeradorSaveDTO {
    @NotBlank(message = "Modelo é um campo obrigatorio")
    private String modelo;

    @NotBlank
    private String numeroSerie;
    @NotNull
    private AerogeradorStatus status;

    @NotNull
    private Long parqueEolicoId;
}
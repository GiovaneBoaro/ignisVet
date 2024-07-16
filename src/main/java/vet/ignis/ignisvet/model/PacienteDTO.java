package vet.ignis.ignisvet.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PacienteDTO(

        @NotBlank
        String nome_animal,

        @NotNull
        Integer idade_animal,

        @NotNull
        Especie especie_animal,

        @NotBlank
        String nome_dono,

        @NotBlank
        @Email
        String email_dono,

        @NotBlank
        String telefone_dono,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf_dono) {
}

package vet.ignis.ignisvet.model.veterinario;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import vet.ignis.ignisvet.model.endereco.EnderecoDTO;

public record VeterinarioDTO(

        @NotBlank
        String nome,

        @NotNull
        Especialidade especialidade,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String celular,

        @NotBlank
        @Pattern(regexp = "\\d{6,7}")
        String crmv,

        @NotNull
        @Valid
        EnderecoDTO endereco) {
}

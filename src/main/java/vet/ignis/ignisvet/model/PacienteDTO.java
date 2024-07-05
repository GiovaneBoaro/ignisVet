package vet.ignis.ignisvet.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;

public record PacienteDTO(

        @NotBlank
        String nomeAnimal,

        @NotBlank
        int idadeAnimal,

        @NotNull
        Especie especieAnimal,

        @NotBlank
        String nomeDono,

        @NotBlank
        @Email
        String emailDono,

        @NotBlank
        String telefoneDono,

        @NotBlank
        @CPF
        String cpfDono) {

}

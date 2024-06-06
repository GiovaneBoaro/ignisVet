package vet.ignis.ignisvet.model.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EnderecoDTO (

        @NotBlank
        String logradouro,


        String numero,


        String complemento,

        @NotBlank
        String cidade,

        @NotBlank
        String bairro,

        @NotBlank
        String uf,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep) {
}

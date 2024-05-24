package vet.ignis.ignisvet.model.veterinario;

import vet.ignis.ignisvet.model.endereco.EnderecoDTO;

public record VeterinarioDTO(String nome, Especialidade especialidade, String email, String celular, String crmv, EnderecoDTO endereco) {
}

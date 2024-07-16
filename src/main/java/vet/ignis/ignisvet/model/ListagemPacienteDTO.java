package vet.ignis.ignisvet.model;

public record ListagemPacienteDTO(String nome_animal, Especie especie, int idade_animal, String nome_dono) {

    public ListagemPacienteDTO(Paciente paciente) {
        this(paciente.getNome_animal(), paciente.getEspecie_animal(), paciente.getIdade_animal(), paciente.getNome_dono());
    }
}

package vet.ignis.ignisvet.model.veterinario;

public record ListagemVeterinarioDTO(String nome, String email, String crmv, Especialidade especialidade) {

    public ListagemVeterinarioDTO(Veterinario veterinario) {
        this(veterinario.getNome(), veterinario.getEmail(), veterinario.getCrmv(), veterinario.getEspecialidade());
    }
}

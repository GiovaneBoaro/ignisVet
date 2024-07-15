package vet.ignis.ignisvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vet.ignis.ignisvet.model.veterinario.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

}

package vet.ignis.ignisvet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vet.ignis.ignisvet.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}

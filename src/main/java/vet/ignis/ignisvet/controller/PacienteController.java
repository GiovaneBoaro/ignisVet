package vet.ignis.ignisvet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vet.ignis.ignisvet.model.Paciente;
import vet.ignis.ignisvet.model.PacienteDTO;
import vet.ignis.ignisvet.repository.PacienteRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody PacienteDTO dados) {
        repository.save(new Paciente(dados));
    }
}

package vet.ignis.ignisvet.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import vet.ignis.ignisvet.model.ListagemPacienteDTO;
import vet.ignis.ignisvet.model.Paciente;
import vet.ignis.ignisvet.model.PacienteDTO;
import vet.ignis.ignisvet.repository.PacienteRepository;

import java.util.List;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid PacienteDTO dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public List<ListagemPacienteDTO> listar() {
        return repository.findAll();
    }

}

package com.capy.capybara_api.controller;

import com.capy.capybara_api.models.Capybara;
import com.capy.capybara_api.repository.CapybaraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/capivaras")
@CrossOrigin(origins = "*") // Permite que o React Native acesse as rotas livremente
public class CapybaraController {

    @Autowired
    private CapybaraRepository repository;

    // 1. POST - Cadastrar uma nova capivara
    @PostMapping
    public Capybara criar(@RequestBody Capybara capivara) {
        return repository.save(capivara);
    }

    // 2. GET - Listar todas as capivaras cadastradas
    @GetMapping
    public List<Capybara> listarTodas() {
        return repository.findAll();
    }

    // 3. PUT - Editar os dados de uma capivara existente
    @PutMapping("/{id}")
    public Capybara editar(@PathVariable Long id, @RequestBody Capybara capivaraAtualizada) {
        return repository.findById(id).map(capivara -> {
            capivara.setNome(capivaraAtualizada.getNome());
            capivara.setFotoUrl(capivaraAtualizada.getFotoUrl());
            capivara.setDescricao(capivaraAtualizada.getDescricao());
            return repository.save(capivara);
        }).orElseThrow(() -> new RuntimeException("Ei essa capivarinha não existe: " + id));
    }

    // 4. DELETE - Apagar uma capivara pelo ID
    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "Tchau tchau capivara deletada com sucesso! 🦦";
    }
}
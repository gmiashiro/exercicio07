package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.FornecedorModel;
import com.exercicios.exercicio.repositories.FornecedorRepository;
import com.exercicios.exercicio.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping
    public FornecedorModel save(@RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.save(fornecedorModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        fornecedorService.deleteById(id);
    }

    @GetMapping
    public List<FornecedorModel> findAll(){
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public FornecedorModel findById(@PathVariable Long id){
        return fornecedorService.findById(id);
    }
}

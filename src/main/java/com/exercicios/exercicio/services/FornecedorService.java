package com.exercicios.exercicio.services;

import com.exercicios.exercicio.model.FornecedorModel;
import com.exercicios.exercicio.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public FornecedorModel save(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }

    public void deleteById(Long id) {
        fornecedorRepository.deleteById(id);
    }

    public FornecedorModel findById(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public List<FornecedorModel> findAll() {
        return fornecedorRepository.findAll();
    }
}

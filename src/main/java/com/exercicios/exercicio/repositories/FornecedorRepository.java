package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel,Long> {
}

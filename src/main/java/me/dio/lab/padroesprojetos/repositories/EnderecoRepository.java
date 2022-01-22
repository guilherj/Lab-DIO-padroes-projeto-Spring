package me.dio.lab.padroesprojetos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.lab.padroesprojetos.entities.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}

package br.com.vita.exercio.cruzvitamysqlconfig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vita.exercio.cruzvitamysqlconfig.model.Aluno;

@Repository
public interface ConexaoRepository extends JpaRepository<Aluno, Long>{

}

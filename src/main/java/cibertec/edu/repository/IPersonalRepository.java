package cibertec.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.edu.modelo.Personal;

@Repository
public interface IPersonalRepository extends JpaRepository<Personal, Long> {

	public List<Personal> findAll();
	List<Personal> findByNombre(String nombre);

}

package cibertec.edu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.edu.modelo.Personal;
import cibertec.edu.repository.IPersonalRepository;

@Service
public class PersonalService {
	
	@Autowired
	private IPersonalRepository personalRepository;
	
	public List<Personal> buscarPorNombre(String nombre){
		return personalRepository.findByNombre(nombre);
	}
	
	public List<Personal> buscarTodos(){
		return personalRepository.findAll();
	}
	
	public Personal getOnePersonal(Long cod){
		Optional<Personal> personalResult = personalRepository.findById(cod);
		return personalResult.isPresent()? personalResult.get() : null;
	}

}

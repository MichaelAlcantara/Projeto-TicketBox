package com.michael.backend.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.michael.backend.domain.Cliente;
import com.michael.backend.repository.ClienteRepository;
import com.michael.backend.service.exception.DataIntegrityViolationException;
import com.michael.backend.domain.dto.ClienteDTO;

@Service
@CrossOrigin("http://localhost:4200")
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> findAll(){
        return repository.findAll();
    }
    
    public Cliente findById(Integer idCliente) {
        Optional<Cliente> obj = repository.findById(idCliente);
        return obj.orElse(null);
    }
    
    public Cliente create(ClienteDTO objDTO) {
        objDTO.setIdCliente(null);
        validaPorCpfEEmail(objDTO);
        Cliente newObj = new Cliente(objDTO);
        return repository.save(newObj);
    }
    
    public Cliente uptade(Integer id, @Valid ClienteDTO objDTO) {
        objDTO.setIdCliente(id);
        Cliente oldObj = findById(id);
        validaPorCpfEEmail(objDTO);
        oldObj = new Cliente(objDTO);
        
        return repository.save(oldObj);
    }
    
    public String findByEmail(String email,String senha) {
            String valida;
            Optional<Cliente> obj = repository.findByEmail(email);
            
            if(obj.isPresent() && obj.get().getSenha().equals(senha)) {
                valida = "true";
            }else {
                valida = "false";
            }
            return valida;
    }

    private void validaPorCpfEEmail(ClienteDTO objDTO) {
        Optional<Cliente> obj = repository.findByEmail(objDTO.getEmail());
        
        if(obj.isPresent() && obj.get().getIdCliente() != objDTO.getIdCliente()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema!");
        }
    }
    
    

    
}

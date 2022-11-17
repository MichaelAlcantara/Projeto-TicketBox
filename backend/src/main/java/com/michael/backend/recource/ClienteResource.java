package com.michael.backend.recource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.michael.backend.domain.Cliente;
import com.michael.backend.domain.dto.ClienteDTO;
import com.michael.backend.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
@CrossOrigin("http://localhost:4200")
public class ClienteResource {
    
   @Autowired 
   private ClienteService service; 
   
   @GetMapping(value = "/{idCliente}")
   public ResponseEntity<ClienteDTO> findById(@PathVariable Integer idCliente) {
       Cliente obj = service.findById(idCliente);
       return ResponseEntity.ok().body(new ClienteDTO(obj));
   }
   
   @GetMapping
   public ResponseEntity<List<ClienteDTO>> findAll(){
       List<Cliente> list = service.findAll();
       List<ClienteDTO> listDTO = list.stream().map(obj -> new ClienteDTO(obj)).collect(Collectors.toList());
       return ResponseEntity.ok().body(listDTO);
   }
   
   @PostMapping(value = "cadastra")
   public ResponseEntity<ClienteDTO> create(@Valid @RequestBody ClienteDTO objDTO) {
       Cliente newObj = service.create(objDTO);
       URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getIdCliente()).toUri();
       return ResponseEntity.created(uri).build();
   }
   
   @PutMapping(value = "/{id}")
   public ResponseEntity<ClienteDTO> uptade(@PathVariable Integer id,@Valid @RequestBody ClienteDTO objDTO){
       Cliente obj = service.uptade(id, objDTO);
       return ResponseEntity.ok().body(new ClienteDTO(obj));
   }
   
   @PostMapping(value = "/login")
   public ResponseEntity<String> validaLogin(@Valid @RequestBody ClienteDTO objDTO){
       String obj = service.findByEmail(objDTO.getEmail(), objDTO.getSenha());
       
       
       return ResponseEntity.ok().body(obj);
   }
}

package co.litethinking.core.appbackend.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.litethinking.core.appbackend.service.DTO.ClienteDTO;
import co.litethinking.core.appbackend.service.services.clienteService.ClienteServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClienteControllers {
    @Autowired
    private ClienteServiceInt service;

    @PostMapping("/clientes")
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody ClienteDTO clienteDTO) {
        ClienteDTO respuesta = service.createCliente(clienteDTO);
        if(respuesta == null){
            return new ResponseEntity<ClienteDTO>(respuesta,HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<ClienteDTO>(respuesta, HttpStatus.CREATED);
    }
    

    @GetMapping("/clientes/{id}")
    public ResponseEntity<ClienteDTO> readCliente(@PathVariable String id) {
        ClienteDTO cliente = service.readCliente(id);
        if(cliente==null){
            return new ResponseEntity<ClienteDTO>(cliente,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ClienteDTO>(cliente,HttpStatus.FOUND);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDTO>> readClientes() {
        List<ClienteDTO> respuesta= service.readClientes();
        return new ResponseEntity<List<ClienteDTO>>(respuesta, HttpStatus.OK);
    }
    
    @PutMapping("/clientes/{id}")
    public ResponseEntity<ClienteDTO> updateCliente(@PathVariable String id, @RequestBody ClienteDTO clienteDTO) {
        ClienteDTO respuesta = service.updateCliente(id, clienteDTO);
        if(respuesta==null){
            return new ResponseEntity<ClienteDTO>(respuesta, HttpStatus.NOT_MODIFIED);
        }
        return new ResponseEntity<ClienteDTO>(respuesta, HttpStatus.OK);
    }
}

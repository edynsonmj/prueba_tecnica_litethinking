package co.litethinking.core.appbackend.service.services.clienteService;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.litethinking.core.appbackend.models.Cliente;
import co.litethinking.core.appbackend.repositories.ClienteRepository;
import co.litethinking.core.appbackend.service.DTO.ClienteDTO;

@Service
public class ClienteServiceImp implements ClienteServiceInt{
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    @Qualifier("cliente")
    private ModelMapper modelMapper;

    public ClienteDTO createCliente(ClienteDTO clienteDTO){
        ClienteDTO respuesta = null;
        Cliente clienteEntity = this.modelMapper.map(clienteDTO, Cliente.class);
        Cliente objClienteAlmacenado = clienteRepository.save(clienteEntity);
        respuesta = modelMapper.map(objClienteAlmacenado, ClienteDTO.class);
        return respuesta;
    }

    @Override
    public ClienteDTO readCliente(String id) {
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        if(cliente==null){
            return null;
        }
        ClienteDTO clienteDTO = this.modelMapper.map(cliente.get(),ClienteDTO.class);
        return clienteDTO;
    }

    @Override
    public List<ClienteDTO> readClientes(){
        Iterable<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDTO> clientesDTO = modelMapper.map(clientes,
                new TypeToken<List<ClienteDTO>>() {}.getType());
        return clientesDTO;
    }

    @Override
    public ClienteDTO updateCliente(String id, ClienteDTO cliente){
        Cliente clienteAlmacenado = clienteRepository.findById(id).orElse(null);
        if(clienteAlmacenado==null){
            return null;
        }
        Cliente clienteActualizado = this.modelMapper.map(cliente,Cliente.class);
        Cliente respuesta = this.clienteRepository.save(clienteActualizado);
        return this.modelMapper.map(respuesta, ClienteDTO.class);
    }

    @Override
    public ClienteDTO deleteCliente(String id){
        Cliente respuesta = clienteRepository.findById(id).orElse(null);
        if(respuesta !=null){
            clienteRepository.deleteById(id);
            if(clienteRepository.findById(id)!=null){
                return null;
            }
            return this.modelMapper.map(respuesta, ClienteDTO.class);
        }
        return null;
    }
}
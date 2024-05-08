package co.litethinking.core.appbackend.service.services.clienteService;

import java.util.List;

import co.litethinking.core.appbackend.models.Cliente;
import co.litethinking.core.appbackend.service.DTO.ClienteDTO;

public interface ClienteServiceInt {
    public ClienteDTO createCliente(ClienteDTO cliente);
    public ClienteDTO readCliente(String id);
    public List<ClienteDTO> readClientes();
    public ClienteDTO updateCliente(String id, ClienteDTO cliente);
    public ClienteDTO deleteCliente(String id);
}

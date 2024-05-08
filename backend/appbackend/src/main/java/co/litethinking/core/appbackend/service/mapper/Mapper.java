package co.litethinking.core.appbackend.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.litethinking.core.appbackend.models.Cliente;
import co.litethinking.core.appbackend.service.DTO.ClienteDTO;

@Configuration
public class Mapper {
    @Bean(name="cliente")
    public ModelMapper clienteMapper() {
        ModelMapper objMapper = new ModelMapper();
        TypeMap<Cliente, ClienteDTO> mapa = objMapper.emptyTypeMap(Cliente.class, ClienteDTO.class);
        mapa.addMappings(asg -> asg.skip(ClienteDTO::setOrdenes)).implicitMappings();
        return objMapper;
    }
}

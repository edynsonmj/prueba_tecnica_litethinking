package co.litethinking.core.appbackend.service.DTO;

import java.util.List;

import co.litethinking.core.appbackend.models.Orden;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ClienteDTO {
    
    private String id;
        
    private String nombre;

    private List<Orden> ordenes;
}

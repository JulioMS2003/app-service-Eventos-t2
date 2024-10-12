package pe.edu.cibertec.app_service_Eventos_t2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_service_Eventos_t2.remoteservice.ServiceLibrosClient;
import pe.edu.cibertec.app_service_Eventos_t2.remoteservice.ServiceMerchandisingClient;

@RequiredArgsConstructor
@RestController
public class GestionEventosController {

    private final ServiceMerchandisingClient serviceMerchandisingClient;
    private final ServiceLibrosClient serviceLibrosClient;

    @GetMapping("/eventos")
    public String obtenerEventos(){
        return "Lista de eventos de Wigetta";
    }

    @GetMapping("/eventos-lugar")
    public String obtenerLugar(){
        return "Lugar de eventos de Wigetta";
    }

    @GetMapping("/eventos-merchandising")
    public String obtenerLibrosMerchandisign(){
        return serviceMerchandisingClient.obtenerMerchandising();
    }

    @GetMapping("/eventos-libros")
    public String obtenerLibrosEventos(){
        return serviceLibrosClient.obtenerLibros();
    }

}

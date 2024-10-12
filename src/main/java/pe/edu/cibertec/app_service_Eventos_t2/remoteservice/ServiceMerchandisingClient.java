package pe.edu.cibertec.app_service_Eventos_t2.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-service-Merchandising-t2")
public interface ServiceMerchandisingClient {

    @GetMapping("/merchandising")
    String obtenerMerchandising();

}

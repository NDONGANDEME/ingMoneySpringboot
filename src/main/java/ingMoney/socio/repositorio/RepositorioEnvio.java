package ingMoney.socio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ingMoney.socio.entidades.Envio;
@CrossOrigin("*")
@RepositoryRestResource
public interface RepositorioEnvio extends JpaRepository<Envio, Long> {
 
}

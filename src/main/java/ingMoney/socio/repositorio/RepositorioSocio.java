package ingMoney.socio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ingMoney.socio.entidades.Socio;

@RepositoryRestResource
public interface RepositorioSocio extends JpaRepository<Socio,Long>
{}

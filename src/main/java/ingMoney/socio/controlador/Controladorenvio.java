package ingMoney.socio.controlador;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ingMoney.socio.entidades.Envio;
import ingMoney.socio.repositorio.RepositorioEnvio;
@CrossOrigin("*")
@RestController
@RequestMapping(path="/envios")
public class Controladorenvio implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Autowired
	private RepositorioEnvio re;
	@GetMapping("/listarenvios")
	public List<Envio>getenvios()
	{
		System.out.println("Back-End responde a Front......");
		return re.findAll();
	}
	@PostMapping("/anadirenvio")
	public Envio guardarEnvio(@RequestBody Envio e)
	{
		return re.save(e);
	}
	
}

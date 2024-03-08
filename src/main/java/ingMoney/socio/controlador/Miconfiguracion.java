package ingMoney.socio.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Miconfiguracion 
{
	/*@Value("${nombre}")
	private String nombre;
	@Value("${edad}")
	private int edad;

	@GetMapping("/miconfiguracion")
	public Map<String, Object>getConfiguracion()
	{
		Map<String,Object>configuraciones=new HashMap<>();
		configuraciones.put("nombre", nombre);
		configuraciones.put("edad", edad);
		configuraciones.put("Hilo", Thread.currentThread().getName());
		return configuraciones;
	}*/
	
}

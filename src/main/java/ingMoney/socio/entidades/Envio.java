package ingMoney.socio.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Spring Data JPA
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Envio
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Date fecha;
	private float monto;
	private Long idclienterecepcion;
	private Long idclienteenvio;
	@ManyToOne
	private Socio socio;
	//private Long idsocio;
	private String mensaje;

	
}

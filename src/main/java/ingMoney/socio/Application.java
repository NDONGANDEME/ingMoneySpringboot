package ingMoney.socio;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import ingMoney.socio.entidades.Envio;
import ingMoney.socio.repositorio.RepositorioEnvio;
import ingMoney.socio.repositorio.RepositorioSocio;
@EnableDiscoveryClient
@SpringBootApplication
public class Application 
{
	public static void main(String[] args) {
	}
	@Bean
	CommandLineRunner start(RepositorioEnvio  re,RepositorioSocio rs)
	{
		return (args)->{
			 for(int i=1;i<3;i++)
			 {
				 /*Socio s=new Socio(null, "Alfredo", "MBA", "222747474", "Malabo");
				 s = rs.save(s);*/
				 re.save(new Envio(null, null, 500*i, null, null, null, null));
			 }
		};
	}
	/*
	 * dependencia para conectarnos con una base de datos MySql
	   <dependency>
    		<groupId>mysql</groupId>
    		<artifactId>mysql-connector-java</artifactId>
  		</dependency>
	 
	 
	 
*******propiedades de configuracion My SQL******
	 
spring.datasource.url = jdbc:mysql://localhost/database_name
spring.datasource.username = mysql-userId
spring.datasource.password = mysql-pwd

# Keep the connection alive if idle for a long time (needed in production)
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1

# Show or not log for each sql query
spring.jpa.show-sql = true

# Hibernate ddl auto (create, create-drop, update)
spring.jpa.hibernate.ddl-auto = update

# Naming strategy (Not necessary to add but you can use this too)
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy

# Use spring.jpa.properties.* for Hibernate native properties (the prefix is
# stripped before adding them to the entity manager)

# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
	 
	 */
	
	
	
	
	
	
/*
	@Bean 
	CommandLineRunner start(RepositorioEnvio re) {
		return args->{
			Stream.of("Le han tranferido","No le").forEach(cn->{
				re.save(new Envio(null, 0, null, null, null, cn));
			});
		};
	}*/
	
	
	
}

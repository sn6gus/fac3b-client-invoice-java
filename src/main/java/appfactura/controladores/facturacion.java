package appfactura.controladores;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.mail.MessagingException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import appfactura.beans.GenerarFactura;
import appfactura.beans.Ticket;
import appfactura.modelos.Mfacturacion;
import appfactura.modelos.Mkeyvault;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/t3b-facturacion")
public class facturacion {
	
	@Autowired
	Mfacturacion mf;
	
	@Autowired
	Mkeyvault kv;
	
	JSONObject values;
	
	@PostConstruct
	void keyVault() {
		values = kv.values(1);
	}
	
	@GetMapping({"/",""})
	public String inicio() throws IOException, MessagingException{		 
		return "Facturacion T3B V2.1 "+(values != null);
	}
	
	@PostMapping("/generarFactura")
	public List<Ticket> generarFactura(@RequestBody(required = true) GenerarFactura generarfacturas){			
		return mf.crearFactura(mf.getRequests(generarfacturas.getFclientes(), generarfacturas.getTickets()), generarfacturas.getTickets(), values);
	}
	
}

package gestione_asta.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gestione_asta.MySecurityContext;
import gestione_asta.dto.UtenteDTO;
import gestione_asta.Service.GestioneUtenteBE;

@RestController
@RequestMapping("/")
public class GestioneUtenteontroller {
	
	@Autowired
	GestioneUtenteBE service;
	
	@RequestMapping("/{username}")
	@ResponseBody
	public UtenteDTO load(@PathVariable("username") String username) {
		String email = MySecurityContext.getEmail();
		System.out.println(email);
		return service.load(username);
	}

}

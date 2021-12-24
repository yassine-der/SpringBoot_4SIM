package tn.esprit.tpspringboot.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.tpspringboot.entity.Client;
import tn.esprit.tpspringboot.service.ClientSerivce;

@RestController
@RequestMapping("/client")
public class ClientRestController {
	@Autowired
	ClientSerivce clientService;
	
	
	//http://localhost:8089/SpringMVC/client/retrieve-all-clients
	@GetMapping("/retrieve-all-clients")
	@ResponseBody
	public List<Client> getClients(){
		List<Client> listClient = clientService.retrieveAllClients();
		return listClient;
	}
	
	@GetMapping("/retrieve-client")
	@ResponseBody
	public Client getClient(@PathVariable("client-id") long clientId){
		Client client = clientService.retrieveClient(clientId);
				return client;
	}
	@PostMapping("/addClient")
	@ResponseBody
	public Client addClient(@RequestBody Client c){
		Client client = clientService.addClient(c);
				return client;
	}

}

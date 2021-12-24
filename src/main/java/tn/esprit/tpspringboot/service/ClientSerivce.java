package tn.esprit.tpspringboot.service;

import java.util.List;


import tn.esprit.tpspringboot.entity.Client;




public interface ClientSerivce {
	public List<Client> retrieveAllClients();
	public Long addClient(Client c);
	public void deleteClient(Long id);
	public Long update(Client c);
	public Client retrieveClient(Long id);
	

}


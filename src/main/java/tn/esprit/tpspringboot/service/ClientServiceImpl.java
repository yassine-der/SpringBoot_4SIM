package tn.esprit.tpspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tpspringboot.entity.Client;
import tn.esprit.tpspringboot.repository.ClientRepository;


@Service
public class ClientServiceImpl implements ClientSerivce{
	@Autowired
	ClientRepository  clientRepository;
	@Override
	public List<Client> retrieveAllClients() {
		List<Client> client =(List<Client>) clientRepository.findAll();
		return client;
	}

	@Override
	public Long addClient(Client c) {
		clientRepository.save(c);
		return c.getIdClient();
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
		
	}

	@Override
	public Long update(Client c) {
		// TODO Auto-generated method stub
		clientRepository.save(c);
		return c.getIdClient();
	}

	@Override
	public Client retrieveClient(Long id) {
		// TODO Auto-generated method stub
		return clientRepository.findById(id).get();
	}

}
/*@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;

	public List<Client> retrieveAllClients() {
		List<Client> client = (List<Client>) clientRepository.findAll();

		return client;
	}

	public Long addClient(Client c) {
		clientRepository.save(c);
		return c.getIdClient();
	}

	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	public Long updateClient(Client c) {

		clientRepository.save(c);
		return c.getIdClient();
	}

	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> retrieveClientsByProfession(Profession profession) {

		List<Client> clientProfession = clientRepository.retrieveClientsByProfession(profession);
		return clientProfession;
	}

	@Override
	public int deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession) {
		return clientRepository.deleteClientByCategorieClientAndProfession(categorieClient, profession);
	}

	@Override
	public int updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
		return clientRepository.updateClientCategorieByProfession(categorieClient, profession);
	}
}
*/
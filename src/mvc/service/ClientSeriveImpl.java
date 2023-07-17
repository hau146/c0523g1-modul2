package mvc.service;

import mvc.model.ClientModel;
import mvc.repository.ClienRepositorytlmpl;
import mvc.repository.IClientRepository;

public class ClientSeriveImpl implements ICilentService {
    private IClientRepository client = new ClienRepositorytlmpl();

    @Override
    public ClientModel[] finAll() {
        return client.findAll();
    }

    @Override
    public void addCilent(ClientModel cilentController) {
        client.addCilent(cilentController);
    }

    @Override
    public void deleteCilentById(int id) {
        client.deleteCilent(id);
    }

    @Override
    public void seachClient(String name) {
        client.seachClient(name);
    }


}

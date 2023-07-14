package mvc.service;

import mvc.model.Client;
import mvc.repository.Clientlmpl;
import mvc.repository.IClient;

public class ClientSeriveLmpl implements ICilentService {
    private IClient client = new Clientlmpl();

    @Override
    public Client[] finAll() {
        return client.findAll();
    }

    @Override
    public void addCilent(Client cilentController) {
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

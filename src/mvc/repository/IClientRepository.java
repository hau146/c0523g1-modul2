package mvc.repository;

import mvc.model.ClientModel;

public interface IClientRepository {
    ClientModel[] findAll();
    void addCilent(ClientModel client);

    void deleteCilent(int client);
    void seachClient(String name);
}

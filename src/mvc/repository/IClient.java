package mvc.repository;

import mvc.model.Client;

public interface IClient {
    Client[] findAll();
    void addCilent(Client client);

    void deleteCilent(int client);
    void seachClient(String name);
}

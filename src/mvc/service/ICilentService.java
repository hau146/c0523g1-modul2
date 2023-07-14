package mvc.service;

import mvc.model.Client;

public interface ICilentService {
    Client[] finAll();
    void addCilent (Client cilentController);
    void deleteCilentById(int id);
    void seachClient(String name);
}

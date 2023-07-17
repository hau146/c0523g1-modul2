package mvc.service;

import mvc.model.ClientModel;

public interface ICilentService {
    ClientModel[] finAll();
    void addCilent (ClientModel cilentController);
    void deleteCilentById(int id);
    void seachClient(String name);
}

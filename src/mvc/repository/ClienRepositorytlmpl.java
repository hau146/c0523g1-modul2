package mvc.repository;

import mvc.model.ClientModel;

import java.util.Arrays;

public class ClienRepositorytlmpl implements IClientRepository {
    private static ClientModel[] clientList;
    private static int size = 0;

    static {
        size = 5;
        clientList = new ClientModel[size * size];
        clientList[0] = new ClientModel(1, "Long", 23, "khách VIP");
        clientList[1] = new ClientModel(2, "Hậu", 20, "khách du lịch");
        clientList[2] = new ClientModel(3, "Hưng", 27, "khách hàng");
        clientList[3] = new ClientModel(4, "Thiện", 26, "khách mời");
        clientList[4] = new ClientModel(5, "Liên", 26, "khách quan");
    }


    @Override
    public ClientModel[] findAll() {
        ClientModel[] clients = new ClientModel[size];
        for (int i = 0; i < size; i++) {
            clients[i] = clientList[i];
        }
        return clients;
    }

    @Override
    public void addCilent(ClientModel client) {
        if (size > clientList.length || size < 0) {
            throw new IndexOutOfBoundsException("Không thể thêm khách này");
        } else {
            clientList[size] = client;
            size++;
        }
    }

    @Override
    public void deleteCilent(int id) {
        for (int i = 0; i < size; i++) {
            if (id == clientList[i].getId()) {
                for (int j = i; j < size - 1; j++) {
                    clientList[j] = clientList[j + 1];
                }
                clientList[size - 1] = null;
                size--;
                break;
            }
        }
        Arrays.toString(clientList);
    }

    @Override
    public void seachClient(String name) {
        for (int i = 0; i < size; i++) {
            if (clientList[i].getName().contains(name)) {
                System.out.println(clientList[i]);
            }
        }
    }
}

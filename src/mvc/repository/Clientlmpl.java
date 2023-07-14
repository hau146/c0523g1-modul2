package mvc.repository;

import mvc.model.Client;

import java.util.Arrays;

public class Clientlmpl implements IClient {
    private static Client[] clientList;
    private static int size = 0;

    static {
        clientList = new Client[10];
        clientList[0] = new Client(1, "Long", 23, "khách VIP");
        clientList[1] = new Client(2, "Hậu", 20, "khách du lịch");
        clientList[2] = new Client(3, "Hưng", 27, "khách hàng");
        clientList[3] = new Client(4, "Thiện", 26, "khách mời");
        clientList[4] = new Client(5, "Liên", 26, "khách quan");
        size = 5;
    }


    @Override
    public Client[] findAll() {
        Client[] clients = new Client[size];
        for (int i = 0; i < size; i++) {
            clients[i] = clientList[i];
        }
        return clients;
    }

    @Override
    public void addCilent(Client client) {
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

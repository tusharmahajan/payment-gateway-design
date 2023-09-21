package apis;

import managers.ClientManager;

public class ClientExistAPI {

    ClientManager clientManager = new ClientManager();

    public boolean checkClientExist(String clientName){
        // validations on clientName
        return clientManager.hasClient(clientName);
    }
}

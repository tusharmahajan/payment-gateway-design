package apis;

import managers.ClientManager;

public class RemoveClientAPI {

    ClientManager clientManager = new ClientManager();

    public void removeClientSupport(String clientName){
        // validations on clientName
        clientManager.removeClientSupport(clientName);
    }
}

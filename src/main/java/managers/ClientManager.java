package managers;

import data.DBAccessor;
import data.DataAccessorResult;
import models.Client;

public class ClientManager {

    public void integrateClient(String clientName){
        DBAccessor.addClientSupport(clientName);
    }

    public void removeClientSupport(String clientName){
        DBAccessor.removeClientSupport(clientName);
    }

    public boolean hasClient(String clientName){
        Client result = DBAccessor.getClientData(clientName);
        return result != null;
    }
}

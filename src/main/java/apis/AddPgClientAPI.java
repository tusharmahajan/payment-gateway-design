package apis;

import managers.ClientManager;
import managers.UserManager;
import models.User;
import models.UserType;

public class AddPgClientAPI {

    private final UserManager userManager = new UserManager();
    private final ClientManager clientManager = new ClientManager();

    public void addClient(String userToken, String clientName){
        // validations on userToken and clientName

        User user = userManager.getUser(userToken);
        if(user == null) throw new IllegalCallerException("User doesnt exist");
        if(!user.getUserType().equals(UserType.SUPER_ADMIN))
            throw new IllegalCallerException("User dont have permission to clients");

            clientManager.integrateClient(clientName);

    }
}

package managers;

import data.DBAccessor;
import data.DataAccessObjectConvertor;
import data.DataAccessorResult;
import models.User;

public class UserManager {


    public User getUser(String userToken) {
        DataAccessorResult result =  DBAccessor.getUser();
        return DataAccessObjectConvertor.convertToUser(result);
    }
}

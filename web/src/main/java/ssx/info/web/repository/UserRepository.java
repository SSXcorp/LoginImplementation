package ssx.info.web.repository;

import org.springframework.stereotype.Repository;
import ssx.info.web.model.User;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        return new User(email,"123456","Farhan","Tanvir");
    }
}
package ssx.info.web.service;

import ssx.info.web.model.User;

import java.util.List;

public interface UserService {

    User update(User user);

    List<User> getAll();

}
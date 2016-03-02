package vn.vsii.rina.service;

import vn.vsii.rina.entity.User;

/**
 * Created by toannh on 3/2/2016.
 */
public interface UserService {
    User findById(int id);
    User findBySso(String sso);
}

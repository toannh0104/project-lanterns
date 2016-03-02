package vn.vsii.rina.repository;

import vn.vsii.rina.entity.User;

/**
 * Created by toannh on 3/2/2016.
 */
public interface UserDao {
    User findById(int id);
    User findBySSO(String sso);
}

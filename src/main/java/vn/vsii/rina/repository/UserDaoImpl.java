package vn.vsii.rina.repository;

import org.springframework.stereotype.Repository;
import vn.vsii.rina.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 * Created by toannh on 3/2/2016.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

    public User findById(int id) {
        return getByKey(id);
    }

    public User findBySSO(String sso) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("ssoId", sso));
        return (User) crit.uniqueResult();
    }


}

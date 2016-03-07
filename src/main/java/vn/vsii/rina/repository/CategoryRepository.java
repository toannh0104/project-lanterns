package vn.vsii.rina.repository;

import org.springframework.stereotype.Repository;
import vn.vsii.rina.entity.Category;

import java.util.List;

/**
 * Created by toannh on 3/8/2016.
 */
@Repository
public class CategoryRepository extends AbstractDao<String, Category>{

    /**
     * Get all category
     * @return
     */
    public List<Category> getCategories(){
        return createEntityCriteria().list();
    }
}

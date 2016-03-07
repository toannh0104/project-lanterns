package vn.vsii.rina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.vsii.rina.entity.Category;
import vn.vsii.rina.repository.CategoryRepository;

import java.util.List;

/**
 * Created by toannh on 3/8/2016.
 */
@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategory(String categoryID){
        return categoryRepository.getByKey(categoryID);
    }

    public List<Category> getCategories(){
        return categoryRepository.getCategories();
    }
}

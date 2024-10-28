package vn.hcmute.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.hcmute.repository.ICategoryRepository;
import vn.hcmute.service.ICategoryService;

public class CategoryServiceImpl    implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    public CategoryServiceImpl(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}

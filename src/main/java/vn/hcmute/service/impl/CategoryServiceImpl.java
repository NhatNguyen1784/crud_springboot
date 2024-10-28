package vn.hcmute.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import vn.hcmute.entity.Category;
import vn.hcmute.repository.ICategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements vn.hcmute.service.ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    public CategoryServiceImpl(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findAll(Sort sort) {
        return categoryRepository.findAll(sort);
    }


    @Override
    public <S extends Category> S save(S entity) {
        return categoryRepository.save(entity);
    }
}

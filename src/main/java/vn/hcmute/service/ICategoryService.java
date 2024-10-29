package vn.hcmute.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import vn.hcmute.entity.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    long count();

    void deleteById(Long aLong);

    List<Category> findAll();

    List<Category> findAll(Sort sort);


    <S extends Category> S save(S entity);

    Optional<Category> findById(Long aLong);
}

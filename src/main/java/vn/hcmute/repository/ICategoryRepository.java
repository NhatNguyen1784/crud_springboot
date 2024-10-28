package vn.hcmute.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.hcmute.entity.Category;

import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}

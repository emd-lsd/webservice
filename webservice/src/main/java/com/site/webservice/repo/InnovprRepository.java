package com.site.webservice.repo;

import com.site.webservice.models.Innovpr;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InnovprRepository extends CrudRepository<Innovpr, Long> {
    List<Innovpr> findByNameContainingOrTasksContaining(String keyword, String keyword2);
}

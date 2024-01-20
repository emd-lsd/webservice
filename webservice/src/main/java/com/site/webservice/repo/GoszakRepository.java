package com.site.webservice.repo;

import com.site.webservice.models.Goszak;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoszakRepository extends CrudRepository<Goszak, Long> {
    List<Goszak> findByNameContainingOrMdobContaining(String keyword, String keyword2);
}

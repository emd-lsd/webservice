package com.site.webservice.repo;

import com.site.webservice.models.Gosim;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GosimRepository extends CrudRepository<Gosim, Long> {
    List<Gosim> findByAddressContainingOrObjectareaContaining(String keyword, String keyword2);
}

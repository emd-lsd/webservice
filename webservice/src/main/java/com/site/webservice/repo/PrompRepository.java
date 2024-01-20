package com.site.webservice.repo;

import com.site.webservice.models.Promp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrompRepository extends CrudRepository<Promp, Long> {
    // Добавленный метод для поиска по атрибуту OKVED_Description
    List<Promp> findByOKVEDDContaining(String keyword);
    List<Promp> findByOKVEDDContainingOrDistrictContainingOrAddressContaining(String keyword, String keyword2, String keyword3);

}

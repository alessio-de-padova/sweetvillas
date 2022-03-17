package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import com.nimesia.sweetvillas.entities.StoreEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Component
public class StoreDAO {
    private Logger logger = LoggerFactory.getLogger(MainInterceptor.class);

    @PersistenceContext
    private EntityManager entityManager;

    public List<StoreEntity> search(String str, Integer cityId, Integer page, Integer limit) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<StoreEntity> query = builder.createQuery(StoreEntity.class);
        Root<StoreEntity> root = query.from(StoreEntity.class);

        List<Predicate> predicates = new ArrayList<Predicate>();

        if (cityId != 0) {
            predicates.add(
                    builder.equal(root.get("city").get("id"), cityId)
            );
        }

        if (str.length() > 0) {
            predicates.add(
                    builder.like(root.get("name"), "%" + str + "%")
            );
        }

        query.select(root).where(
                predicates.toArray(new Predicate[predicates.size()])
        );

        Query q = entityManager.createQuery(query);

        q.setFirstResult(page * limit);
        q.setMaxResults(limit);

        return q.getResultList();

    }

}

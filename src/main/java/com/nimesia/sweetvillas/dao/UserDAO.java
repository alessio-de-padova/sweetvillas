package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import com.nimesia.sweetvillas.models.UserEntity;
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
import java.util.List;

@Component
public class UserDAO {
    private Logger logger = LoggerFactory.getLogger(MainInterceptor.class);

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserEntity> search(String str, Integer page, Integer limit) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserEntity> query = builder.createQuery(UserEntity.class);
        Root<UserEntity> root = query.from(UserEntity.class);
        query.select(root);

        if (str.length() > 0) {
            Predicate checkName = builder.like(root.get("name"), str);
            Predicate checkSurname = builder.like(root.get("surname"), str);
            Predicate checkEmail = builder.like(root.get("account").get("email"), str);

            query.where(
                    builder.or( checkName, checkSurname, checkEmail)
            );
        }

        Query q = entityManager.createQuery(query);

        q.setFirstResult(page * limit);
        q.setMaxResults(limit);

        return q.getResultList();

    }

}

package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
public class UserDAO {
    private Logger logger = LoggerFactory.getLogger(MainInterceptor.class);

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserEntity> search(String str, Integer page, Integer limit) {

        String sql = "SELECT u FROM UserEntity u  ";

        if (str.length() > 0) {
            sql += "INNER JOIN u.account a ";
        }

        sql += "WHERE 1 = 1 ";

        if (str.length() > 0) {
            sql += "AND LOWER(u.name) LIKE :str OR LOWER(u.surname) LIKE :str OR LOWER(a.email) LIKE :str ";
        }

        Query q = entityManager.createQuery(sql);

        if (str.length() > 0) {
            q.setParameter("str", str.toLowerCase() + "%");
        }

        q.setFirstResult(page * limit);
        q.setMaxResults(limit);
        return q.getResultList();

    }

    public List<UserEntity> search_test(String str, Integer page, Integer limit) {


        CriteriaBuilder qb = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserEntity> query = qb.createQuery(UserEntity.class);
        Root<UserEntity> root = query.from(UserEntity.class);
        query.select(root);

        if (str.length() > 0) {
            query.where(qb.equal(root.get("name"), str))
                    .where(qb.equal(root.get("surname"), str))
                    .where(qb.equal(root.get("email"), str));

        }


        Query q = entityManager.createQuery(query);

        q.setFirstResult(page * limit);
        q.setMaxResults(limit);

        return q.getResultList();

    }

}

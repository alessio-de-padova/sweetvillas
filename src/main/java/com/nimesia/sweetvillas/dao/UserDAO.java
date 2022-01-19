package com.nimesia.sweetvillas.dao;

import com.nimesia.sweetvillas.interceptors.MainInterceptor;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class UserDAO {
    private Logger logger = LoggerFactory.getLogger(MainInterceptor.class);

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserEntity> search(JSONObject params) throws JSONException {

        String str = params.getString("str");
        Integer page = params.getInt("page");
        Integer limit = params.getInt("limit");

        String sql = "SELECT u FROM UserEntity u  ";

        if (!str.isEmpty()) {
            sql += "INNER JOIN u.account a ";
        }

        sql += "WHERE 1 = 1 ";

        if (!str.isEmpty()) {
            sql += "AND LOWER(u.name) LIKE :str OR LOWER(u.surname) LIKE :str OR LOWER(a.email) LIKE :str ";
        };

        Query q = entityManager.createQuery(sql);

        if (!str.isEmpty()) {
            q.setParameter("str", str.toLowerCase() + "%");
        };

        q.setFirstResult(page * limit);
        q.setMaxResults(limit);
        return q.getResultList();

    }

}

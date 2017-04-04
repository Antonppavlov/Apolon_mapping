package ru.apolon.www.hibernate.dao.food;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.apolon.www.hibernate.entity.food.Food;
import ru.apolon.www.hibernate.entity.food.FoodName;
import ru.apolon.www.hibernate.entity.food.FoodName;
import ru.apolon.www.hibernate.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by antonpavlov on 26.11.16.
 */
public class FoodNameDAO {
    private final SessionFactory sessionFactory;

    public FoodNameDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insert(FoodName foodName) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(foodName);
        session.getTransaction().commit();
        session.close();
    }

    public Integer getId(String nameRu) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();


        CriteriaQuery<FoodName> criteriaQuery = criteriaBuilder.createQuery(FoodName.class);


        Root<FoodName> root = criteriaQuery.from(FoodName.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("nameRu"), nameRu));

        Query query = session.createQuery(criteriaQuery);

        List<FoodName> resultList = query.getResultList();

        session.close();


        if (resultList.size() == 0) {
            return null;
        }


        Integer nameId = resultList.get(0).getId();
        return nameId;
    }
}

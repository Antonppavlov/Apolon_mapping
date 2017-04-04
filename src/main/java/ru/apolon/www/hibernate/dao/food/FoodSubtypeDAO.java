package ru.apolon.www.hibernate.dao.food;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.apolon.www.hibernate.entity.food.Food;
import ru.apolon.www.hibernate.entity.food.FoodSubtype;
import ru.apolon.www.hibernate.entity.food.FoodSubtype;
import ru.apolon.www.hibernate.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by antonpavlov on 26.11.16.
 */
public class FoodSubtypeDAO {
    private final SessionFactory sessionFactory;

    public FoodSubtypeDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insert(FoodSubtype foodSubtype) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(foodSubtype);
        session.getTransaction().commit();
        session.close();
    }

    public Integer getId(String nameRu) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();


        CriteriaQuery<FoodSubtype> criteriaQuery = criteriaBuilder.createQuery(FoodSubtype.class);


        Root<FoodSubtype> root = criteriaQuery.from(FoodSubtype.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("nameRu"), nameRu));

        Query query = session.createQuery(criteriaQuery);

        List<FoodSubtype> resultList = query.getResultList();

        session.close();


        if (resultList.size() == 0) {
            return null;
        }


        Integer nameId = resultList.get(0).getId();
        return nameId;
    }
}

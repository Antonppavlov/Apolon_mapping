package ru.apolon.www.hibernate.dao.food;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.apolon.www.hibernate.entity.food.Food;
import ru.apolon.www.hibernate.utils.HibernateUtil;

/**
 * Created by antonpavlov on 26.11.16.
 */
public class FoodDAO {
    private final SessionFactory sessionFactory;

    public FoodDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insert(Food food) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(food);
        session.getTransaction().commit();
        session.close();
    }
////// TODO: 26.11.16 дичь/ надо джойнить или вызвать из дао слоя именипродукта поиск и вернуть id
//    public Integer getId(String nameRu) {
//        Session session = sessionFactory.openSession();
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//
//
//        CriteriaQuery<FoodName> criteriaQuery = criteriaBuilder.createQuery(FoodName.class);
//
//
//        Root<FoodName> root = criteriaQuery.from(FoodName.class);
//
//        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("nameRu"), nameRu));
//
//        Query query = session.createQuery(criteriaQuery);
//
//        List<FoodName> resultList = query.getResultList();
//
//        session.close();
//
//
//        if (resultList.size() == 0) {
//            return null;
//        }

//]
//        Integer nameId = resultList.get(0).getId();
//        return nameId;
    }
//}

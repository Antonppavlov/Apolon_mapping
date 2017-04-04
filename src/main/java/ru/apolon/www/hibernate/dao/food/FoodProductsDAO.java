package ru.apolon.www.hibernate.dao.food;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.apolon.www.hibernate.entity.food.Food;
import ru.apolon.www.hibernate.entity.food.FoodProducts;
import ru.apolon.www.hibernate.utils.HibernateUtil;

/**
 * Created by antonpavlov on 26.11.16.
 */
public class FoodProductsDAO {
    private final SessionFactory sessionFactory;

    public FoodProductsDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insert(FoodProducts foodProducts) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(foodProducts);
        session.getTransaction().commit();
        session.close();
    }
}

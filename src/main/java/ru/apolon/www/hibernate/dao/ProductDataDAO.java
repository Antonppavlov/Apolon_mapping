package ru.apolon.www.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.apolon.www.hibernate.dao.interfaces.IProductDataDAO;
import ru.apolon.www.hibernate.entity.ProductData;
import ru.apolon.www.hibernate.utils.HibernateUtil;


public class ProductDataDAO implements IProductDataDAO {
    private final SessionFactory sessionFactory;

    public ProductDataDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }


    @Override
    public void insertProductData(ProductData productData) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productData);
        session.getTransaction().commit();
        session.close();
    }

}

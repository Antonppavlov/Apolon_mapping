package ru.apolon.www.hibernate.dao.product;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.apolon.www.hibernate.dao.interfaces.IProductDAO;
import ru.apolon.www.hibernate.entity.product.Product;
import ru.apolon.www.hibernate.utils.HibernateUtil;


public class ProductDAO implements IProductDAO{
    private final SessionFactory sessionFactory;

    public ProductDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }








    @Override
    public void insertProduct(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
    }
}

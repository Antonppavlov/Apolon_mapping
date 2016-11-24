package ru.apolon.www.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.apolon.www.hibernate.dao.interfaces.IProductNameDAO;
import ru.apolon.www.hibernate.entity.Product;
import ru.apolon.www.hibernate.entity.ProductName;
import ru.apolon.www.hibernate.entity.ProductType;
import ru.apolon.www.hibernate.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class ProductNameDAO implements IProductNameDAO {
    private final SessionFactory sessionFactory;

    public ProductNameDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }


    public Integer getProductNameId(String nameRu) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();


        CriteriaQuery<ProductName> criteriaQuery = criteriaBuilder.createQuery(ProductName.class);


        Root<ProductName> root = criteriaQuery.from(ProductName.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("nameRu"), nameRu));

        Query query = session.createQuery(criteriaQuery);

        List<ProductName> resultList = query.getResultList();

        session.close();


        if (resultList.size() == 0) {
            return null;
        }


        Integer nameId = resultList.get(0).getId();
        return nameId;
    }


    @Override
    public void insertProductName(ProductName productName) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productName);
        session.getTransaction().commit();
        session.close();
    }
}

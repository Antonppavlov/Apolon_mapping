package ru.apolon.www.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.apolon.www.hibernate.dao.interfaces.IProductTypeDAO;
import ru.apolon.www.hibernate.entity.ProductType;
import ru.apolon.www.hibernate.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import java.util.List;


public class ProductTypeDAO implements IProductTypeDAO {
    private final SessionFactory sessionFactory;

    public ProductTypeDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }


    @Override
    public int getProductTypeId(String nameType) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();


        CriteriaQuery<ProductType> criteriaQuery = criteriaBuilder.createQuery(ProductType.class);


        Root<ProductType> root = criteriaQuery.from(ProductType.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("typeRu"), nameType));

        Query query = session.createQuery(criteriaQuery);

        List<ProductType> resultList = query.getResultList();

        session.close();

        return resultList.get(0).getId();
    }

    @Override
    public void insertProductType(ProductType productType) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(productType);
        session.getTransaction().commit();
        session.close();
    }
}

package ru.apolon.www.hibernate.dao.food;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.apolon.www.hibernate.entity.food.Food;
import ru.apolon.www.hibernate.entity.food.FoodRecipe;
import ru.apolon.www.hibernate.entity.food.FoodRecipe;
import ru.apolon.www.hibernate.utils.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by antonpavlov on 26.11.16.
 */
public class FoodRecipeDAO {
    private final SessionFactory sessionFactory;

    public FoodRecipeDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void insert(FoodRecipe foodRecipe) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(foodRecipe);
        session.getTransaction().commit();
        session.close();
    }

    public Integer getId(String nameRu) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();


        CriteriaQuery<FoodRecipe> criteriaQuery = criteriaBuilder.createQuery(FoodRecipe.class);


        Root<FoodRecipe> root = criteriaQuery.from(FoodRecipe.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("descriptionRu"), nameRu));

        Query query = session.createQuery(criteriaQuery);

        List<FoodRecipe> resultList = query.getResultList();

        session.close();


        if (resultList.size() == 0) {
            return null;
        }


        Integer nameId = resultList.get(0).getId();
        return nameId;
    }
}

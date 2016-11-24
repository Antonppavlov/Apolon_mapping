package ru.apolon.www.hibernate.dao.interfaces;

import ru.apolon.www.hibernate.entity.ProductType;


public interface IProductTypeDAO {
    int getProductTypeId(String nameType);

    void insertProductType(ProductType productType);
}

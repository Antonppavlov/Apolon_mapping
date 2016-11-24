package ru.apolon.www.start;

import ru.apolon.www.hibernate.dao.ProductNameDAO;

import java.text.DecimalFormat;

/**
 * Created by antonpavlov on 24.11.16.
 */
public class Start {
    public static void main(String[] args) {
       // Integer брюква = new ProductNameDAO().getProductNameId("морКовь");
        Double d=22.2;
        Double a=100.00 / d;
        String formattedDouble = new DecimalFormat("#0.00").format(a);
        System.out.println();
    }
}

package ru.apolon.www.start;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import ru.apolon.www.hibernate.dao.product.ProductDAO;
import ru.apolon.www.hibernate.dao.product.ProductDataDAO;
import ru.apolon.www.hibernate.dao.product.ProductNameDAO;
import ru.apolon.www.hibernate.entity.product.Product;
import ru.apolon.www.hibernate.entity.product.ProductData;
import ru.apolon.www.hibernate.entity.product.ProductName;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by antonpavlov on 24.11.16.
 */
public class ParsingNewProduct {
    public static void main(String[] args) {
        List<Integer> recipePages = new ArrayList<Integer>();
        recipePages.add(9384);
        recipePages.add(9386);
        recipePages.add(9387);
        recipePages.add(9389);
        recipePages.add(9390);
        recipePages.add(12503);
        recipePages.add(12504);
        recipePages.add(9392);
        recipePages.add(9395);
        recipePages.add(9397);
        recipePages.add(9398);
        recipePages.add(9399);
        recipePages.add(9400);
        recipePages.add(9401);
        recipePages.add(9402);
        recipePages.add(9403);
        recipePages.add(9404);
        recipePages.add(9405);
        recipePages.add(9406);
        recipePages.add(9410);
        recipePages.add(9411);
        recipePages.add(9412);
        recipePages.add(9413);
        recipePages.add(9416);
        recipePages.add(9417);
        recipePages.add(9418);
        recipePages.add(9420);
        recipePages.add(9421);
        recipePages.add(9424);
        recipePages.add(9425);
        recipePages.add(9426);
        recipePages.add(9427);
        recipePages.add(9428);
        recipePages.add(9429);
        recipePages.add(9430);
        recipePages.add(9431);
        recipePages.add(9432);
        recipePages.add(9433);
        recipePages.add(9434);
        recipePages.add(9436);
        recipePages.add(9437);
        recipePages.add(9438);
        recipePages.add(9439);
        recipePages.add(9440);
        recipePages.add(9441);
        recipePages.add(9443);
        recipePages.add(9444);
        recipePages.add(9445);
        recipePages.add(9446);
        recipePages.add(9447);
        recipePages.add(9449);
        recipePages.add(9450);
        recipePages.add(9453);
        recipePages.add(9454);
        recipePages.add(9455);
        recipePages.add(9456);
        recipePages.add(9457);
        recipePages.add(9458);
        recipePages.add(9459);
        recipePages.add(9463);
        recipePages.add(9464);
        recipePages.add(9465);
        recipePages.add(9466);
        recipePages.add(9467);
        recipePages.add(9468);
        recipePages.add(9469);
        recipePages.add(9302);
        recipePages.add(9303);
        recipePages.add(9304);
        recipePages.add(9305);
        recipePages.add(9306);
        recipePages.add(9307);
        recipePages.add(9308);
        recipePages.add(9339);
        recipePages.add(9340);
        recipePages.add(9341);
        recipePages.add(9342);
        recipePages.add(9343);
        recipePages.add(9344);
        recipePages.add(9345);
        recipePages.add(9363);
        recipePages.add(9364);
        recipePages.add(9365);
        recipePages.add(9366);
        recipePages.add(9367);
        recipePages.add(9368);
        recipePages.add(9369);
        recipePages.add(9370);
        recipePages.add(9371);
        recipePages.add(9372);
        recipePages.add(9373);
        recipePages.add(9374);
        recipePages.add(9479);
        recipePages.add(9480);
        recipePages.add(9481);
        recipePages.add(9482);
        recipePages.add(9483);
        recipePages.add(9484);
        recipePages.add(9485);
        recipePages.add(9492);
        recipePages.add(9493);
        recipePages.add(9494);
        recipePages.add(9495);
        recipePages.add(9496);
        recipePages.add(9498);
        recipePages.add(9499);
        recipePages.add(9522);
        recipePages.add(9523);
        recipePages.add(9524);
        recipePages.add(9525);
        recipePages.add(9527);
        recipePages.add(9528);
        recipePages.add(9529);
        recipePages.add(9325);
        recipePages.add(9502);
        recipePages.add(9503);
        recipePages.add(9504);
        recipePages.add(9505);
        recipePages.add(9506);
        recipePages.add(9507);
        recipePages.add(9491);
        recipePages.add(9539);
        recipePages.add(9540);
        recipePages.add(9541);
        recipePages.add(9542);
        recipePages.add(9543);
        recipePages.add(9544);
        recipePages.add(9546);
        recipePages.add(9547);
        recipePages.add(9549);
        recipePages.add(9550);
        recipePages.add(9551);
        recipePages.add(9552);
        recipePages.add(9553);
        recipePages.add(9554);
        recipePages.add(9353);
        recipePages.add(9559);
        recipePages.add(9560);
        recipePages.add(9561);
        recipePages.add(9562);
        recipePages.add(9563);
        recipePages.add(9564);
        recipePages.add(9579);
        recipePages.add(9580);
        recipePages.add(9581);
        recipePages.add(9582);
        recipePages.add(9583);
        recipePages.add(9584);
        recipePages.add(9585);
        recipePages.add(9599);
        recipePages.add(9600);
        recipePages.add(9601);
        recipePages.add(9602);
        recipePages.add(9603);
        recipePages.add(9604);
        recipePages.add(9605);
        recipePages.add(9606);
        recipePages.add(9607);
        recipePages.add(9608);
        recipePages.add(9609);
        recipePages.add(9610);
        recipePages.add(9611);
        recipePages.add(9612);
        recipePages.add(9615);
        recipePages.add(9616);
        recipePages.add(10212);
        recipePages.add(10213);
        recipePages.add(10216);
        recipePages.add(10217);
        recipePages.add(10218);
        recipePages.add(9618);
        recipePages.add(9619);
        recipePages.add(9625);
        recipePages.add(9626);
        recipePages.add(9629);
        recipePages.add(9630);
        recipePages.add(9631);
        recipePages.add(9628);
        recipePages.add(9632);
        recipePages.add(9639);
        recipePages.add(9640);
        recipePages.add(9650);
        recipePages.add(9662);
        recipePages.add(9663);
        recipePages.add(9644);
        recipePages.add(9645);
        recipePages.add(9646);
        recipePages.add(9647);
        recipePages.add(9649);
        recipePages.add(9653);
        recipePages.add(9654);
        recipePages.add(9624);
        recipePages.add(9633);
        recipePages.add(9634);
        recipePages.add(9636);
        recipePages.add(9641);
        recipePages.add(9651);
        recipePages.add(9652);
        recipePages.add(9667);
        recipePages.add(9668);
        recipePages.add(9669);
        recipePages.add(9670);
        recipePages.add(9671);
        recipePages.add(9672);
        recipePages.add(9673);
        recipePages.add(9694);
        recipePages.add(9695);
        recipePages.add(9696);
        recipePages.add(9697);
        recipePages.add(9698);
        recipePages.add(9699);
        recipePages.add(9700);
        recipePages.add(9675);
        recipePages.add(9679);
        recipePages.add(9683);
        recipePages.add(9685);
        recipePages.add(9686);
        recipePages.add(9687);
        recipePages.add(9688);
        recipePages.add(9704);
        recipePages.add(9706);
        recipePages.add(9707);
        recipePages.add(9708);
        recipePages.add(9709);
        recipePages.add(9710);
        recipePages.add(9711);
        recipePages.add(9712);
        recipePages.add(9713);
        recipePages.add(9714);
        recipePages.add(9715);
        recipePages.add(9716);
        recipePages.add(9717);
        recipePages.add(9719);
        recipePages.add(9720);
        recipePages.add(9721);
        recipePages.add(10120);
        recipePages.add(10121);
        recipePages.add(10122);
        recipePages.add(10123);
        recipePages.add(9722);
        recipePages.add(9723);
        recipePages.add(9724);
        recipePages.add(9725);
        recipePages.add(9726);
        recipePages.add(10152);
        recipePages.add(10153);
        recipePages.add(9730);
        recipePages.add(9731);
        recipePages.add(9732);
        recipePages.add(9733);
        recipePages.add(9734);
        recipePages.add(9735);
        recipePages.add(9736);
        recipePages.add(9738);
        recipePages.add(9739);
        recipePages.add(9740);
        recipePages.add(9745);
        recipePages.add(10178);
        recipePages.add(10179);
        recipePages.add(10180);
        recipePages.add(9742);
        recipePages.add(9743);
        recipePages.add(9744);
        recipePages.add(10192);
        recipePages.add(9746);
        recipePages.add(9755);
        recipePages.add(9766);
        recipePages.add(9767);
        recipePages.add(10075);
        recipePages.add(10076);
        recipePages.add(10077);
        recipePages.add(9756);
        recipePages.add(9763);
        recipePages.add(9764);
        recipePages.add(9809);
        recipePages.add(10094);
        recipePages.add(10105);
        recipePages.add(10112);
        recipePages.add(9783);
        recipePages.add(9785);
        recipePages.add(9786);
        recipePages.add(9787);
        recipePages.add(9794);
        recipePages.add(9797);
        recipePages.add(9803);
        recipePages.add(9762);
        recipePages.add(9765);
        recipePages.add(9804);
        recipePages.add(9805);
        recipePages.add(9806);
        recipePages.add(9807);
        recipePages.add(9808);
        recipePages.add(9795);
        recipePages.add(9796);
        recipePages.add(9798);
        recipePages.add(9799);
        recipePages.add(9800);
        recipePages.add(9801);
        recipePages.add(9802);
        recipePages.add(9768);
        recipePages.add(9769);
        recipePages.add(9771);
        recipePages.add(9773);
        recipePages.add(9775);
        recipePages.add(9777);
        recipePages.add(9779);
        recipePages.add(10224);
        recipePages.add(10225);
        recipePages.add(10226);
        recipePages.add(10227);
        recipePages.add(10228);
        recipePages.add(10229);
        recipePages.add(10230);
        recipePages.add(9810);
        recipePages.add(9811);
        recipePages.add(9813);
        recipePages.add(9814);
        recipePages.add(9815);
        recipePages.add(9816);
        recipePages.add(9817);
        recipePages.add(9825);
        recipePages.add(9826);
        recipePages.add(9827);
        recipePages.add(9828);
        recipePages.add(9829);
        recipePages.add(9830);
        recipePages.add(9831);
        recipePages.add(9842);
        recipePages.add(9843);
        recipePages.add(9844);
        recipePages.add(9845);
        recipePages.add(9846);
        recipePages.add(9847);
        recipePages.add(9848);
        recipePages.add(9849);
        recipePages.add(9850);
        recipePages.add(9851);
        recipePages.add(9852);
        recipePages.add(9853);
        recipePages.add(9854);
        recipePages.add(9855);
        recipePages.add(9876);
        recipePages.add(9877);
        recipePages.add(9878);
        recipePages.add(9879);
        recipePages.add(9880);
        recipePages.add(9881);
        recipePages.add(9882);
        recipePages.add(9897);
        recipePages.add(10066);
        recipePages.add(10067);
        recipePages.add(9944);
        recipePages.add(9945);
        recipePages.add(9946);
        recipePages.add(9947);
        recipePages.add(9948);
        recipePages.add(9949);
        recipePages.add(9950);
        recipePages.add(9954);
        recipePages.add(9960);
        recipePages.add(9962);
        recipePages.add(9964);
        recipePages.add(9965);
        recipePages.add(9966);
        recipePages.add(9967);
        recipePages.add(9955);
        recipePages.add(9956);
        recipePages.add(9957);
        recipePages.add(9958);
        recipePages.add(9975);
        recipePages.add(9976);
        recipePages.add(9977);
        recipePages.add(9963);
        recipePages.add(10002);
        recipePages.add(10003);
        recipePages.add(10004);
        recipePages.add(10005);
        recipePages.add(10006);
        recipePages.add(10007);
        recipePages.add(10008);
        recipePages.add(9978);
        recipePages.add(9979);
        recipePages.add(9980);
        recipePages.add(9981);
        recipePages.add(9982);
        recipePages.add(9983);
        recipePages.add(9984);

        System.setProperty("browser", "chrome");
        ChromeDriverManager.getInstance().setup();


        int id = 538;
        for (Integer integer : recipePages) {
            Selenide.open("http://www.edimka.ru/view/" + integer);
            System.out.println(integer);
            ElementsCollection tdProductList = $$("#center>table>tbody>tr[align='right']>td[align='left']");

            for (SelenideElement tdProduct : tdProductList) {
                String textInTd = tdProduct.getText();
                if (textInTd.equals("итого") || textInTd.equals("на 100 гр готового продукта")) {
                    break;
                } else {
                    if (new ProductNameDAO().getProductNameId(textInTd) == null) {
                        if (tdProduct.parent().$("td", 2).getText().equals("-")) {
                            System.err.println("!!!!!!");
                            System.err.println("!!!!!!");
                            System.err.println(integer);
                            System.err.println("!!!!!!");
                            System.err.println("!!!!!!");
                            ProductData productData = new ProductData();
                            new ProductDataDAO().insertProductData(productData);
                        } else {
                            SelenideElement rowInTable = tdProduct.parent();
                            Double productWeight = Double.valueOf(rowInTable.$("td", 2).getText());

                            Double relativeTo100 = 100.00 / productWeight;

                            ProductData productData = new ProductData();
                            // productData.setId(id);
                            productData.setProteinsG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 4).getText())));
                            productData.setFatsG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 5).getText())));
                            productData.setCarbohydratesG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 6).getText())));
                            productData.setCalorieCalories(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 7).getText())));
                            new ProductDataDAO().insertProductData(productData);
                        }


//собрать и записать в дб данные о продукте

//записать в тб имя продукта
                        ProductName productName = new ProductName();
                        // productName.setId(id);
                        productName.setNameRu(textInTd);
                        productName.setNameEng("null");
                        new ProductNameDAO().insertProductName(productName);
//создать запись в бд продукт тип=23
                        if (tdProduct.parent().$("td", 2).getText().equals("-")) {
                            Product product = new Product();
                            //  product.setId(id);
                            product.setProductTypeId(24);
                            product.setProductNameId(id);
                            product.setProductDataId(id);
                            new ProductDAO().insertProduct(product);
                        }
                        else {
                            Product product = new Product();
                            //  product.setId(id);
                            product.setProductTypeId(23);
                            product.setProductNameId(id);
                            product.setProductDataId(id);
                            new ProductDAO().insertProduct(product);
                        }


                        id++;
                        System.out.println(id);
                    }
                }

            }

        }


    }
}

//
//
//
//
//    int id = 538;
//        for (Integer integer : recipePages) {
//                Selenide.open("http://www.edimka.ru/view/" + integer);
//                System.out.println(integer);
//                ElementsCollection tdProductList = $$("#center>table>tbody>tr[align='right']>td[align='left']");
//
//                for (SelenideElement tdProduct : tdProductList) {
//                String textInTd = tdProduct.getText();
//                if (textInTd.equals("итого") || textInTd.equals("на 100 гр готового продукта")) {
//                break;
//                } else {
//
//                if (new ProductNameDAO().getProductNameId(textInTd) == null) {
//
//                if (tdProduct.parent().$("td", 2).getText().equals("-")) {
//                ProductData productData = new ProductData();
//                new ProductDataDAO().insertProductData(productData);
//                }
//                else {
//                SelenideElement rowInTable = tdProduct.parent();
//                Double productWeight = Double.valueOf(rowInTable.$("td", 2).getText());
//
//                Double relativeTo100 = 100.00 / productWeight;
//
//                ProductData productData = new ProductData();
//                // productData.setId(id);
//                productData.setProteinsG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 4).getText())));
//                productData.setFatsG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 5).getText())));
//                productData.setCarbohydratesG(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 6).getText())));
//                productData.setCalorieCalories(BigDecimal.valueOf(relativeTo100 * Double.valueOf(rowInTable.$("td", 7).getText())));
//                new ProductDataDAO().insertProductData(productData);
//                }
//
//
////собрать и записать в дб данные о продукте
//
////записать в тб имя продукта
//                ProductName productName = new ProductName();
//                // productName.setId(id);
//                productName.setNameRu(textInTd);
//                productName.setNameEng("null");
//                new ProductNameDAO().insertProductName(productName);
////создать запись в бд продукт тип=23
//                Product product = new Product();
//                //  product.setId(id);
//                product.setProductTypeId(24);
//                product.setProductNameId(id);
//                product.setProductDataId(id);
//                new ProductDAO().insertProduct(product);
//
//                id++;
//                System.err.println(id);
//                System.err.println(id);
//                System.err.println(id);
//                System.err.println(id);
//                System.err.println(id);
//                System.err.println(id);
//                }
//                }
//
//                }
//
//                }
//
//
//                }
//                }

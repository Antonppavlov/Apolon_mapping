package ru.apolon.www.start;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import ru.apolon.www.hibernate.dao.product.ProductDAO;
import ru.apolon.www.hibernate.dao.product.ProductDataDAO;
import ru.apolon.www.hibernate.dao.product.ProductNameDAO;
import ru.apolon.www.hibernate.dao.product.ProductTypeDAO;
import ru.apolon.www.hibernate.entity.product.Product;
import ru.apolon.www.hibernate.entity.product.ProductData;
import ru.apolon.www.hibernate.entity.product.ProductName;

import java.math.BigDecimal;

import static com.codeborne.selenide.Selenide.$;
import static ru.apolon.www.column.DataProduct.*;


public class ParsingData {


    public static void main(String[] args) {
        System.setProperty("browser", "chrome");
        ChromeDriverManager.getInstance().setup();

        for (int i = 1; i < 538; i++) {
            Selenide.open("http://www.edimka.ru/prod" + i);

            String nameType = $("#center>p>b>a").getText();
            System.out.println(nameType);
            int typeId = new ProductTypeDAO().getProductTypeId(nameType);


            Product product = new Product();
           // product.setId(i);
            product.setProductDataId(i);
            product.setProductNameId(i);
            product.setProductTypeId(typeId);

            String productName = $("#center>h1").getText();


            ProductName productName1 = new ProductName();
           // productName1.setId(i);
            productName1.setNameRu(productName);
            productName1.setNameEng("null");


            new ProductNameDAO().insertProductName(productName1);


            SelenideElement table = $("table[border='0']", 0);
            ElementsCollection elementsCollection = table.$$("tbody tr");

            ProductData productData = new ProductData();
           // productData.setId(i);
            for (SelenideElement element : elementsCollection) {
                String tdText = element.$("td", 0).getText();
                String tdData = element.$("td", 1).getText();
             //   System.out.println(tdText);
                addValueProductData(tdText, productData, tdData);
            }

            new ProductDataDAO().insertProductData(productData);
            new ProductDAO().insertProduct(product);

        }


    }


    private static void addValueProductData(String dataProduct, ProductData productData, String tdData) {

        BigDecimal bigDecimal;
        if(tdData.equals("сл.")){
            bigDecimal= new BigDecimal(0);
        }
        else {
            bigDecimal = BigDecimal.valueOf(Double.valueOf(tdData));
        }

        if (WATER_G.getText().equals(dataProduct)) {
            productData.setWaterG(bigDecimal);
            return;
        } else if (PROTEINS_G.getText().equals(dataProduct)) {
            productData.setProteinsG(bigDecimal);
            return;
        } else if (FATS_G.getText().equals(dataProduct)) {
            productData.setFatsG(bigDecimal);
            return;
        } else if (CARBOHYDRATES_G.getText().equals(dataProduct)) {
            productData.setCarbohydratesG(bigDecimal);
            return;
        } else if (MONO_AND_DISACCHARIDES_G.getText().equals(dataProduct)) {
            productData.setMonoAndDisaccharidesG(bigDecimal);
            return;
        } else if (FIBER_G.getText().equals(dataProduct)) {
            productData.setFiberG(bigDecimal);
            return;
        } else if (STARCH_G.getText().equals(dataProduct)) {
            productData.setStarchG(bigDecimal);
            return;
        } else if (PECTIN_G.getText().equals(dataProduct)) {
            productData.setPectinG(bigDecimal);
            return;
        } else if (ORGANIC_ACIDS_G.getText().equals(dataProduct)) {
            productData.setOrganicAcidsG(bigDecimal);
            return;
        } else if (ASH_G.getText().equals(dataProduct)) {
            productData.setAshG(bigDecimal);
            return;
        } else if (POTASSIUM_MG.getText().equals(dataProduct)) {
            productData.setPotassiumMg(bigDecimal);
            return;
        } else if (CALCIUM_MG.getText().equals(dataProduct)) {
            productData.setCalciumMg(bigDecimal);
            return;
        } else if (MAGNESIUM_MG.getText().equals(dataProduct)) {
            productData.setMagnesiumMg(bigDecimal);
            return;
        } else if (SODIUM_MG.getText().equals(dataProduct)) {
            productData.setSodiumMg(bigDecimal);
            return;
        } else if (PHOSPHORUS_MG.getText().equals(dataProduct)) {
            productData.setPhosphorusMg(bigDecimal);
            return;
        } else if (IRON_G.getText().equals(dataProduct)) {
            productData.setIronG(bigDecimal);
            return;
        } else if (IODINE_MKG.getText().equals(dataProduct)) {
            productData.setIodineMkg(bigDecimal);
            return;
        } else if (COBALT_MG.getText().equals(dataProduct)) {
            productData.setCobaltMg(bigDecimal);
            return;
        } else if (MANGANESE_MCG.getText().equals(dataProduct)) {
            productData.setManganeseMcg(bigDecimal);
            return;
        } else if (COPPER_G.getText().equals(dataProduct)) {
            productData.setCopperG(bigDecimal);
            return;
        } else if (MOLYBDENUM_G.getText().equals(dataProduct)) {
            productData.setMolybdenumG(bigDecimal);
            return;
        } else if (FLUORINE_G.getText().equals(dataProduct)) {
            productData.setFluorineG(bigDecimal);
            return;
        } else if (ZINC_G.getText().equals(dataProduct)) {
            productData.setZincG(bigDecimal);
            return;
        } else if (VITAMIN_A_RETINOL_MG.getText().equals(dataProduct)) {
            productData.setVitaminARetinolMg(bigDecimal);
            return;
        } else if (VITAMIN_B_CAROTENE_MG.getText().equals(dataProduct)) {
            productData.setVitaminBCaroteneMg(bigDecimal);
            return;
        } else if (VITAMIN_C_ASCORBIC_ACID_MG.getText().equals(dataProduct)) {
            productData.setVitaminCAscorbicAcidMg(bigDecimal);
            return;
        } else if (VITAMIN_B1_THIAMINE_MG.getText().equals(dataProduct)) {
            productData.setVitaminB1ThiamineMg(bigDecimal);
            return;
        } else if (VITAMIN_B2_RIBOFLAVIN_MG.getText().equals(dataProduct)) {
            productData.setVitaminB2RiboflavinMg(bigDecimal);
            return;
        } else if (VITAMIN_B9_FOLIC_ACID_G.getText().equals(dataProduct)) {
            productData.setVitaminB9FolicAcidG(bigDecimal);
            return;
        } else if (VITAMIN_E_TOCOPHEROL_MG.getText().equals(dataProduct)) {
            productData.setVitaminETocopherolMg(bigDecimal);
            return;
        } else if (VITAMIN_PP_NIACIN_MG.getText().equals(dataProduct)) {
            productData.setVitaminPpNiacinMg(bigDecimal);
            return;
        } else if (CALORIE_CALORIES.getText().equals(dataProduct)) {
            productData.setCalorieCalories(bigDecimal);
            return;
        }
    }
}




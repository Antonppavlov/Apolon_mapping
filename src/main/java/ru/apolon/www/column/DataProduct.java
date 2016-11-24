package ru.apolon.www.column;


public enum DataProduct {

    WATER_G                                    ("вода, г"),
    PROTEINS_G                                    ("белки, г"),
    FATS_G                               ("жиры, г"),
    CARBOHYDRATES_G                          ("углеводы, г"),
    MONO_AND_DISACCHARIDES_G                     ("моно- и дисахариды, г"),
    FIBER_G                                    ("клетчатка, г"),
    STARCH_G                                    ("крахмал, г"),
    PECTIN_G                               ("пектин, г"),
    ORGANIC_ACIDS_G                    ("органические кислоты, г"),
    ASH_G                         ("зола, г"),
    POTASSIUM_MG                          ("калий, мг"),
    CALCIUM_MG                        ("кальций, мг"),
    MAGNESIUM_MG                               ("магний, мг"),
    SODIUM_MG                               ("натрий, мг"),
    PHOSPHORUS_MG                             ("фосфор, мг"),
    IRON_G                             ("железо, мкг"),
    IODINE_MKG                            ("йод, мкг"),
    COBALT_MG                         ("кобальт, мкг"),
    MANGANESE_MCG                       ("марганец, мкг"),
    COPPER_G                        ("медь, мкг"),
    MOLYBDENUM_G                     ("молибден, мкг"),
    FLUORINE_G                       ("фтор, мкг"),
    ZINC_G                           ("цинк, мкг"),
    VITAMIN_A_RETINOL_MG                     ("витамин А(ретинол), мг,"),
    VITAMIN_B_CAROTENE_MG                    ("витамин B-каротин, мг"),
    VITAMIN_C_ASCORBIC_ACID_MG               ("витамин С (аскорбиновая кислота), мг"),
    VITAMIN_B1_THIAMINE_MG                   ("витамин В1 (тиамин), мг"),
    VITAMIN_B2_RIBOFLAVIN_MG                 ("витамин В2 (рибофлавин), мг"),
    VITAMIN_B9_FOLIC_ACID_G                  ("витамин В9 (фолиевая кислота), мкг"),
    VITAMIN_E_TOCOPHEROL_MG                  ("витамин Е(токоферол), мг,"),
    VITAMIN_PP_NIACIN_MG                     ("витамин РР (ниацин), мг"),
    CALORIE_CALORIES                      ("калорийность, ккал");


    private final String text;

    private DataProduct(final String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }


}

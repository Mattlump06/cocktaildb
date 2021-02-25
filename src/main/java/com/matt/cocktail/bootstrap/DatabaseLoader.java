package com.matt.cocktail.bootstrap;

import com.matt.cocktail.domain.Drink;
import com.matt.cocktail.repositories.DrinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private DrinkRepository drinkRepository;


    public DatabaseLoader(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Drink bloodyMary = new Drink();
        bloodyMary.setDrinkName("Bloody Mary");
        bloodyMary.setGlassType("Highball");
        bloodyMary.setStrAlcoholic("Alcoholic");
        bloodyMary.setDrinkDetails("A Bloody Mary is a cocktail containing vodka, tomato juice, and other spices and " +
                "flavorings including Worcestershire sauce, hot sauces, garlic, herbs, horseradish, celery, olives, " +
                "salt, black pepper, lemon juice, lime juice and celery salt.");
        bloodyMary.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613904102/bloody-mary-720x720-prim" +
                "ary-28cf1aaa79d0424d951901fcc0a42e91_xmhgw9.jpg");

        drinkRepository.save(bloodyMary);

        Drink mojito = new Drink();
        mojito.setDrinkName("Mojito");
        mojito.setGlassType("Collins Glass");
        mojito.setStrAlcoholic("Alcoholic");
        mojito.setDrinkDetails("Mojito is a traditional Cuban highball. The cocktail often consists of five " +
                "ingredients: white rum, sugar, lime juice, soda water, and mint. Its combination of sweetness, " +
                "citrus, and herbaceous mint flavours is intended to complement the rum, and has made the mojito a " +
                "popular summer drink.\n");
        mojito.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613904115/__opt__aboutcom__coeus__" +
                "resources__content_migration__liquor__2018__09__04153106__mojito-720x720-recipe-a55b114fc99c4a64b38c9e" +
                "f6d1660e20_znn2y2.jpg");

        drinkRepository.save(mojito);

        Drink margarita = new Drink();

        margarita.setDrinkName("Margarita");
        margarita.setGlassType("Margarita glass");
        margarita.setStrAlcoholic("Alcoholic");
        margarita.setDrinkDetails("A margarita is a cocktail consisting of tequila, orange liqueur, and lime juice " +
                "often served with salt on the rim of the glass. The drink is served shaken with ice, blended with ice, " +
                "or without ice.\n");
        margarita.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613904127/1198_1_1403268483_lrg_r9" +
                "wv2v.jpg");

        drinkRepository.save(margarita);

        Drink oldFash = new Drink();

        oldFash.setDrinkName("Old-fashioned");
        oldFash.setGlassType("Rocks Glass");
        oldFash.setStrAlcoholic("Alcoholic");
        oldFash.setDrinkDetails("The old fashioned is a cocktail made by muddling sugar with bitters and water, adding " +
                "whiskey or, less commonly, brandy, and garnishing with orange slice or zest and a cocktail cherry. It " +
                "is traditionally served in an old fashioned glass, which predated the cocktail\n");
        oldFash.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943432/old-fashioned-72d44c_lks08h." +
                "jpg");

        drinkRepository.save(oldFash);

        Drink pina = new Drink();

        pina.setDrinkName("Pina-Colada");
        pina.setGlassType("Poco Grande glass");
        pina.setStrAlcoholic("Alcoholic, Non-Alcoholic");
        pina.setDrinkDetails("The piña colada is a sweet cocktail made with rum, cream of coconut or coconut milk, and " +
                "pineapple juice, usually served either blended or shaken with ice. It may be garnished with either a " +
                "pineapple wedge, maraschino cherry, or both. There are two versions of the drink, both originating in " +
                "Puerto Rico.\n");
        pina.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943450/easy-pina-colada-5_ygm6q6.jpg");

        drinkRepository.save(pina);

        Drink espMarti = new Drink();

        espMarti.setDrinkName("Espresso Martini");
        espMarti.setGlassType("Martini Glass");
        espMarti.setStrAlcoholic("Alcoholic");
        espMarti.setDrinkDetails("The espresso martini is a cold, coffee-flavored cocktail made with vodka, espresso " +
                "coffee, coffee liqueur, and sugar syrup. It is not a true martini as it contains neither gin nor " +
                "vermouth, but is one of many drinks that incorporate the term into their names.\n");
        espMarti.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943473/espresso-martini-square-7" +
                "35x735_h6a15z.png");

        drinkRepository.save(espMarti);

        Drink arnPalm = new Drink();

        arnPalm.setDrinkName("Arnold Palmer");
        arnPalm.setGlassType("Pint Glass");
        arnPalm.setStrAlcoholic("Non-Alcoholic");
        arnPalm.setDrinkDetails("An Arnold Palmer beverage is made with two summer drink classics: a combination iced " +
                "tea and lemonade. It’s a slightly sweet lemony tea blend that has a refreshing taste.");
        arnPalm.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943536/arnold-palmer_320xx1414-2121" +
                "-0-0_gedulq.jpg");

        drinkRepository.save(arnPalm);

        Drink mangoLassi = new Drink();

        mangoLassi.setDrinkName("Mango Lassi");
        mangoLassi.setGlassType("Pint Glass");
        mangoLassi.setStrAlcoholic("Non-Alcoholic");
        mangoLassi.setDrinkDetails("Lassi is a popular traditional dahi-based drink or regional name for buttermilk in " +
                "Jammu, Himachal, Haryana and Punjab. Lassi is a blend of yogurt, water, spices and sometimes fruit. " +
                "Namkeen lassi is similar to doogh, while sweet and mango lassis are like milkshakes.\n");
        mangoLassi.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943659/Indian-Mango-Lassi-Recipe-" +
                "500x500_udedfe.jpg");

        drinkRepository.save(mangoLassi);

        Drink horchata = new Drink();

        horchata.setDrinkName("Horchata");
        horchata.setGlassType("Highball Glass");
        horchata.setStrAlcoholic("Non-Alcoholic");
        horchata.setDrinkDetails("Horchata, or orxata, is a name given to various kinds of plant milk beverages of " +
                "similar taste and appearance. It originated at least as far back as 13th-century Valencia, where it is " +
                "known as orxata de xufa.\n");
        horchata.setImageUrl("https://res.cloudinary.com/dp8otftbi/image/upload/v1613943671/horchata-6_xmbmvi.jpg");

        drinkRepository.save(horchata);


     }
}

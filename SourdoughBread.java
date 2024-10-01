public class SourdoughBread extends Bread{
    private String sourdoughStarter; //amount of sourdough starter
    private int fermentationTime; // fermentation times in hours

    public SourdoughBread(){
        super("5.00 cups", "1.50 cups", "2.50 tsps", "n/a", "n/a", "n/a", "Sourdough Bread", "Mix ingredients and let ferment.");
        this.sourdoughStarter="Sourdough Starter: 2.00 tsps";
        this.fermentationTime=10;

    }
    public SourdoughBread(String flour, String water, String salt, String sugar, String yeast, String sourdoughStarter) {
        super(flour, water, salt, sugar, "0 tsps", yeast, "Sourdough Bread", "A recipe of Sourdough Bread:");
        this.sourdoughStarter = sourdoughStarter;
        this.fermentationTime=fermentationTime;
    }
    public String getIngredients() {
        return super.getIngredients() + "\n" + sourdoughStarter;
    }

    public String getRecipe() {
        return "1. Mix flour, water, salt, baking powder, yeast, and  sourdough starter.\n" +
                "2. Knead the dough\n" +
                "3. Let dough rise for" +  fermentationTime + " hours.\n" +
                "4. Stretch and fold the dough\n" +
                "5. Cut and shape the dough\n" +
                "6. Second rise\n" +
                "7. Preheat the oven to 450°F towards the end of the second rise.\n" +
                "8. Spray the loaf with lukewarm water.\n" +
                "9. Bake the bread at 400°F for 20 minutes, until golden brown.\n" +
                "10. Remove the bread from the oven.\n" +
                "11. Let the bread cool until good to eat.";
    }
    @Override
    public void bake() {
        super.bake(); // Calls the bake method from the Bread class
    }

    @Override
    public String toString() {
        return super.toString() + "\nSourdough Starter: " + sourdoughStarter+ "\nFermentation Time: " + fermentationTime + " hours";
    };
    }




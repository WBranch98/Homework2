
public class Pastry extends Bread {
    private String butter; // Unique variable for pastry

    public Pastry() {
        super("3.00 cups", "1.00 cup", "1.00 tsp", "2.00 tbsp", "0 tsps", "1.00 tsp", "Pastry", "A recipe of Pastry:");
        this.butter = "Butter: 1.00 cup";
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\n" + butter;
    }

    public String getRecipe() {
        return "1. Mix flour, salt, and sugar.\n" +
                "2. Cut in cold butter until the mixture resembles coarse crumbs.\n" +
                "3. Add water gradually until dough forms.\n" +
                "4. Roll out and shape as desired.\n" +
                "5. Bake until golden brown.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nButter: " + butter;
    }
}

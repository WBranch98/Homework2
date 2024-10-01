public class Main {
    public static void main(String[] args) {
        SourdoughBread sourdough = new SourdoughBread();
        System.out.println("Ingredients of Sourdough Bread are:");
        System.out.println("\n" + sourdough.getIngredients());
        System.out.println("\n"+"A recipe of Sourdough Bread:");
        System.out.println("\n" + sourdough.getRecipe());
        sourdough.bake();
        sourdough.bake(); // Attempt to bake again

        System.out.println("\n---");

        Pastry pastry = new Pastry();
        System.out.println("Ingredients of Pastry are:");
        System.out.println("\n"  + pastry.getIngredients());
        System.out.println("\n"+"A recipe of a Pastry:");
        System.out.println("\n" + pastry.getRecipe());
        pastry.bake();
        pastry.bake(); // Attempt to bake again
    }
}

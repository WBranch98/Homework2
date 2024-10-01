public class Bread { //Instance variables
    private String flour;
    private String water;
    private String salt;
    private String sugar;
    private String bakingPowder;
    private String yeast;
    private String breadName;
    private String state; //baked or not baked
    private String recipe;


    public Bread(String flour, String water, String salt, String sugar, String s, String yeast, String sourdoughBread, String string) { //default argument
        this.flour="4.00 cups";
        this.water="2.00 cups";
        this.salt="2.00 teaspoons";
        this.sugar=".25 cup";
        this.bakingPowder="1.00 teaspoon";
        this.yeast="1.00 tablespoon";
        this.breadName="bread";
        this.state="not baked";
        this.recipe="Mix ingredients, knead, rise, bake";

  }
  public Bread( String flour, String water, String salt, String sugar, String bakingPowder, String yeast, String breadName, String state, String recipe){
      this.flour=flour;
      this.water=water;
      this.salt=salt;
      this.sugar=sugar;
      this.bakingPowder=bakingPowder;
      this.yeast=yeast;
      this.breadName=breadName;
      this.state="not baked";
      this.recipe=recipe;

  }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(String bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
    public String getIngredients() {
        return String.format("Flour: %s\nWater: %s\nSalt: %s\nSugar: %s\nBaking Powder: %s\nYeast: %s",
                flour, water, salt, sugar, bakingPowder, yeast);
}
    public void bake() {
        if (state.equals("not baked")) {
            state = "baked";
            System.out.println("The " + breadName + " is baked now.");
        } else {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
    }

    @Override
    public String toString() {
        return "Bread Name=" + breadName + '\'' +
                ", state=" + state + '\'' +
                ", recipe=" + recipe + '\'' +
                ", ingredients"  + getIngredients();

    }
}
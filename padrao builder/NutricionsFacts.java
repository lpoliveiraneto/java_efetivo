//padrão Builder
class NutricionFacts{

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;

    public int getServingSize(){
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories(){
        return calories;
    }

    public int getFat(){
        return fat;
    }

    public static class Builder{
        //atributos obrigatório para classe
        private final int servingSize;
        private final int servings;

        //atributos opcionais
        
        private int calories = 0 ;
        private int fat = 0;
        
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public NutricionFacts build(){
            return new NutricionFacts(this);
        }
    }

    private NutricionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }
}
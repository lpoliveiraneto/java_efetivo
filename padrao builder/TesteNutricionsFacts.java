
class TesteNutricionsFacts {

    public static void main(String[] args) {
        NutricionFacts coca = new NutricionFacts.Builder(240,20).calories(20).build();

        System.out.println(coca.getCalories());
    }

}

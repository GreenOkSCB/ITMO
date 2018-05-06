package lesson14_15.builder;

public class NutritionFacts {
    private final int servings; // обязательный атрибут

    private final int calories; // дополнительный атрибут
    private final int fat; // дополнительный атрибут


    public static class Builder {
        private final int servings;// обязательный атрибут

        private int calories = 0;// дополнительный атрибут
        private int fat = 0;// дополнительный атрибут

        public Builder(int servings){
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

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
    }

    public static void main(String[] args) {
        NutritionFacts beaf = new Builder(10)
                .calories(898)
                .fat(45)
                .build();
        NutritionFacts cocacola = new Builder(3)
                .calories(456)
                .fat(22)
                .build();
    }
}

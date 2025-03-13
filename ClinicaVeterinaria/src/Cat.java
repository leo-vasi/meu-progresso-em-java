public class Cat extends Animal {

    private String color;

    private Cat(CatBuilder builder) {
        super(builder);
        this.color = builder.color;
    }

    public static class CatBuilder extends AnimalBuilder<CatBuilder> {
        private String color;

        public CatBuilder color(String color) {
            this.color = color;
            return this;
        }

        @Override
        protected CatBuilder self() {
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }

    public String getColor() {
        return color;
    }

    @Override
    public String showInfo() {
        return "\nType: Cat\n" + super.showInfo() + "\nColor: " + color;
    }
}

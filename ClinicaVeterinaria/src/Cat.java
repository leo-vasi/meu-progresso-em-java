public class Cat extends Animal {

    private String color;

    private Cat(Cat.BuilderCat builderCat) {
        super(builderCat.age, builderCat.name, builderCat.weight);
        this.color = builderCat.color;
    }


    public static class BuilderCat {
        private int age;
        private String name;
        private double weight;
        private String color;

        public BuilderCat() {}

        public Cat.BuilderCat age(int age) {
            this.age = age;
            return this;
        }

        public Cat.BuilderCat name(String name) {
            this.name = name;
            return this;
        }

        public Cat.BuilderCat weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Cat.BuilderCat color(String color) {
            this.color = color;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String showInfo() {
        return "\nType: Cat\n" + super.showInfo() + "\nColor: " + color;
    }
}
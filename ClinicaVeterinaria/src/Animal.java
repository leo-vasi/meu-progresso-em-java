import java.util.HashMap;
import java.util.Map;

public class Animal {
    private int age;
    private String name;
    private double weight;
    private Map<String, String> attributes;

    protected Animal(AnimalBuilder<?> builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.weight = builder.weight;
        this.attributes = builder.attributes;
    }

    public static class AnimalBuilder<T extends AnimalBuilder<T>> {
        private int age;
        private String name;
        private double weight;
        private Map<String, String> attributes = new HashMap<>();

        public T age(int age) {
            this.age = age;
            return self();
        }

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T weight(double weight) {
            this.weight = weight;
            return self();
        }

        public T addAttribute(String key, String value) {
            this.attributes.put(key, value);
            return self();
        }

        protected T self() {
            return (T) this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getAttribute(String key) {
        return attributes.get(key);
    }

    public String showInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Age: ").append(age).append("\n");
        info.append("Name: ").append(name).append("\n");
        info.append("Weight: ").append(weight).append("\n");
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            info.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return info.toString();
    }
}
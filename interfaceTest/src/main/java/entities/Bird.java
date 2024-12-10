package entities;

public class Bird implements Animal{
    @Override
    public void falar() {
        System.out.println("O pássaro deve cantar");
    }

    @Override
    public void andar() {
        System.out.println("O pássaro deve voar");
    }
}

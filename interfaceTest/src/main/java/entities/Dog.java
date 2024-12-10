package entities;

public class Dog implements Animal{

    @Override
    public void falar() {
        System.out.println("O cachorro deve latir");
    }

    @Override
    public void andar() {
        System.out.println("O cachorro deve correr");
    }
}

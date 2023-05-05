public class Harpa extends Instrumentos implements TrocarCorda{
    public Harpa(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }

    @Override
    public void Tocar(){
        System.out.println("Instrumento de corda");
    }
    @Override
    public void Afinar(){
        System.out.println("Afinar as cordas: E - A - D - G - B - E");
    }
    @Override
    public void TrocarCorda(){
        System.out.println("Trocar as cordas para fio de nylon");
    }
}

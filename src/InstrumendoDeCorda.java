public class InstrumendoDeCorda extends Instrumentos implements TrocarCorda{
    public InstrumendoDeCorda(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }

    @Override
    public void TrocarCorda(){
        System.out.println("Esse Instrumento quando necessário precisa trocar suas cordas");
    }
    @Override
    public void Afinar(){
        System.out.println("Instrumento deve ser afinado");
    }
}

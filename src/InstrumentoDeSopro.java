public class InstrumentoDeSopro extends Instrumentos {
    public InstrumentoDeSopro(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }

    @Override
    public void Afinar(){
        System.out.println("Instrumento deve ser afinado");
    }
}

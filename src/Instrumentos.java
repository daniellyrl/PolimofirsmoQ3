public abstract class Instrumentos {
    protected String nome;
    protected String material;
    protected int quantidade;

    public Instrumentos(String nome, String material, int quantidade){
        this.nome = nome;
        this.material = material;
        this.quantidade = quantidade;
    }

    public void Tocar(){
        System.out.println("Este instrumento toca");
    }

    public void Afinar(){
        System.out.println("Este instrumento afina");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void TrocarCorda() {
    }
}


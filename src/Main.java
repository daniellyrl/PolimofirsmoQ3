public class Main {
    public static void main(String[] args) {
        Instrumentos i1 = new Harpa("Sidney", "Jacarandá", 5);
        Instrumentos i2 = new Violao("Aurora", "Jatobá", 8);
        Instrumentos i3 = new Flauta("Sweet", "Pinho", 4);

            System.out.println("Informações sobre a Harpa: \n" +
                    "Nome: " + i1.getNome() + "\n" +
                    "Material: " + i1.getMaterial() + "\n" +
                    "Quantidade: " + i1.getQuantidade() + "\n");
            i1.TrocarCorda();
            i1.Afinar();
            i1.Tocar();

            System.out.println(" \n Informações sobre o Violão: \n" +
                    "Nome: " + i2.getNome() + "\n" +
                    "Material: " + i2.getMaterial() + "\n" +
                    "Quantidade: " + i2.getQuantidade());
            i2.TrocarCorda();
            i2.Afinar();
            i2.Tocar();

            System.out.println(" \n Informações sobre a Flauta: \n" +
                    "Nome: " + i3.getNome() + "\n" +
                    "Material: " + i3.getMaterial() + "\n" +
                    "Quantidade: " + i3.getQuantidade());
            i3.Afinar();
            i3.Tocar();
        }
    }
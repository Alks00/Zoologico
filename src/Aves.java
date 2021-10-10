public class Aves extends Animal {

    String corPena;

    public Aves(){}

    public Aves(String corPena) {
        this.corPena = corPena;
    }

    public Aves(String nome, int idade, Double tamanho, String som, String corPena) {
        super(nome, idade, tamanho, som);
        this.corPena = corPena;
    }

    public Aves(String nome, int idade, Double tamanho, String som, int altitudeVoo, String corPena) {
        super(nome, idade, tamanho, som, altitudeVoo);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        String objetoString = super.toString();
        return objetoString + ", corPena: " + corPena;
    }

}

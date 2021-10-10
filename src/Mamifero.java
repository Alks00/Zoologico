public class Mamifero extends Animal {
    
    String corPelo;

    public Mamifero(){}

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero(String nome, int idade, Double tamanho, String som, String corPelo) {
        super(nome, idade, tamanho, som);
        this.corPelo = corPelo;
    }

    public Mamifero(String nome, int idade, Double tamanho, String som, int altitudeVoo, String corPelo) {
        super(nome, idade, tamanho, som, altitudeVoo);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        String objetoString = super.toString();
        return objetoString + ", corPelo: " + corPelo;
    }

}

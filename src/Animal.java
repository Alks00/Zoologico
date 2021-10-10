public abstract class Animal {
    
    private String nome;
    private int idade;
    private Double tamanho;
    private String som;
    private boolean voa = false;
    private int altitudeVoo;

    public Animal(){}

    public Animal(String nome, int idade, Double tamanho, String som) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.som = som;
    }

    public Animal(String nome, int idade, Double tamanho, String som, int altitudeVoo) {
        this.nome = nome;
        this.idade = idade;
        this.tamanho = tamanho;
        this.som = som;
        this.voa = true;
        this.altitudeVoo = altitudeVoo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public int getAltitudeVoo() {
        return altitudeVoo;
    }

    public void setAltitudeVoo(int altitudeVoo) {
        if(this.getVoa()){
            this.altitudeVoo = altitudeVoo;
        }
    }

    public boolean getVoa() {
        if(!this.voa){
            System.out.println("Este animal não voa.");
        }
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public String toString() {
        String objetoString = "nome: " + nome +
            ", idade: " + idade + " anos" +
            ", tamanho: " + String.format("%.2f", tamanho) + " m" + 
            ", som: " + som + 
            ", voa: " + voa;
        if(voa){
            objetoString += ", altitudeVoo: " + altitudeVoo + " m";
        }
        return objetoString;
    }

}

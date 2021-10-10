public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(buildMorcego());
        System.out.println(buildLeao());
        System.out.println(buildGaviao());
        System.out.println(buildAvestruz());
    }

    private static Mamifero buildMorcego(){
        Mamifero morcego = new Mamifero();

        morcego.setNome("Morcego");
        morcego.setVoa(true);
        morcego.setAltitudeVoo(5);
        morcego.setCorPelo("marrom");
        morcego.setIdade(2);
        morcego.setSom("farfalho");
        morcego.setTamanho(0.2);

        return morcego;
    }

    private static Mamifero buildLeao(){
        Mamifero leao = new Mamifero();

        leao.setNome("Leão");
        leao.setCorPelo("caramelo");
        leao.setIdade(12);
        leao.setSom("rugido");
        leao.setTamanho(1.4);

        return leao;
    }

    private static Aves buildAvestruz(){
        Aves avestruz = new Aves();

        avestruz.setNome("Avestruz");
        avestruz.setCorPena("azul");
        avestruz.setIdade(4);
        avestruz.setSom("grasnido");
        avestruz.setTamanho(1.8);

        return avestruz;
    }

    private static Aves buildGaviao(){
        Aves gaviao = new Aves();

        gaviao.setNome("Gavião");
        gaviao.setVoa(true);
        gaviao.setAltitudeVoo(1200);
        gaviao.setCorPena("preta");
        gaviao.setIdade(9);
        gaviao.setSom("atiado");
        gaviao.setTamanho(0.4);

        return gaviao;
    }
}

public class Linguagem{
    protected String nome;
    protected double numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, double numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }
    public void getInfo() {
        System.out.println(nome + " é falado por: "+ numFalantes+ " pessoas principalmente em: " + regioesFaladas);
        System.out.println("A linguagem é falada por: "+ordemDasPalavras);
    }
    public static void main (String []args){
        Mayan huastecLinguagem = new Mayan("Huasteca", 164938);
        huastecLinguagem.getInfo();
        SinoTibetan mandarimSinoTibetan = new SinoTibetan("Chines", 918000000);
        mandarimSinoTibetan.getInfo();
        SinoTibetan bSinoTibetan = new SinoTibetan("Birmanes", 33000000);
        bSinoTibetan.getInfo();
    }
}
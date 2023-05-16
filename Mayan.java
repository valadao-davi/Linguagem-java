class Mayan extends Linguagem{

    public Mayan(String nome, double numFalantes) {
        super(nome, numFalantes, "América Central", "Verbo Objeto Sujeito");
    }
    
    @Override
    public void getInfo() {
        System.out.println(nome+ " é falado por "+ numFalantes+" pessoas principalmente em " + regioesFaladas+ " \n A linguagem segue a ordem das palavras: "+ordemDasPalavras+ "\n Fato interessante a linguagem "+nome+ " é uma língua ergativa");
    }
}

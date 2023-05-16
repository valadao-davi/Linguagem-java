 class SinoTibetan extends Linguagem {

    public SinoTibetan(String nome, double numFalantes) {
        super(nome, numFalantes,"\nAsia", "\nSujeito-objeto-verbo");
        if (this.nome.contains("Chines")){
            ordemDasPalavras = "\nsujeito-verbo-objeto";
        }
    }
    
}

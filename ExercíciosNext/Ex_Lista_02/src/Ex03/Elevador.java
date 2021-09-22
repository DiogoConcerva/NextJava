package Ex03;

public class Elevador {
    // Variáveis
    private int terreo;
    private int andares;
    private int capacidade;
    private int andarAtual = 0;
    private int quantidadePresente = 0;

    // Construtor
    public Elevador() {
    }
    // Getters an Setters
    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePresente() {
        return quantidadePresente;
    }

    public void setQuantidadePresente(int quantidadePresente) {
        this.quantidadePresente = quantidadePresente;
    }

    // Método inicializar elevador
    public void inicializaElevador(int terreo, int andares, int CAPACIDADE_MAXIMA) {
        this.terreo = terreo;
        this.andares = andares;
        this.capacidade = CAPACIDADE_MAXIMA;
    }

    // Método entrar no elevador
    public void entrarElevador(){
        if (this.quantidadePresente < this.capacidade){
            this.quantidadePresente +=1;
        }
        else {
            System.out.println("Elevador na capacidade máxima de " + this.capacidade + " pessoas.");
        }
    }

    // Método sair do elevador
    public void sairElevador(){
        if (this.quantidadePresente == 0){
            System.out.println("Elevador vazio.");
        }
        else {
            this.quantidadePresente -= 1;
        }
    }

    // Método subir
    public void subirAndares(){
        if (this.andarAtual == this.andares){
            System.out.println("Elevador no " + this.andarAtual + "º e último andar.");
        }
        else {
            this.andarAtual += 1;
        }
    }

    // Método descer
    public void descerAndadres(){
        if (this.andarAtual == 0){
            System.out.println("O elevador encontra-se no térreo.");
        }
        else {
            this.andarAtual -= 1;
        }
    }

    // Método informações elevador

    // Método com informações do elevador
    @Override
    public String toString() {
        return "Informações do elevador:\n" +
                "Andar atual..............: " + andarAtual + "º andar" +
                "\nTotal de andares.......: " + andares + " andares" +
                "\nQuantidade de pessoas..: " + quantidadePresente + " pessoa(s) presente(s)" +
                "\nCapacidade máxima......: " + capacidade + " pessoas";
    }
}

package Ex04;

public class ControleRemoto {
    // Variáveis
    int canais = 3;
    int volume = 3;

    // Construtor
    public ControleRemoto() {
    }

    // Getters and Setrs
    public int getCanais() {
        return canais;
    }

    public void setCanais() {
        this.canais = canais + 1;
    }

    public void setDiminuirCanais(){
        this.canais = canais - 1;
    }

    public void setCanalIndicado(int canais){

        this.canais = canais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = volume + 1;
    }

    public void setDiminueVolume(){
        this.volume = volume - 1;
    }
}

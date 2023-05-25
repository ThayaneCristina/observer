import java.util.Observable;
import java.util.Observer;

public class Paciente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void marcar(Exame exame) {
        exame.addObserver(this);
    }

    public void update(Observable turma, Object arg1) {
        this.ultimaNotificacao = this.nome + ", o resultado está pronto.";
        // System.out.println(this.ultimaNotificacao);
    }

}

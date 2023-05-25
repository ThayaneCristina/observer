
import java.util.Observable;

public class Exame extends Observable {

    private String resultado;
    private String nomeExame;
    private String nomeMedico;


    public Exame(String resultado, String nomeExame, String nomeMedico) {
        this.resultado =resultado;
        this.nomeExame = nomeExame;
        this.nomeMedico = nomeMedico;
    }

    public void resltado() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Exame{" +
                "resultado=" + resultado +
                ", nomeExame=" + nomeExame +
                ", nomeMedico='" + nomeMedico + '\'' +
                '}';
    }

}

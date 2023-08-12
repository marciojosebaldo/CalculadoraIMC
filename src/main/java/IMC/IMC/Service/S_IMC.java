package IMC.IMC.Service;

import org.springframework.stereotype.Service;

@Service
public class S_IMC {

    private float altura;
    private float peso;
    float resultado;
    String mensagem;

    public float calcImc(float altura, float peso) {
        return resultado = peso / (altura * altura) * 10000;
    }

    public String tabelaImc(float resultado) {
        if (resultado <= 18.5) {
            mensagem = "Você está abaixo do peso";
        } else if (resultado > 18.5 && resultado <= 24.9) {
            mensagem = "Você está com o peso ideal";
        } else if (resultado > 25 && resultado <= 29.9) {
            mensagem = "Você está com sobrepeso";
        } else if (resultado > 30 && resultado <= 39.9) {
            mensagem = "Você está com obesidade";
        } else {
            mensagem = "Vocês está com obesidade grave";
        }
        return mensagem;
    }
}

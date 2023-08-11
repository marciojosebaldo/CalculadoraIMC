package IMC.IMC.Service;

import org.springframework.stereotype.Service;

@Service
public class S_IMC {

    private float altura;
    private float peso;

    public void configImc(float altura, float peso) {
        altura = this.altura;
        peso = this.peso;
    }

    public float calcImc() {
        return peso / (altura * altura);
    }

}

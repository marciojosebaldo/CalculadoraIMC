package IMC.IMC.Controller;

import IMC.IMC.Service.S_IMC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_IMC {

    private final S_IMC s_imc;

    public C_IMC(S_IMC s_imc) {
        this.s_imc = s_imc;
    }

    @PostMapping("/")
    public String calculadoraImc(@RequestParam("altura") float altura,
                                 @RequestParam("peso") float peso,
                                 Model model) {

        s_imc.configImc(altura, peso);
        float imc = s_imc.calcImc();

        model.addAttribute("resultadoImc", imc);

        return "Home/home";
    }
}
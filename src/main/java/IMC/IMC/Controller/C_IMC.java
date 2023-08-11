package IMC.IMC.Controller;

import IMC.IMC.Service.S_IMC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_IMC {

    @GetMapping("/")
    public String paginaInicial(){
        return "Home/home";
    }

    @PostMapping("/")
    public String calculadoraImc(@RequestParam("altura") long altura,
                                 @RequestParam("peso") long peso) {
        return "Home/home";
    }

    S_IMC s_imc = new S_IMC();

}
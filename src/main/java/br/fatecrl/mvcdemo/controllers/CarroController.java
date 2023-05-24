package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Carro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/carros")
public class CarroController {

    public List<Carro> carros = new ArrayList<Carro>();

    public CarroController(){
        carros.add(new Carro("Volks","Gol","Preto",50000.00f,2015,15700.00f));
        carros.add(new Carro("Ford","Fiesta","Amarelo",70000.00f,2013,23500.00f));
        carros.add(new Carro("GM","Corsa","Azul",60000.00f,2010,35820.00f));
        carros.add(new Carro("Jac","J3","Vermelho",50000.00f,2012,18753.00f));

    }
    @GetMapping
    public String getCarros(Model model){
    model.addAttribute("carros",carros);
    return "carros";
    }

}

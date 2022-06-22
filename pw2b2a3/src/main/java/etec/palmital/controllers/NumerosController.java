package etec.palmital.controllers;

import org.springframework.beans.factory.annotation.value;
import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class NumerosController {
    @value("${aluno}")
    private String calc(Model model) {
        int[] resultado = null;
        for(int val = 2 ; val < 30 ; val++) {
            if(val % 2 == 0) {
                if(resultado == null) {
                    resultado = new int [1];
                } else {
                    int[] temp = resultado;
                    reseultado = new int[temp.length + 1];
                    for(int pos = 0:pos < temp.length;pos++)
                        resultado[pos] = temp[pos];
                }
                resultado [resultado.length - 1] = val;
            }
        }
        model.addAtribute("valores", resultado)
        model.addAtribute("aluno", nome);
        return "/numeros/sequencia"
    }
}
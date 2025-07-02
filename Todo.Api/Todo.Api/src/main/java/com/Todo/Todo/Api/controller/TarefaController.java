package com.Todo.Todo.Api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TarefaController {
        
    @GetMapping("/tarefas")
    public List<String> listarTarefas() {
        List<String> tarefas = new ArrayList<>();
        
        tarefas.add("Doces 🍬");
        tarefas.add("Frutas: 🥭");
        tarefas.add("Legumes: 🫑");

        List<String> maisTarefas = List.of("Testando a API");
        tarefas.addAll(maisTarefas);

        if (tarefas.contains("A Tarefa")) {
            System.out.println("Ca esta a sua tarefa! 📒");
        }
        return tarefas;
    }
}

































/**public class TarefaController {
    public static void main(String[] args) {
        System.out.println();
    List<String> tarefas = new ArrayList<>();
    }
}*/

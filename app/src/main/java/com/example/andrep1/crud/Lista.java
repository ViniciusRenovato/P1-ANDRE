package com.example.andrep1.crud;

import com.example.andrep1.domain.Salvar;

import java.util.LinkedList;
import java.util.List;

public class Lista {
    private static final List contas = new LinkedList();
    private static Integer count=1;
    private Lista(){
    }
    public static void save(Salvar s){
        if (contas.contains(s)){
            contas.set(contas.indexOf(s),s);
        }
        else {
            s.setId(count++);
            contas.add(s);
        }
    }
    public static List getLista(){
        return contas;
    }
}

package com.example.senacbet.dao;

import com.example.senacbet.model.Apostador;

import java.util.ArrayList;
import java.util.List;

public class ApostadoresDAO {

        private static List<Apostador> apostadores = new ArrayList<Apostador>();

        public void salvar(Apostador apostador) {
            apostadores.add(apostador);
        }

        public static List<Apostador> listar() {
            return new ArrayList<>(apostadores);

        }

}



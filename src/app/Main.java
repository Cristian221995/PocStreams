package app;
import classes.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas = Arrays.asList(new Persona("Cristian Fonteina", 23, 37796753),
                                new Persona("Mauricio Goyeneche", 17, 37796754),
                                new Persona("Maximiliano Morales", 21, 37796755),
                                new Persona("Agustin Nicoloso", 25, 37796756),
                                new Persona("Manuel Sureda", 30, 19999999));

        System.out.println(String.format("Personas: %s", personas));

        System.out.println(String.format("Personas mayores a 21: %s", personas.stream()
                .filter(persona -> persona.getEdad()>21)
                .collect(Collectors.toList())));

        System.out.println(String.format("Personas menores a 18: %s", personas.stream()
                .filter(persona -> persona.getEdad()<18)
                .collect(Collectors.toList())));

        System.out.println(String.format("Personas mayores a 21 y con dni mayor a 20 millones: %s", personas.stream()
                .filter(persona -> persona.getEdad()>21)
                .filter(persona -> persona.getDni()> 20000000)
                .collect(Collectors.toList())));
    }
}

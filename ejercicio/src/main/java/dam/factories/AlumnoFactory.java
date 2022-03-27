package dam.factories;

import dam.utils.Aleatorio;

public class AlumnoFactory {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String dni;
    private int id;
    private String tipoAlumno;

    public String nombre(){
        String [] list={"Álvaro","Jorge","Jose","Pepe","Ruben","Manuela","Francisco","Luis","Mario","Ainhoa","Carlos","Javier","Juan","Alejandro","Manolo","Daniel","Victor"};
        return list[Aleatorio.getRandom(0, list.length)];
    }
    public String apellido(){
        String [] list={"Mingo","Castillo","Gonzalez","Calvo","Carrero","Sanchez",
                "Pinzon","Monzon","Aro","Izquierdo","Lopez","Ramos","Bayon","Blanco","Cuesta","Leron"};
        return list[Aleatorio.getRandom(0, list.length)];
    }

    public String email(){
        String [] list={"mingo1234@gmail.com","Castillo737237@gmail.com","Gonzalez482637@gmail.com","Calvo826876@gmail.com","Carrero723525@gmail.com","Sanchez526156@gmail.com",
                "Pinzon245343@gmail.com","Monzon736276@gmail.com","Aro76@gmail.com","Izquierdo232@gmail.com",
                "Lopez32@gmail.com","Ramos43@gmail.com","Bayon343@gmail.com","Blanco43@gmail.com",
                "Cuesta23@gmail.com","Leron332@gmail.com"};
        return list[Aleatorio.getRandom(0, list.length)];
    }

    public String telefono(){
        String [] list={"673838392","783973693","837627736","736373683","678167829","689234568",
                "615142345","672862456","168267286","837627892","729625637","678765456","678908654",
                "654321234","678943245","678543656"};
        return list[Aleatorio.getRandom(0, list.length)];
    }


}

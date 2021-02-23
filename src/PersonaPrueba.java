public class PersonaPrueba {
    public static void main(String[] args) {
        //Creacion de un objeto
        Persona persona1 = new Persona();
        System.out.println("Valores pro default del objeto: ");
        persona1.desplegarNombre();

        persona1.nombre = "Cesar";
        persona1.apellidoPaterno = "Mata";
        persona1.apellidoMaterno = "Sánchez";

        persona1.desplegarNombre();

        Persona persona2 = new Persona();
        System.out.println("\nCreación de nuevo objeto");
        persona2.nombre = "Anally";
        persona2.desplegarNombre();
    }
}

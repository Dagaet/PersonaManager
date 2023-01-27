public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe", "Arteaga", "98273467K");

        //Ponemos el año de nacimiento
        persona.setYearBorn(2001);
        System.out.println("Primer nombre: " + persona.getNombre());
        System.out.println("Primer apellido: " + persona.getApellidos());
        System.out.println("La edad de la persona es: " + persona.getYearsOld());
        System.out.println("El DNI es: " + persona.getDNI());

        //Ponemos nuevo nombre, DNI y apellido con los setter
        persona.setNombre("Jose");
        persona.setApellidos("Correa");
        System.out.println("El nombre se ha actualizado, el nuevo nombre es: " + persona.getNombre());
        System.out.println("El apellido se ha actualizado, el nuevo apellido es: " + persona.getApellidos());
        persona.setDNI("43839331C");
        System.out.println("El DNI se ha actualizado, el nuevo DNI es: ");
        System.out.println(persona.getDNI());


    }
}
public class Main {
    public static void main(String[] args) {
        persona persona = new persona("Pepe", "234252352", "43839331D");
        persona.setYearBorn(2001);
        persona.ageCalculator();
        persona.validateDNI();
    }
}
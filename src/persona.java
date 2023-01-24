import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class persona {

    private String nombre;
    private String apellidos;
    private int yearBorn;
    private LocalDate localDate = LocalDate.now();
    private int year = localDate.getYear();
    private String DNI;
    private String mail;

    public persona(String nombre, String apellidos, String DNI){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }
    public void setYearBorn(int yearBorn){
        this.yearBorn = yearBorn;
    }

    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getYear() {
        return year;
    }

    public String getDNI() {
        return DNI;
    }

    public String getMail() {
        return mail;
    }

    public void ageCalculator(){
        System.out.println("Dime el año de nacimiento: ");
        System.out.println(this.year - this.yearBorn);
    }

    public boolean validateDNI(){
        String[] characters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int id = Integer.parseInt(this.DNI.substring(0,this.DNI.length()-1));
        int resto = id%23;
        boolean comprobacion = true;

        for (int i = 0; i < DNI.length(); i++) {
            if (Character.isDigit(DNI.charAt(i))){
                comprobacion = true;
            } else {
                comprobacion = false;
            }
        }

        if (DNI.length() == 9 && Character.isLetter(DNI.charAt(8)) && characters[resto].equals(this.DNI.substring(8,this.DNI.length()))){
            System.out.println("Esta bueno");
            return true;
        }else {
            System.out.println("Esta malo");
            return false;
        }
//        return characters[resto].equals(this.DNI.substring(8,this.DNI.length()));


    }


}

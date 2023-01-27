import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellidos;
    private int yearBorn;
    private int yearsOld;
    private String DNI;
    private String mail;

    public Persona(String nombre, String apellidos, String DNI){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
    }
    public void setYearBorn(int yearBorn){
        this.yearBorn = yearBorn;
        this.ageCalculator();
    }

    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setDNI(String DNI){
        if (validateDNI(DNI)){
            this.DNI = DNI;
        }else {
            System.out.println("El DNI no es valido");
        }
    }
    public void setMail(String mail){
        this.mail = mail;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getMail() {
        return mail;
    }

    private void ageCalculator(){
        final LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        this.yearsOld = year - this.yearBorn;
    }

    private boolean validateDNI(String DNI){
        final String[] characters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        boolean comprobacion = true;

        for (int i = 0; i < DNI.length() - 1; i++) {
            if (Character.isDigit(DNI.charAt(i)) == true){
            } else {
                comprobacion = false;
            }
        }
        int id = Integer.parseInt(DNI.substring(0,DNI.length()-1));
        int resto = id%23;
        if (DNI.length() == 9 && Character.isLetter(DNI.charAt(8)) && characters[resto].equals(DNI.substring(8,DNI.length()))){
            return true;
        }else {
            return false;
        }
//        return characters[resto].equals(this.DNI.substring(8,this.DNI.length()));


    }


}

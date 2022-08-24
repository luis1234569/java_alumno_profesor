public abstract class Persona {
    private String name;
    private char sexo;
    private int edad;
    private int CHICO = 0;
    private int CHICa = 1;


    private int disponibilidad;
    private boolean asistencia;
    private final String[] NOMBRES_CHICOS = {"noel","santiago","fernando","cecilio","fernando"};
    private final String[] NOMBRES_CHICAS = {"noemy","santiaga","fernanda","cecilia","fernanda"};

    public Persona(){

        int determina_sexo= MetodosSueltos.getRandomNumber(0,1);
        if(determina_sexo==0){
            name = NOMBRES_CHICOS[MetodosSueltos.getRandomNumber(0,4)];
            sexo = 'h';
        } else if (determina_sexo==1) {
            name = NOMBRES_CHICAS[MetodosSueltos.getRandomNumber(0,4)];
            sexo = 'm';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public abstract void disponibilidad();
}


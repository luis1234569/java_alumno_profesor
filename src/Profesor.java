

public abstract class Profesor extends Persona {
    private String materia;

    public Profesor(){
        super();
        super.setEdad(MetodosSueltos.getRandomNumber(30,50));

        materia = ConstMateria.Materias[MetodosSueltos.getRandomNumber(0,1)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}

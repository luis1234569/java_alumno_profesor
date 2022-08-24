package ejercicio;

public class Profesor extends Persona{
    private String materia;

    public Profesor(){
        super();
        super.setEdad(Metodos.getRandomNumber(30,50));

        materia = Asignatura.MATERIAS[Metodos.getRandomNumber(0,2)];
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void disponibilidad(){
        int probability = Metodos.getRandomNumber(20,100);

        if (probability<20){
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }
}

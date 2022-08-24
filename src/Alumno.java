public class Alumno extends Persona {

    private int nota;

    public Alumno(){
        super();
        nota = MetodosSueltos.getRandomNumber(0,10);
        super.setEdad(MetodosSueltos.getRandomNumber(10,18));

    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    @Override
    public void disponibilidad(){
        int probability = MetodosSueltos.getRandomNumber(0,100);
        
        if (probability<=20){
            super.setAsistencia(false);
        } else if (probability>20) {
            super.setAsistencia(true);
        }

    }
}

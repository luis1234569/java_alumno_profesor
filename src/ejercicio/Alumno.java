package ejercicio;

public class Alumno extends Persona {
    private int nota;

    public Alumno(){
        super();
        nota = Metodos.getRandomNumber(0,10);
        super.setEdad(Metodos.getRandomNumber(10,18));

    }


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    @Override
    public void disponibilidad(){
        int probability = Metodos.getRandomNumber(0,100);

        if (probability<20){
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }
    }

    public String toString(){
        return "nombre: "+super.getName()+"\n  edad: "+super.getEdad()+"\n  sexo:  "+super.getSexo()+"\n  nota: "+nota;
    }

}

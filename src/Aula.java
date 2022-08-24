public class Aula {

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;


    private final int capacity = 20;

    private void createStudent(){
        for (int i = 0 ; i< alumnos.length ; i++){
            alumnos[i] = new Alumno();
        }
    }
    private boolean asistenciaAlumnos(){
        int countAsis = 0 ;
        for (i = 0; i<)


        return false ;
    }

    public boolean inClass(){
        if(!profesor.isAsistencia()){
            System.out.println("el profesor no esta");
            return false;
        } else if (!profesor.getMateria().equals(materia)) {
            System.out.println("el profesor no esta en la materia correcta");
            return false;
        }
        System.out.println("si se puede dar clase");
        return true;
    }

}

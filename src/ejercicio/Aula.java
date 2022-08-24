package ejercicio;

public class Aula {

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;


    private final int capacity = 20;

    Aula(){
        id=1;
        profesor= new Profesor();
        alumnos= new Alumno[capacity];
        createStudent();
        materia = Asignatura.MATERIAS[Metodos.getRandomNumber(0,2)];
    }

    private void createStudent(){

        for (int i = 0 ; i< alumnos.length ; i++){
            alumnos[i] = new Alumno();
        }
    }
    private boolean asistenciaAlumnos(){
        int countAsis = 0 ;
        for (int i = 0; i<alumnos.length; i++){
            if(alumnos[i].isAsistencia()){
                countAsis++;
            }
        }
        return countAsis>=((int) capacity/2);


    }

    public boolean inClass(){
        if(!profesor.isAsistencia()){
            System.out.println("el profesor no esta");
            return false;
        } else if (!profesor.getMateria().equals(materia)) {
            System.out.println("el profesor no esta en la materia correcta");
            return false;
        } else if (!asistenciaAlumnos()){
            System.out.println("los alumnos no estan completos");
            return false;
        }
        System.out.println("si se puede dar clase");
        return true;


    }

    public void notas(){
        int chicosPass=0;
        int chicasPass=0;

        for (int i = 0; i<alumnos.length; i++){
            if(alumnos[i].getNota()>=3){
                if (alumnos[i].getSexo()=='h'){
                    chicosPass++;
                }else {
                    chicasPass++;
                }
                System.out.println(alumnos[i].toString());
            }

        }

        System.out.println("hay "+chicosPass+" chicos"+" y hay "+chicasPass+" chicas aprobados");

    }

}


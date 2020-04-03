package org.mypackage.hello;

public class NameHandler {

    private String name;
    private int fNacimiento;
    private int fIngreso;
    private int fSemestre;
    private int edad;
    private int semestre;
    
    
    
    public NameHandler() { 
    name = null;
    fNacimiento= 0;
    fIngreso= 0;
    fSemestre=0;
    edad= 0;
    semestre= 0;
    }
    
     public int calcEdad() {
     edad=2020-getfNacimiento();
       return edad;
    }
     
      public int  calcSemestre(){

        if (fSemestre==1 ){
           semestre= ((2020-getfIngreso())*2)+1;   
               }
        if(fSemestre==2){
           semestre=(2020-getfIngreso())*2;       
        }
        return semestre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    public int getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(int fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    public int getfSemestre() {
        return fSemestre;
    }

    public void setfSemestre(int fSemestre) {
        this.fSemestre = fSemestre;
    }
    
    public int getEdad() {
        edad=calcEdad();
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSemestre() {
        semestre=calcSemestre();
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

   

  

}

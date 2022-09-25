package server;

import java.util.Random;

public class Methods {

    public boolean savePerson(String name, String firstname,String secondname,String curp,int age){
        DaoCal daoPerson = new DaoCal();


        return daoPerson.savePerson(name, firstname, secondname, curp, age);
    }
    public boolean rfc(String name, String firstname,String secondname,int age,String alatorio){
firstname= firstname.substring(1,2);
secondname = secondname.substring(1,1);
        name= name.substring(1,1);
        Random rnd = new Random();
          alatorio = rnd.toString();
        DaoCal daoPerson = new DaoCal();


        return daoPerson.saveRfc(name, firstname, secondname, age,alatorio);
    }
    public boolean findAll(String name, String firstname,String secondname,String curp,int age){
        DaoCal daoPerson = new DaoCal();


        return daoPerson.savePerson(name, firstname, secondname, curp, age);
    }
    public boolean rfc(String name, String firstname,String secondname,String curp,int age){
        DaoCal daoPerson = new DaoCal();

        boolean result= daoPerson.savePerson(name,firstname,secondname,curp,age);
        return result;
    }


    public boolean deletePerson(int id){
        DaoCal daoPerson = new DaoCal();

        boolean result= daoPerson.deletePerson(id);
        return result;
    }



}

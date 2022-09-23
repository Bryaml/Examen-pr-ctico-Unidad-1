package server;

public class Methods {

    public boolean savePerson(String name, String firstname,String secondname,String curp,int age){
        DaoCal daoPerson = new DaoCal();


        return daoPerson.savePerson(name, firstname, secondname, curp, age);
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

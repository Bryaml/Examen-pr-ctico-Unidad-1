package Client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import server.BeanRfc;
import server.DaoCal;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner input = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        int opc;
        do {
            System.out.println("1 Registar dtos de la persona ");
            System.out.println("2 Modificar los datos de la personas");
            System.out.println("3 Consultar a las personas");
            System.out.println("4 Eliminar a la persona");

            opc = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("ingresa nombre: ");
                    String name = input.next();
                    System.out.println("appelido paterno ");
                    String apellido1 = input.next();
                    System.out.println("apellido materno ");
                    String apellido2 = input.next();
                    System.out.println("ingresa curp");
                    String curp = input.next();
                    System.out.println("ingresa edad");
                    int age = input.nextInt();


                    Object[] data = {name,apellido1,apellido2,curp,age};


                    boolean response = (boolean) client.execute("Methods.savePerson", data);
                    System.out.println(response);
                    break;
                case 2:
                    DaoCal daorFC = new DaoCal();
                    List<BeanRfc> listrf = daorFC.findAll();
                    boolean response2 = (boolean) client.execute("Methods.findAll", listrf );
                    System.out.println(response2);

                    break;
                case 3:


                case 4:
                    DaoCal daorF = new DaoCal();
                    List<BeanRfc> list = daorF.findAll();
                    boolean response3 = (boolean) client.execute("Methods.findAl", list );
                    System.out.println(response3);
                    break;
                case 5:
                    System.out.println("ingresa un id para eliminar ");
                    int id = input.nextInt();


                    Object[] data2 = {id};


                    String response4 = (String) client.execute("Methods.deletePerson", data2);
                    break;
                default:

                    break;
            }


        }while(opc != 5);

    }
}

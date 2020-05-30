
package exmaen_vanguardia;

import State.*;
import Adapter.*;
import Builder.*;
import Observer.*;
import Factory.*;
import Singletone.*;


public class Exmaen_Vanguardia {

    
    public static void main(String[] args) {
        System.out.println("----Patrones de diseño----");
        System.out.println("--Singletone--");
        System.out.println("");
        Singletone();
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--Factory--");
        System.out.println("");
        Factory();
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--Observer--");
        System.out.println("");
        Observer();
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--Builder--");
        System.out.println("");
        Builder();
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--Adapter--");
        System.out.println("");
        Adapter();
        System.out.println("------------------------");
        System.out.println("");
        System.out.println("--State--");
        System.out.println("");
        State();
        System.out.println("------------------------");
        System.out.println("");
        
        
    }
    
    
    public static void Singletone(){
        
        Archivo c = Archivo.getInstance();
        c.abrirArchivo();
        
        Archivo c1 = Archivo.getInstance();
        c1.modificarArchivo("Nuevo contenido");
        
        c.getContenido();
        c.cerrarArchivo();
        
    }
    
    public static void Factory(){
        
        Cocina_Factory cocina = new Cocina_Factory();
        Comida_Factory comida = cocina.cocinar(TipoComida_Factory.Combo1);
        System.out.println(comida.getTipo());
        Comida_Factory comida1 = cocina.cocinar(TipoComida_Factory.Combo2);
        System.out.println(comida1.getTipo());

        
    }
    
    public static void Observer(){
        
        Programa_Observer programa = new Programa_Observer(); 
        UsuarioDePrograma_Observer usuario = new UsuarioDePrograma_Observer("Martin");
        UsuarioDePrograma_Observer usuario1 = new UsuarioDePrograma_Observer("Jorge");
        UsuarioDePrograma_Observer usuario2 = new UsuarioDePrograma_Observer("Eduardo");
        programa.registerObserver(usuario);
        programa.registerObserver(usuario1);
        programa.registerObserver(usuario2);
        programa.addMejora("Mejora de Rendimiento");
        programa.notifyAllObservers();
        programa.addMejora("\nEliminacion de Componentes");
        programa.notifyAllObservers();
        
        
        
        
        
        
    }
    
    public static void Builder(){
        
        Builder_Builder phoneBuilder = new PhoneBuilder_Builder();
        Tester_Builder tester = new Tester_Builder();
        tester.makePhone(phoneBuilder);

        Phone_Builder phone = phoneBuilder.getPhone();
        System.out.println(phone.toString());

        
        
    }
    
    public static void Adapter(){
        
        RefrigeradoraModerna_Adapter refrimoderna = new RefrigeradoraModerna_Adapter();
        refrimoderna.triturarhielo();
        System.out.println("");
        
        RefrigeradoraAntigua_Adapter refriantigua = new RefrigeradoraAntigua_Adapter();
        RefrigeradoraAdaptador_Adapter adaptador = new RefrigeradoraAdaptador_Adapter(refriantigua);     
        adaptador.triturarhielo();
    }
    
    public static void State(){
        
        Coc_State clan= new Coc_State();
        
        clan.setRango(new Lider_State());
        clan.RangoAction();
        System.out.println("");
        clan.setRango(new Colider_State());
        clan.RangoAction();
        System.out.println("");
        clan.setRango(new Miembro_State());
        clan.RangoAction();
        
    }
    
}//Fin Class

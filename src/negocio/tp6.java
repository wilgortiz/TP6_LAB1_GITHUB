import javax.swing.JOptionPane;

public class tp6 {

    public static void main(String[] args) {
        
        Directorio d=new Directorio();
       
        boolean resultado=d.agregarCliente("4242",new Cliente(123,"martin",
                "lucero","la punta","mod 11 mz 33") );
       if(resultado){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
       boolean resultado2=d.agregarCliente("4242",new Cliente(333,"pepe",
               "lucero","la punta","mod 11 mz 33") );
       if(resultado2){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
        
        
    }
    
}

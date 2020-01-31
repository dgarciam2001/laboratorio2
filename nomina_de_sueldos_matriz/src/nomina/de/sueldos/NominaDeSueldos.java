/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina.de.sueldos;

/**
 *
 * @author Daniel Garcia
 */
import javax.swing.JOptionPane;

public class NominaDeSueldos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       String[] nemp = new String[1000];
       String[] puesto = new String[1000];
       String[] bonifi = new String[1000];
       String[] comi = new String[1000];
       String[] otros = new String[1000];
       String[] anti= new String[1000];
       String[] descj= new String[1000];
       String[] otros2=new String[1000];
       double[] sueldobase = new double[1000];
       double[] sueldoextra = new double[1000];
       double[] horasextra = new double[1000];
       double[] bonif=new double[1000];
       double[] tdeven=new double[1000];
       double[] otro=new double[1000];
       double[] igss=new double[1000];
       double[] isr=new double[1000];
       double[] anticipos=new double[1000];
       double[] descuentosj=new double[1000];
       double[] otro2=new double[1000];
       double[] totaldesc=new double[1000];
       double[] totalliquido=new double[1000];
       double totals=0,totalsx=0,totalb=0,totald=0,totalo=0,totaligss=0,totalisr=0,totalant=0,totaldescj=0,totalo2=0,totaltd=0,totaltl=0,totalc=0;
       
       int [] comic=new int[1000];
       
       
       double bonificaciones = 150.50;
       int comisiones = 200;
       
       int numemp;
       numemp=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE EMPLEADOS DE LA PLANILLA"));
      
      
       for(int i=0;i<numemp;i++){
       int cont=i+1;
           nemp[i]=JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL EMPLEADO #"+cont);
        
    }
       
       
       for(int i=0;i<numemp;i++){
           int cont=i+1;
        puesto[i]=JOptionPane.showInputDialog("INGRESE EL PUESTO DEL EMPLEADO #"+cont);
    }
       
        for(int i=0;i<numemp;i++){
            int cont=i+1;
        sueldobase[i]=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL SUELDO BASE DEL EMPLEADO #"+cont));
    }
        
        for(int i=0;i<numemp;i++){
            int cont=i+1;
        horasextra[i]=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LAS HORA TRABAJADAS DEL EMPLEADO #"+cont));
        sueldoextra[i]=horasextra[i]*1.5;
    }
       
       
       for(int i=0;i<numemp;i++){
           int cont=i+1;
        bonifi[i]=JOptionPane.showInputDialog("CUENTA CON BONIFICACION (SI/NO) EL EMPLEADO #"+cont);
           if ("SI".equals(bonifi[i])) {
              bonif[i]=150.50; 
           }
           else if("NO".equals(bonifi[i])){
               
              bonif[i]=0;
           }
    }
       
       for(int i=0;i<numemp;i++){
           int cont=i+1;
        comi[i]=JOptionPane.showInputDialog("CUENTA CON COMISIONES (SI/NO) EL EMPLEADO #"+cont);
           if ("SI".equals(comi[i])) {
              comic[i]=200; 
           }
           else if("NO".equals(comi[i])){
               
              comic[i]=0;
           }
    }
       
       
       
       for(int i=0;i<numemp;i++){
           int cont=i+1;
           for (int j = 0; j < 1; j++) {
           cont=i+1;
        otros[i]=JOptionPane.showInputDialog("CUENTA OTROS INGRESOS (SI/NO) EL EMPLEADO #"+cont);
           
              if ("SI".equals(otros[i])) {
              
               otro[i]=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE INGRESOS EXTRA DEL EMPLEADO #"+cont));
           }
           else if("NO".equals(otros[i])){
               
              otro[i]=0;
           }
           }
   
        
    }
       
       
        for (int i = 0; i < numemp; i++) {
            tdeven[i]=sueldobase[i]+sueldoextra[i]+bonif[i]+comic[i]+otro[i];
        }
    
        for (int i = 0; i < numemp; i++) {
            igss[i]=sueldobase[i]*0.0483;
        }
        
        for (int i = 0; i < numemp; i++) {
            if (sueldobase[i]>5000) {
                isr[i]=sueldobase[i]*0.03;
                
            }
            else{
                        isr[i]=0;
                        }
        }
        
        
        
        for(int i=0;i<numemp;i++){
           int cont=i+1;
           for (int j = 0; j < 1; j++) {
           cont=i+1;
        anti[i]=JOptionPane.showInputDialog("SOLICITO ANTICIPO EL EMPLEADO #"+cont);
           
              if ("SI".equals(anti[i])) {
              
               anticipos[i]=Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE ANTICIPO QUE SOLICITO EL EMPLEADO #"+cont));
           }
           else if("NO".equals(anti[i])){
               
              anticipos[i]=0;
           }
           }
   
        
    }
        
        
         for(int i=0;i<numemp;i++){
           int cont=i+1;
           for (int j = 0; j < 1; j++) {
           cont=i+1;
        descj[i]=JOptionPane.showInputDialog("TIENE DESCUENTOS JUDICIALES EL EMPLEADO #"+cont);
           
              if ("SI".equals(descj[i])) {
              
               descuentosj[i]=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL MONTO DE DESCUENTOS JUDIACIALES QUE TIENE EL EMPLEADO #"+cont));
           }
           else if("NO".equals(descj[i])){
               
              descuentosj[i]=0;
           }
           }
   
        
    }
         
         
         
         
           for(int i=0;i<numemp;i++){
           int cont=i+1;
           for (int j = 0; j < 1; j++) {
           cont=i+1;
        otros2[i]=JOptionPane.showInputDialog("TIENE OTROS DESCUENTOS EL EMPLEADO #"+cont);
           
              if ("SI".equals(otros2[i])) {
              
               otro2[i]=Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL MONTO DE LOS OTROS DESCUENTOS QUE TIENE EL EMPLEADO #"+cont));
           }
           else if("NO".equals(otros2[i])){
               
              otro2[i]=0;
           }
           }
   
        
    }
           
           
           
           for (int i = 0; i < numemp; i++) {
            totaldesc[i]=isr[i]+igss[i]+descuentosj[i]+anticipos[i]+otro2[i];
        }
        
           for (int i = 0; i < numemp; i++) {
            totalliquido[i]= tdeven[i]-totaldesc[i];
        }
           
           
           
           
           
           
           
                for (int i = 0; i < numemp; i++) {
               int cont=i;
            totals+=sueldobase[cont];
        }
           
             for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalsx+=sueldoextra[cont];
        }
             
               for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalb+=bonif[cont];
        }
           
                 for (int i = 0; i < numemp; i++) {
               int cont=i;
            totald+=tdeven[cont];
        }
                 
                   for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalo+=otro[cont];
        }
                   
                for (int i = 0; i < numemp; i++) {
               int cont=i;
            totaligss+=igss[cont];
        }
                
                
                  for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalisr+=isr[cont];
        }
               
                  for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalant+=anticipos[cont];
        }     
                  
                    for (int i = 0; i < numemp; i++) {
               int cont=i;
            totaldescj+=descuentosj[cont];
        }
           
                 for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalo2+=otro2[cont];
        }     
                 
                   for (int i = 0; i < numemp; i++) {
               int cont=i;
            totaltd+=totaldesc[cont];
        }
                   
                     for (int i = 0; i < numemp; i++) {
               int cont=i;
            totaltl+=totalliquido[cont];
        }
                     
                       for (int i = 0; i < numemp; i++) {
               int cont=i;
            totalc+=comic[cont];
        }
           
           
           
           System.out.println("Nombre Empleado    ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(nemp[i]);
        }
         
           
           
           
           System.out.println("Puesto     ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(puesto[i]);
        }
         
           
           
           
           System.out.println("Sueldo Ordinario   ");
           for (int i = 0; i < 10; i++) {
                System.out.println(sueldobase[i]);
        }
           System.out.println(totals);
         
           
           
           
           System.out.println("Sueldo Extraordinario   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(sueldoextra[i]);
        }
          System.out.println(totalsx);
           
           
           
           System.out.println("Bonificaciones   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(bonif[i]);
        }
          System.out.println(totalb);
           
           
           
           System.out.println("Comisiones   ");         
           for (int i = 0; i < numemp; i++) {
               System.out.println(comic[i]);
        }
            System.out.println(totalc);
           
           
           
           System.out.println("Otros   ");
           for (int i = 0; i < numemp; i++) {
           System.out.println(otro[i]); 
        }
           System.out.println(totalo);
           
           
           
           System.out.println("Total Devengado       ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(tdeven[i]);
        }
      System.out.println(totald);
           
           
           
           System.out.println("IGSS   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(igss[i]);
        }
           System.out.println(totaligss);
           
           
           
           System.out.println("ISR   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(isr[i]);
        }
           System.out.println(totalisr);
           
           
           
           System.out.println("Anticipos   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(anticipos[i]);
        }
           System.out.println(totalant);
           
           
           
           System.out.println("Descuentos Judiciales   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(descuentosj[i]);
        }
           System.out.println(totaldescj);
           
           
           
           System.out.println("Otros   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(otro2[i]);
        }
            System.out.println(totalo2);
           
           
           
           System.out.println("Total Descuentos   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(totaldesc[i]);
        }
            System.out.println(totaltd);
           
           
           System.out.println("Total Liquido   ");
           for (int i = 0; i < numemp; i++) {
               System.out.println(totalliquido[i]);
        }
           System.out.println(totaltl);
    
    
    
    }
    
    
    
   
    
}
    
        
    



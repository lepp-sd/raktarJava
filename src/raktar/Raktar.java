
package raktar;


public class Raktar {

 
    public static void main(String[] args) {
       Robot[] robotok = new Robot[2];
       robotok[0]=new Robot("R2D2", RobotTipus.HEGESZTO, 85);
       robotok[1]=new Robot("R2D2", RobotTipus.TAKARITO, 37);
       
       
       if (robotok[0].equals(robotok[1])) {
           System.out.println("Ez a két robot ugyanaz");
       }
       else {
           System.out.println("Két különböző robot");
       }
       
       Robot[] botok = new Robot[3];
       botok[0]=new Robot("Y2K", RobotTipus.HEGESZTO, 45);
       botok[1]=new Robot("CNW", RobotTipus.TAKARITO, 33);
       botok[2]=new Robot("TPP", RobotTipus.PAKOLO, 11);
       
       for (int i=0; i<botok.length; i++) {
           botok[i].setAkkuSzint(100);
           
       }
       
        for (int i = 0; i < botok.length; i++) {
            System.out.println(botok[i]);
        }
       char[][] terkep = new char[4][4];
       
        for (int sor = 0; sor < terkep.length; sor++) {
            for (int oszlop = 0; oszlop < terkep.length; oszlop++) {
                terkep[sor][oszlop]='_';
                
            }
            
        }
        terkep[1][0]='R';
        terkep[3][2]='W';
        terkep[2][1]='C';
        
        for (int sor = 0; sor < terkep.length; sor++) {
            for (int oszlop = 0; oszlop < terkep.length; oszlop++) {
                System.out.print(terkep[sor][oszlop]);
                
            }
            System.out.println();
            
        }
    }
    
}

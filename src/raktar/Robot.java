
package raktar;

import java.util.Objects;


public class Robot {
    private String azonosito;
    private RobotTipus tipus;
    private int akkuSzint;
    int akku;
    
    public Robot (String azonosito, RobotTipus tipus, int akkuSzint) {
        this.azonosito = azonosito;
        this.tipus = tipus;
        this.akkuSzint = akkuSzint;
    }
    
    public String getAzonosito (){
        return azonosito;
    }
    
    public RobotTipus getTipus(){
        return tipus;
    }
    
    public int getAkkuSzint(){
        return akkuSzint;
    }
    
    public void setAkkuSzint(int akkuSzint){
        if (akkuSzint>=0 && akkuSzint<=100) {
            this.akkuSzint = akkuSzint;
        }
        else {
            System.out.println("Nem megfelelő érték!");
        }
    }

    @Override
    public String toString() {
        return "Robot{" + "azonosito=" + azonosito + ", tipus=" + tipus + ", akkuSzint=" + akkuSzint + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.azonosito);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        return Objects.equals(this.azonosito, other.azonosito);
    }


    
    
    
    
}

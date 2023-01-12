/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplominimo_javafx_tema2;

/**
 *
 * @author guilh
 */
public class Hamburgueria {
       private String carne;
       private String queijo;
       private String pao;
       
    public String montarLanche(){
        return "Carne: "+this.carne+"\nQueijo: "+this.queijo+"\nPão: "+this.pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setQueijo(String quiejo) {
        this.queijo = quiejo;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }
        
        

}

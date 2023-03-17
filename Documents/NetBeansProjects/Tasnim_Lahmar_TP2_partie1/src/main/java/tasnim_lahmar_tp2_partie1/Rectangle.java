/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasnim_lahmar_tp2_partie1;

/**
 *
 * @author maison info
 */
public class Rectangle {
    public point p;
    public double largeur;
    public double longueur;
    
    
    public Rectangle(point p1,point p2){
        
        this.p=p1;
        this.largeur=p2.x-p1.x;
        this.longueur=p2.y-p1.y;
           
    }
      
   public Rectangle(point p1,double longueur,double largeur){
         this.p=p1;
        this.largeur=largeur;
        this.longueur=longueur;
       
       
    }
      public Rectangle(int x1,int y1,int x2,int y2){
      p.x=x1;
      p.y=y1;
      this.largeur=x2-x1;
      this.longueur=y2-y1;   
    }
      
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasnim_lahmar_tp2_partie1;

/**
 *
 * @author maison info
 */
public class RectangleMethod {
    public void calculateArea(double largeur,double longueur){
        double S=longueur*largeur;
    System.out.println("la surface du rectangle ="+S);
}
    public void move(point p,int a,int b){
      p.x=p.x+a;
      p.y=p.y+b;
    }
    public boolean contains(point p1,point p,double longueur,double largeur){
     return ((p.x-p1.x)<longueur && (p.y-p1.y)<largeur);
        
    }
       public boolean contains(Rectangle r){
           point p1=new point(r.p.x,r.p.y);
           point p2=new  
    }
}

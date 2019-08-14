/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular;

/**
 *
 * @author Cristopher Duarte Pimienta
 */

   public class Calcular {
    public  Calcular(){
        
    }
    public String producto(double x1,double x2,double y1,double y2){
        double resultado;
        String resultado2="";
        double Xt=Math.pow((x2-x1),2);
        double Yt=Math.pow((y2-y1),2);
        resultado=Math.sqrt(Xt+Yt);
        resultado2="El resultado entre los dos puntos es "+Double.toString(resultado);
        return resultado2;
    }
}

    


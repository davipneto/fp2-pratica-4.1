/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author davip_000
 */
public class Circulo extends Elipse {
    
    public Circulo(double raio){
        super(2*raio,2*raio);
    }
    
    @Override
    public double getPerimetro(){
        return (Math.PI*getEixo1());
    }
}

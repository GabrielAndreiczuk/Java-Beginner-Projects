/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,soma=0,totalValores = 0,totalPares = 0,totalImpares = 0,acimaCem = 0;
        float media = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));          
            if(n != 0){
                totalValores++;
                if(n%2 == 0){
                totalPares++;
                }else{
                    totalImpares++;
                }
                if(n>100){
                    acimaCem++;
                }
                soma+=n;
                }            
        }
        while(n != 0);
        media = soma/totalValores;
        JOptionPane.showMessageDialog(null,
                "<html>Resultado<br><hr><br>Total de Valores: "+totalValores
                +"<br>Total Pares: "+totalPares
                +"<br>Total Impares: "+totalImpares
                +"<br>Acima de 100: "+acimaCem
                +"<br>Média dos Valores: "+media);       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximocomdiv;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dayan
 */
public class pan3 extends javax.swing.JPanel {

ArrayList<String> residuos;
ArrayList<Integer> listaA = new ArrayList<>();
ArrayList<Integer> listaB = new ArrayList<>();
ArrayList<Integer> listaC = new ArrayList<>();
ArrayList<Integer> todosNum = new ArrayList<>();
String auxS = "";
String convi="";
int resi, result;

    public pan3() {
 this.residuos = new ArrayList<>();
        initComponents();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        numero3 = new javax.swing.JTextField();
        numero4 = new javax.swing.JTextField();
        boton = new java.awt.Button();
        procedimiento = new java.awt.TextArea();
        resultado = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(224, 238, 247));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Minimo comun divisor de 4 numeros");

        numero1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero1.setForeground(new java.awt.Color(33, 71, 83));
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero1KeyTyped(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero2.setForeground(new java.awt.Color(33, 71, 83));
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero2KeyTyped(evt);
            }
        });

        numero3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero3.setForeground(new java.awt.Color(33, 71, 83));
        numero3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero3KeyTyped(evt);
            }
        });

        numero4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        numero4.setForeground(new java.awt.Color(33, 71, 83));
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        numero4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero4KeyTyped(evt);
            }
        });

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setFont(new java.awt.Font("DialogInput", 1, 19)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 255, 255));
        boton.setLabel("Calcular");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        procedimiento.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        resultado.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero1KeyTyped

    private void numero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero2KeyTyped
         char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero2KeyTyped

    private void numero3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero3KeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero3KeyTyped

    private void numero4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero4KeyTyped
        char c = evt.getKeyChar();       
        if (c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_numero4KeyTyped

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
 
todosNum.clear(); residuos.clear();
listaA.clear(); listaB.clear(); listaC.clear();

auxS = "";
resi=0;
result=0;
procedimiento.setEditable(false);
 String num1,num2,num3,num4;
 num1 = numero1.getText();        
 num2 = numero2.getText(); 
 num3 = numero3.getText(); 
 num4 = numero4.getText();
 
 
if("0".equals(num1) || "0".equals(num2)|| "0".equals(num3) || "0".equals(num4)){
         System.out.println("no se puede");
         resultado.setText( "no se puede");
         procedimiento.setText("no se puede");
            } 
         
else{

procedimiento.append("\nDivisiones sucesivas ");

 todosNum.add(Integer.parseInt(num1));
 todosNum.add(Integer.parseInt(num2));
 todosNum.add(Integer.parseInt(num3));
  todosNum.add(Integer.parseInt(num4));
mayores(todosNum);

residuosM();
procedimiento.append("\n");    
iteraciones();
resultado.setText( "\nMCD:  "+result);

repaint();
}
        
    }//GEN-LAST:event_botonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField numero3;
    private javax.swing.JTextField numero4;
    private java.awt.TextArea procedimiento;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables

    public int divisor(int A, int B) {

if (A == 0){
return B;}

if (B == 0){
return A;}

resi = (A % B);
procedimiento.append("\n"+A+" = " + B + " x " + (A / B) + " + " + resi);

if (resi != 0) {
residuos.add(resi + " =  " + A + " - " + (A / B) + " x " + B );
listaA.add(A);
listaB.add(-1 * (A / B));
listaC.add(B);
}

if (resi == 0) {
result = B;
procedimiento.append("\n");
}

return divisor(B, resi);
}

public void residuosM() {
if (!residuos.isEmpty())
{
procedimiento.append("\nDespeje de los residuos de las ecuaciones");
}
for (int i = residuos.size() - 1; i >= 0; i--) {
procedimiento.append("\n"+residuos.get(i));
}
	}

public void iteraciones() {
		
		
if (residuos.isEmpty())
{
procedimiento.append("\nNo hay valores a reemplazar");
}
else
{
procedimiento.append("\nReemplazamos los valores hasta llegar a la combinacion lineal");
procedimiento.append("\n"+residuos.get(residuos.size() - 1));

int a, b, c, auxA = listaA.get(listaA.size() - 1), auxB = listaB.get(listaB.size() - 1), aux = 1;
String signo = "";
for (int i = residuos.size() - 2; i >= 0; i--) {
a = listaA.get(i);
b = listaB.get(i);
c = listaC.get(i);
procedimiento.append("\n"+result + " = " + aux + " x " + auxA + " + (" + auxB + ")(" + a + b + " x " + c+ ")" + auxS );
signo = " - ";
if (auxA == c) {
int ay1 = auxB * b;
int ay2 = aux + ay1;
procedimiento.append("\n"+result + " = " + auxB + " x " + a + " + (" + ay2 + ") x " + c + auxS );

if(i==0)
{
procedimiento.append("\n");        
procedimiento.append("\nLa combinación lineal es:");
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay2 + ") x " + c + auxS );

}
aux = auxB;
auxA = a;
auxB = ay2;
					
} else {
int ay1 = auxB * b;
auxS = auxS + "+ (" + aux + ") x " + auxA;
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay1 + ") x " + c + auxS);

if(i==0)
{
procedimiento.append("\nLa combinación resultante es:");
procedimiento.append("\n"+ result + " = " + auxB + " x " + a + " + (" + ay1 + ") x " + c + auxS);
}
aux = auxB;
auxA = a;
auxB = ay1;					
}
  }
    }
		
}
public void mayores(ArrayList<Integer> numeros) {
	
int aux=numeros.get(1);
for(int i=0; i<numeros.size();i++)
{
    if(i==1)
    {
        i=2;
    }
    aux=divisor(numeros.get(i), aux);
    
}	}
}

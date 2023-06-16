 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho3;

/**
 *
 * @author muriloamado
 */
public class Trabalho3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FIFOBuffer buffer = new FIFOBuffer(10);

        // Enqueue strings to create a line of text
        buffer.fila("teste");
        buffer.fila("do");
        buffer.fila("programa");
        buffer.fila("!");

        // Dequeue strings to retrieve and display the line of text
        while (!buffer.vazio()) {
            String frase = buffer.imprimirFila();
            System.out.print(frase + " ");
        }
    }
}

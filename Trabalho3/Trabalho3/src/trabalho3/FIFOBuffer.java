/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho3;

/**
 *
 * @author muriloamado
 */

public class FIFOBuffer {
    private String[] buffer;
    private int tamanho;
    private int inicio;
    private int fim;

    public FIFOBuffer(int capacidade) {
        buffer = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public void fila(String texto) {
        if (tamanho == buffer.length) {
            throw new IllegalStateException("Buffer está cheio.");
        }
        fim = (fim + 1) % buffer.length;
        buffer[fim] = texto;
        tamanho++;
    }

    public String imprimirFila() {
        if (tamanho == 0) {
            throw new IllegalStateException("Buffer está vazio.");
        }
        String remove = buffer[inicio];
        inicio = (inicio + 1) % buffer.length;
        tamanho--;
        return remove;
    }

    public boolean vazio() {
        return tamanho == 0;
    }
}


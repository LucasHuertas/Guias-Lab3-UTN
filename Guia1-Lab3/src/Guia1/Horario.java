package Guia1;

import java.util.Formatter;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario(){}
    public Horario(int hora, int minuto, int segundo){
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minuto = (minuto >= 0 && minuto < 60) ? minuto : 0;
        this.segundo = (segundo >= 0 && segundo < 60) ? segundo : 0;
    }

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    private void sumarHora(){
        if (this.hora == 23)
            this.hora = 0;
        else
            this.hora++;
    }

    private void sumarMinuto(){
        if (this.minuto == 59){
            this.minuto = 0;
            sumarHora();
        } else
            this.minuto++;
    }

    public Horario sumarSegundo(){
        if (this.segundo == 59){
            this.segundo = 0;
            sumarMinuto();
        } else
            this.segundo++;
        return this;
    }

    private void restarHora(){
        if (this.hora == 0)
            this.hora = 23;
        else
            this.hora--;
    }

    private void restarMinuto(){
        if (this.minuto == 0){
            this.minuto = 59;
            restarHora();
        } else
            this.minuto--;
    }

    public Horario restarSegundo(){
        if (this.segundo == 0){
            this.segundo = 59;
            restarMinuto();
        } else
            this.segundo--;
        return this;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}

package examen1_tylercruz_progra2;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HiloMensaje extends Thread {

    private JProgressBar bar;
    private boolean vive;
    private boolean avanzar;
    JTable table;
    String emisor;
    String receptor;
    String mesg;
    private int size;

    public HiloMensaje() {
    }

    public HiloMensaje(JProgressBar bar, JTable table, String emisor, String receptor, String mesg, int size) {
        vive = true;
        avanzar = true;
        this.bar = bar;
        this.table = table;
        this.emisor = emisor;
        this.receptor = receptor;
        this.mesg = mesg;
        this.size = size;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (vive) {
            if (avanzar) {
                bar.setMaximum(size);
                System.out.println(size);
                bar.setValue(bar.getValue() + 1);
                if (bar.getValue() == size) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bar.setValue(0);
                    Object[] newrow = {
                        emisor,
                        receptor,
                        mesg
                    };
                    DefaultTableModel modelo
                            = (DefaultTableModel) table.getModel();
                    modelo.addRow(newrow);
                    table.setModel(modelo);
                    JOptionPane.showMessageDialog(null ,"Mensaje enviado exitosamente!");
                    vive = false;
                }
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

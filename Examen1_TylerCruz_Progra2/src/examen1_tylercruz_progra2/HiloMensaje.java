package examen1_tylercruz_progra2;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HiloMensaje extends Thread {

    private JProgressBar bar;
    private boolean vive;
    private boolean avanzar;
    private JTable table;
    private String emisor;
    private String receptor;
    private String mesg;

    public HiloMensaje() {
    }

    public HiloMensaje(JProgressBar bar, JTable table, String emisor, String receptor, String mesg) {
        this.bar = bar;
        this.vive = true;
        this.avanzar = avanzar;
        this.table = table;
        this.emisor = emisor;
        this.receptor = receptor;
        this.mesg = mesg;
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                bar.setValue(bar.getValue() + 1);
                if (bar.getValue() == 100000000) {
                    vive = false;
                    Object[] newrow = {
                        emisor,
                        receptor,
                        mesg,};
                    DefaultTableModel modelo
                            = (DefaultTableModel) this.table.getModel();
                    modelo.addRow(newrow);
                    table.setModel(modelo);
                }
            }
        }
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


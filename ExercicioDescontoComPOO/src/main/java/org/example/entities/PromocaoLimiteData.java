package org.example.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PromocaoLimiteData extends Promocao{

    protected Date dataLimite;

    public PromocaoLimiteData() {
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Override
    public boolean estaAtiva() {
        try {
            dataLimite = new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2025");
        } catch (ParseException e) {
            Logger.getLogger(PromocaoLimiteData.class.getName()).log(Level.SEVERE, null, e);
        }
        Date hoje = new Date();
        if (dataLimite.after(hoje)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getValorDesconto() {
        if (estaAtiva()) {
            valorDesconto = 0.1;
        }
        return valorDesconto;
    }
}

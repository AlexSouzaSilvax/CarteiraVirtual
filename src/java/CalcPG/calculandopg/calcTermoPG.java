/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcPG.calculandopg;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author alex
 */
@ManagedBean
public class calcTermoPG {

    private double r1;
    private double r2;
    private double r3;
    private double q;
    private double n;
    private double aN;

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public double getR3() {
        return r3;
    }

    public void setR3(double r3) {
        this.r3 = r3;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getaN() {
        return aN;
    }

    public void setaN(double aN) {
        this.aN = aN;
    }

    public void calcular() {
        FacesContext context = FacesContext.getCurrentInstance();

        if (r1 == 0 && r2 == 0 && r3 == 0 && n == 0) {

            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Favor insira dados validos!", ""));

        } else if (r1 != 0 && r2 != 0 && n != 0) {

            setQ((r2 / r1));

            setR3(r2 * q);

            getR1();

            getN();

            double nn = (n - 1);

            double qq = Math.pow(q, nn);

            aN = r1 * qq;

            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", ""));

        } else {

            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Favor insira dados validos!", ""));
        }

    }

    public void atualizar() {

        setR1(0);
        setR2(0);
        setR3(0);
        setN(0);

    }

}

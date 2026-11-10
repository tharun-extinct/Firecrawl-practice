package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q11 implements nu0, vy4 {
    public final /* synthetic */ r11 j;

    public /* synthetic */ q11(r11 r11Var) {
        this.j = r11Var;
    }

    @Override // defpackage.vy4
    public nj6 a(Object obj) {
        e11 e11VarG;
        r11 r11Var = this.j;
        e11 e11Var = (e11) obj;
        r11Var.t.execute(new va(r11Var, e11Var, (byte) 2));
        r11Var.w = e11Var;
        ea5 ea5Var = r11Var.x;
        if (e11Var != null) {
            e11VarG = e11Var;
        } else {
            ea5Var.getClass();
            e11VarG = e11.g(e11Var.g);
        }
        ea5Var.v = e11VarG.y + ((long) (e11VarG.r * 0.5d)) + 300000;
        if (ea5Var.v > e11VarG.r()) {
            ea5Var.v = e11VarG.r() - 60000;
        }
        if (ea5Var.g()) {
            a41 a41Var = ea5Var.g;
            long j = ea5Var.v;
            ea5Var.y.getClass();
            a41Var.y(j - System.currentTimeMillis());
        }
        Iterator it = r11Var.n.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            uo1.B();
            return null;
        }
        f11.g(e11Var);
        ArrayList arrayList = r11Var.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            ((vo1) obj2).getClass();
        }
        return br2.s(e11Var);
    }

    @Override // defpackage.nu0
    public Object o(nj6 nj6Var) {
        r11 r11Var = this.j;
        e11 e11Var = r11Var.w;
        if (e11Var != null) {
            long jR = e11Var.r();
            r11Var.m.getClass();
            if (jR - System.currentTimeMillis() > 300000) {
                return br2.s(f11.g(r11Var.w));
            }
        }
        if (r11Var.q == null) {
            return br2.s(new f11("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new yo1("No AppCheckProvider installed.")));
        }
        nj6 nj6Var2 = r11Var.c;
        if (nj6Var2 == null || nj6Var2.j() || r11Var.c.n) {
            r11Var.c = r11Var.q.g(false).a(r11Var.l, new q11(r11Var));
        }
        return r11Var.c.v(r11Var.j, new up(r11Var, (byte) 6));
    }
}

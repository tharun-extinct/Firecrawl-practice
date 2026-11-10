package defpackage;

import android.util.Log;
import io.appground.blek.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh3 implements xy1 {
    public final /* synthetic */ boolean j;

    public /* synthetic */ sh3(boolean z) {
        this.j = z;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        eh1 eh1Var;
        eh1 eh1Var2;
        o22 o22VarN;
        o22 o22VarN2;
        ah1 ah1Var = (ah1) obj;
        o22 o22Var = m22.g;
        if (this.j && !(ah1Var instanceof gh1) && ah1Var.y().r(new pc3((byte) 20))) {
            ah1Var.r((o22) ah1Var.y().g(cn0.E, o22Var));
        }
        if ((ah1Var instanceof gh1) || !ah1Var.y().r(new pc3((byte) 21))) {
            return ah1Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o22 o22VarY = ah1Var.y();
        o22 o22Var2 = null;
        fp3 fp3Var = o22VarY.r(in0.m) ? (fp3) o22VarY.g(cn0.F, new fp3(null, o22Var)) : new fp3(null, o22VarY);
        ow owVar = (ow) fp3Var.j;
        o22 o22Var3 = (o22) fp3Var.t;
        if (owVar == null) {
            eh1Var = null;
        } else if (owVar instanceof nw) {
            eh1Var = new eh1();
            eh1Var.g = xq2.q(o22Var);
            nw nwVar = (nw) owVar;
            eh1Var.y = nwVar.g;
            eh1Var.v = (byte) 2;
            mj0 mj0Var = nwVar.y;
            eh1Var.r = mj0Var != null ? mj0Var.g : null;
            eh1Var.n = null;
        } else {
            if (!(owVar instanceof mw)) {
                uo1.g();
                return null;
            }
            arrayList2.add(owVar);
            eh1Var = null;
        }
        int i = 0;
        int i2 = 1;
        if (((Number) o22Var3.g(new on0((byte) 24), 0)).intValue() > 1) {
            Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
        }
        fp3 fp3Var2 = o22Var3.r(in0.q) ? (fp3) o22Var3.g(pm0.z, new fp3(null, o22Var)) : new fp3(null, o22Var3);
        e4 e4Var = (e4) fp3Var2.j;
        o22 o22Var4 = (o22) fp3Var2.t;
        arrayList.add(e4Var);
        if (e4Var != null) {
            int i3 = e4Var.y;
            he heVar = i3 != 0 ? new he(i3) : new he(R.drawable.glance_ripple);
            eh1Var2 = new eh1();
            eh1Var2.g = xq2.q(o22Var);
            eh1Var2.y = heVar;
        } else {
            eh1Var2 = null;
        }
        cn1 cn1Var = o22Var4.r(new pc3((byte) 22)) ? (cn1) o22Var4.g(new on0((byte) 25), new cn1(o22Var2, 3)) : new cn1(o22Var4, i2);
        o22 o22Var5 = cn1Var.g;
        o22 o22Var6 = cn1Var.y;
        arrayList.add(o22Var5);
        arrayList2.add(xq2.q(o22Var6));
        bh1 bh1Var = new bh1();
        int size = arrayList.size();
        o22 o22Var7 = o22Var;
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            o22 o22Var8 = (o22) obj2;
            if (o22Var8 != null && (o22VarN2 = o22Var7.n(o22Var8)) != null) {
                o22Var7 = o22VarN2;
            }
        }
        bh1Var.r = o22Var7;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            o22 o22Var9 = (o22) obj3;
            if (o22Var9 != null && (o22VarN = o22Var.n(o22Var9)) != null) {
                o22Var = o22VarN;
            }
        }
        ah1Var.r(o22Var);
        ArrayList arrayList3 = bh1Var.y;
        if (eh1Var != null) {
            arrayList3.add(eh1Var);
        }
        arrayList3.add(ah1Var);
        if (eh1Var2 != null) {
            arrayList3.add(eh1Var2);
        }
        return bh1Var;
    }
}

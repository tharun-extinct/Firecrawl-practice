package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lo4 {
    public final ko g;
    public final String n;
    public final Context r;
    public final o05 v;
    public final Set x;
    public final kg0 y;

    public lo4(Context context, String str, Set set, ko koVar, kg0 kg0Var) {
        set.getClass();
        pw3 pw3Var = new pw3(context, str, (byte) 1);
        this.g = koVar;
        this.y = kg0Var;
        this.r = context;
        this.n = str;
        this.v = new o05(pw3Var);
        this.x = set == no4.g ? null : cj0.I0(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Object obj, ou0 ou0Var) throws Throwable {
        ko4 ko4Var;
        if (ou0Var instanceof ko4) {
            ko4Var = (ko4) ou0Var;
            int i = ko4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko4Var.c = i - Integer.MIN_VALUE;
            } else {
                ko4Var = new ko4(this, ou0Var);
            }
        } else {
            ko4Var = new ko4(this, ou0Var);
        }
        Object objL = ko4Var.q;
        int i2 = ko4Var.c;
        boolean z = true;
        if (i2 == 0) {
            js2.o(objL);
            ko4Var.m = this;
            ko4Var.c = 1;
            objL = this.g.l(obj, ko4Var);
            px0 px0Var = px0.j;
            if (objL == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ko4Var.m;
            js2.o(objL);
        }
        if (!((Boolean) objL).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.x;
        o05 o05Var = this.v;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) o05Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) o05Var.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

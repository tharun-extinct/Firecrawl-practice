package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class yz extends zz4 implements xy1 {
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte q;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz(Object obj, mu0 mu0Var, byte b) {
        super(1, mu0Var);
        this.q = b;
        this.c = obj;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        mu0 mu0Var = (mu0) obj;
        switch (b) {
            case 0:
                return new yz((zz) obj2, mu0Var, (byte) 0).u(og5Var);
            case 1:
                return new yz((lo4) obj2, mu0Var, (byte) 1).u(og5Var);
            case 2:
                return new yz((l01) obj2, mu0Var, (byte) 2).u(og5Var);
            default:
                return new yz((ab5) obj2, mu0Var, (byte) 3).u(og5Var);
        }
    }

    @Override // defpackage.ix
    public final Object u(Object obj) throws IOException {
        byte b = this.q;
        og5 og5Var = og5.g;
        Object obj2 = this.c;
        px0 px0Var = px0.j;
        switch (b) {
            case 0:
                boolean z = this.w;
                if (z) {
                    if (z) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                zz zzVar = (zz) obj2;
                this.w = true;
                ib0 ib0Var = new ib0(1, pw5.o(this));
                ib0Var.o();
                zzVar.y.setValue(Boolean.TRUE);
                zzVar.n = ib0Var;
                return ib0Var.z() == px0Var ? px0Var : og5Var;
            case 1:
                boolean z2 = this.w;
                if (!z2) {
                    js2.o(obj);
                    lo4 lo4Var = (lo4) obj2;
                    this.w = true;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) lo4Var.v.getValue()).edit();
                    Set set = lo4Var.x;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (editorEdit.commit()) {
                        if (((SharedPreferences) lo4Var.v.getValue()).getAll().isEmpty()) {
                            jo4.g(lo4Var.r, lo4Var.n);
                        }
                        if (set != null) {
                            set.clear();
                        }
                        return og5Var == px0Var ? px0Var : og5Var;
                    }
                    uo1.t("Unable to delete migrated keys from SharedPreferences.");
                } else {
                    if (z2) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                boolean z3 = this.w;
                if (!z3) {
                    js2.o(obj);
                    this.w = true;
                    Object objA = ((l01) obj2).a(this);
                    return objA == px0Var ? px0Var : objA;
                }
                if (z3) {
                    js2.o(obj);
                    return obj;
                }
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.w;
                if (z4) {
                    if (z4) {
                        js2.o(obj);
                        return og5Var;
                    }
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(obj);
                ab5 ab5Var = (ab5) obj2;
                this.w = true;
                ib0 ib0Var2 = new ib0(1, pw5.o(this));
                ib0Var2.o();
                ab5Var.y.r.setValue(Boolean.TRUE);
                ab5Var.r = ib0Var2;
                return ib0Var2.z() == px0Var ? px0Var : og5Var;
        }
    }
}

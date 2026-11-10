package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mq0 {
    public final boolean g = true;
    public boolean n;
    public String[] r;
    public String[] y;

    public final nq0 g() {
        return new nq0(this.g, this.n, this.y, this.r);
    }

    public final void r(x95... x95VarArr) {
        boolean z = this.g;
        if (!z) {
            l0.u("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(x95VarArr.length);
        for (x95 x95Var : x95VarArr) {
            arrayList.add(x95Var.j);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            l0.u("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.r = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            l0.u("At least one TLS version is required");
        }
    }

    public final void y(jf0... jf0VarArr) {
        boolean z = this.g;
        if (!z) {
            l0.u("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(jf0VarArr.length);
        for (jf0 jf0Var : jf0VarArr) {
            arrayList.add(jf0Var.g);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!z) {
            l0.u("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.y = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            l0.u("At least one cipher suite is required");
        }
    }
}

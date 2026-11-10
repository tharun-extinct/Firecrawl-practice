package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bj2 implements my1 {
    public final /* synthetic */ ob3 a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ String t;

    public /* synthetic */ bj2(String str, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = str;
        this.a = ob3Var;
    }

    @Override // defpackage.my1
    public final Object g() {
        Set setI0;
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.a;
        String str = this.t;
        switch (b) {
            case 0:
                if (yf2.p((String) ob3Var.getValue(), str)) {
                    str = "";
                }
                ob3Var.setValue(str);
                break;
            default:
                if (((Set) ob3Var.getValue()).contains(str)) {
                    setI0 = cj0.I0((Set) ob3Var.getValue());
                    setI0.remove(str);
                } else {
                    setI0 = cj0.I0((Set) ob3Var.getValue());
                    setI0.add(str);
                }
                ob3Var.setValue(setI0);
                break;
        }
        return og5Var;
    }
}

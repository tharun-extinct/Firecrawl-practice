package defpackage;

import android.database.SQLException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hq0 implements my1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ boolean t;

    public /* synthetic */ hq0(jq0 jq0Var, boolean z) {
        this.j = (byte) 0;
        this.a = jq0Var;
        this.t = z;
    }

    @Override // defpackage.my1
    public final Object g() {
        mb3 mb3VarT;
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj = this.a;
        boolean z = this.t;
        switch (b) {
            case 0:
                jq0 jq0Var = (jq0) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                jq0Var.t.n(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                jq0Var.j.n(sb);
                try {
                    zq2.B(sb.toString(), 5);
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return og5Var;
                }
            case 1:
                my1 my1Var = (my1) obj;
                if (z) {
                    my1Var.g();
                }
                return og5Var;
            case 2:
                uc ucVar = (uc) obj;
                if (z && (mb3VarT = ucVar.t()) != null) {
                    ((co4) mb3VarT).p(og5Var);
                }
                return og5Var;
            default:
                rt1 rt1Var = (rt1) obj;
                if (z) {
                    rt1.g(rt1Var);
                }
                return og5Var;
        }
    }

    public /* synthetic */ hq0(byte b, Object obj, boolean z) {
        this.j = b;
        this.t = z;
        this.a = obj;
    }
}

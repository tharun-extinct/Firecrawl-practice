package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class u51 implements q51 {
    public int l;
    public final eo5 n;
    public int x;
    public eo5 g = null;
    public boolean y = false;
    public boolean r = false;
    public int v = 1;
    public int j = 1;
    public y91 t = null;
    public boolean a = false;
    public final ArrayList m = new ArrayList();
    public final ArrayList q = new ArrayList();

    public u51(eo5 eo5Var) {
        this.n = eo5Var;
    }

    @Override // defpackage.q51
    public final void g(q51 q51Var) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((u51) obj).a) {
                return;
            }
        }
        this.r = true;
        eo5 eo5Var = this.g;
        if (eo5Var != null) {
            eo5Var.g(this);
        }
        if (this.y) {
            this.n.g(this);
            return;
        }
        int size2 = arrayList.size();
        u51 u51Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            u51 u51Var2 = (u51) obj2;
            if (!(u51Var2 instanceof y91)) {
                i++;
                u51Var = u51Var2;
            }
        }
        if (u51Var != null && i == 1 && u51Var.a) {
            y91 y91Var = this.t;
            if (y91Var != null) {
                if (!y91Var.a) {
                    return;
                } else {
                    this.x = this.j * y91Var.l;
                }
            }
            n(u51Var.l + this.x);
        }
        eo5 eo5Var2 = this.g;
        if (eo5Var2 != null) {
            eo5Var2.g(this);
        }
    }

    public void n(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.l = i;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            q51 q51Var = (q51) obj;
            q51Var.g(q51Var);
        }
    }

    public final void r() {
        this.q.clear();
        this.m.clear();
        this.a = false;
        this.l = 0;
        this.r = false;
        this.y = false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.y.h0);
        sb.append(":");
        switch (this.v) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.a ? Integer.valueOf(this.l) : "unresolved");
        sb.append(") <t=");
        sb.append(this.q.size());
        sb.append(":d=");
        sb.append(this.m.size());
        sb.append(">");
        return sb.toString();
    }

    public final void y(eo5 eo5Var) {
        this.m.add(eo5Var);
        if (this.a) {
            eo5Var.g(eo5Var);
        }
    }
}

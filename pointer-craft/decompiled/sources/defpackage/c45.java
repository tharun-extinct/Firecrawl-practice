package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c45 extends u35 {
    public final xy1 n;
    public final int r;
    public final String y;

    public c45(Object obj, String str, int i, xy1 xy1Var) {
        super(obj);
        this.y = str;
        this.r = i;
        this.n = xy1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.g);
        sb.append(", label=\"");
        sb.append(this.y);
        sb.append("\", leadingIcon=");
        return xi3.m(sb, this.r, ")");
    }
}

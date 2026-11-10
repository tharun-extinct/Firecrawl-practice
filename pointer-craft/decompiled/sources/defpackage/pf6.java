package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pf6 {
    public static ha2 g;

    public static final int g(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final n74 y(j75 j75Var, int i) {
        i75 i75Var = j75Var.g;
        h93 h93Var = j75Var.y;
        if (i75Var.g.t.length() != 0) {
            int iN = h93Var.n(i);
            if ((i != 0 && iN == h93Var.n(i - 1)) || (i != i75Var.g.t.length() && iN == h93Var.n(i + 1))) {
                return j75Var.g(i);
            }
        }
        return j75Var.j(i);
    }
}

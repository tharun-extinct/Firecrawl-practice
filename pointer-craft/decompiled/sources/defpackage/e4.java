package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e4 implements n22 {
    public final j3 g;
    public final int y;

    public e4(j3 j3Var, int i) {
        this.g = j3Var;
        this.y = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionModifier(action=");
        sb.append(this.g);
        sb.append(", rippleOverride=");
        return fj.x(sb, this.y, ')');
    }
}

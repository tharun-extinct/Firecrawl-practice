package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mj4 {
    public final String g;
    public final boolean r;
    public final bz1 y;

    public /* synthetic */ mj4(String str) {
        this(str, new od4((byte) 18));
    }

    public final String toString() {
        return xi3.t("AccessibilityKey: ", this.g);
    }

    public mj4(String str, bz1 bz1Var) {
        this.g = str;
        this.y = bz1Var;
    }

    public mj4(String str, int i) {
        this(str);
        this.r = true;
    }

    public mj4(String str, boolean z, bz1 bz1Var) {
        this(str, bz1Var);
        this.r = z;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ro2 implements bf2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN_DIMENSION_TYPE"),
    t("EXACT"),
    a("WRAP"),
    m("FILL"),
    q("EXPAND"),
    w("UNRECOGNIZED");

    public final int j;

    ro2(String str) {
        this.j = i;
    }

    public final int g() {
        if (this != w) {
            return this.j;
        }
        l0.u("Can't get the number of an unknown enum value.");
        return 0;
    }
}

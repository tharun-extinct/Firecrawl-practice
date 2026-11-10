package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum mc6 {
    t("BROADCAST_ACTION_UNSPECIFIED"),
    a("PURCHASES_UPDATED_ACTION"),
    m("LOCAL_PURCHASES_UPDATED_ACTION"),
    q("ALTERNATIVE_BILLING_ACTION");

    public final byte j;

    /* JADX WARN: Multi-variable type inference failed */
    mc6(String str) {
        this.j = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}

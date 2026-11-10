package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s00 {
    public static final s00 a;
    public static final s00 j;
    public static final s00 m;
    public static final /* synthetic */ s00[] q;
    public static final s00 t;

    static {
        s00 s00Var = new s00("SKU_STATE_UNPURCHASED", 0);
        j = s00Var;
        s00 s00Var2 = new s00("SKU_STATE_PENDING", 1);
        t = s00Var2;
        s00 s00Var3 = new s00("SKU_STATE_PURCHASED", 2);
        a = s00Var3;
        s00 s00Var4 = new s00("SKU_STATE_PURCHASED_AND_ACKNOWLEDGED", 3);
        m = s00Var4;
        q = new s00[]{s00Var, s00Var2, s00Var3, s00Var4};
    }

    public static s00 valueOf(String str) {
        return (s00) Enum.valueOf(s00.class, str);
    }

    public static s00[] values() {
        return (s00[]) q.clone();
    }
}

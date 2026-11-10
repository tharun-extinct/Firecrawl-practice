package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kh0 {
    public static final /* synthetic */ kh0[] a;
    public static final kh0 j;
    public static final kh0 t;

    static {
        kh0 kh0Var = new kh0("UnlockDeveloperOptions", 0);
        j = kh0Var;
        kh0 kh0Var2 = new kh0("TurnOnProfile", 1);
        t = kh0Var2;
        a = new kh0[]{kh0Var, kh0Var2};
    }

    public static kh0 valueOf(String str) {
        return (kh0) Enum.valueOf(kh0.class, str);
    }

    public static kh0[] values() {
        return (kh0[]) a.clone();
    }
}

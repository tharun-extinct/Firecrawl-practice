package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c24 {
    public static final c24 j;
    public static final /* synthetic */ c24[] t;

    static {
        c24 c24Var = new c24("DEFAULT", 0);
        j = c24Var;
        c24 c24Var2 = new c24("UNMETERED_ONLY", 1);
        c24 c24Var3 = new c24("UNMETERED_OR_DAILY", 2);
        c24 c24Var4 = new c24("FAST_IF_RADIO_AWAKE", 3);
        c24 c24Var5 = new c24("NEVER", 4);
        c24 c24Var6 = new c24("UNRECOGNIZED", 5);
        t = new c24[]{c24Var, c24Var2, c24Var3, c24Var4, c24Var5, c24Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, c24Var);
        sparseArray.put(1, c24Var2);
        sparseArray.put(2, c24Var3);
        sparseArray.put(3, c24Var4);
        sparseArray.put(4, c24Var5);
        sparseArray.put(-1, c24Var6);
    }

    public static c24 valueOf(String str) {
        return (c24) Enum.valueOf(c24.class, str);
    }

    public static c24[] values() {
        return (c24[]) t.clone();
    }
}

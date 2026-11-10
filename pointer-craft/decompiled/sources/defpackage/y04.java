package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class y04 {
    public static final y04 j;
    public static final /* synthetic */ y04[] t;

    static {
        y04 y04Var = new y04("DEFAULT", 0);
        j = y04Var;
        t = new y04[]{y04Var, new y04("SIGNED", 1), new y04("FIXED", 2)};
    }

    public static y04 valueOf(String str) {
        return (y04) Enum.valueOf(y04.class, str);
    }

    public static y04[] values() {
        return (y04[]) t.clone();
    }
}

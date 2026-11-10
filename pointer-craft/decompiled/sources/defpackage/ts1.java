package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ts1 {
    public static final ts1 j;
    public static final /* synthetic */ ts1[] t;

    /* JADX INFO: Fake field, exist only in values array */
    ts1 EF0;

    static {
        ts1 ts1Var = new ts1("Visible", 0);
        ts1 ts1Var2 = new ts1("Clip", 1);
        j = ts1Var2;
        t = new ts1[]{ts1Var, ts1Var2, new ts1("ExpandIndicator", 2), new ts1("ExpandOrCollapseIndicator", 3)};
    }

    public static ts1 valueOf(String str) {
        return (ts1) Enum.valueOf(ts1.class, str);
    }

    public static ts1[] values() {
        return (ts1[]) t.clone();
    }
}

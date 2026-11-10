package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uw {
    public static final /* synthetic */ uw[] a;
    public static final uw j;
    public static final uw t;

    static {
        uw uwVar = new uw("CONNECT", 0);
        j = uwVar;
        uw uwVar2 = new uw("SHOW_NOTIFICATIONS", 1);
        t = uwVar2;
        a = new uw[]{uwVar, uwVar2};
    }

    public static uw valueOf(String str) {
        return (uw) Enum.valueOf(uw.class, str);
    }

    public static uw[] values() {
        return (uw[]) a.clone();
    }
}

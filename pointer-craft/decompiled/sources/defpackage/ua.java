package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ua {
    public static final /* synthetic */ ua[] a;
    public static final ua j;
    public static final ua t;

    static {
        ua uaVar = new ua("SHOW_ORIGINAL", 0);
        j = uaVar;
        ua uaVar2 = new ua("SHOW_TRANSLATED", 1);
        t = uaVar2;
        a = new ua[]{uaVar, uaVar2};
    }

    public static ua valueOf(String str) {
        return (ua) Enum.valueOf(ua.class, str);
    }

    public static ua[] values() {
        return (ua[]) a.clone();
    }
}

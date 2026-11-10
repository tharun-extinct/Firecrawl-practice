package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gi {
    public static final /* synthetic */ gi[] a;
    public static final gi j;
    public static final gi t;

    static {
        gi giVar = new gi("BoundReached", 0);
        j = giVar;
        gi giVar2 = new gi("Finished", 1);
        t = giVar2;
        a = new gi[]{giVar, giVar2};
    }

    public static gi valueOf(String str) {
        return (gi) Enum.valueOf(gi.class, str);
    }

    public static gi[] values() {
        return (gi[]) a.clone();
    }
}

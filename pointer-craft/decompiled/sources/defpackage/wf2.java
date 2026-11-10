package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class wf2 {
    public static final /* synthetic */ wf2[] a;
    public static final wf2 j;
    public static final wf2 t;

    static {
        wf2 wf2Var = new wf2("Width", 0);
        j = wf2Var;
        wf2 wf2Var2 = new wf2("Height", 1);
        t = wf2Var2;
        a = new wf2[]{wf2Var, wf2Var2};
    }

    public static wf2 valueOf(String str) {
        return (wf2) Enum.valueOf(wf2.class, str);
    }

    public static wf2[] values() {
        return (wf2[]) a.clone();
    }
}

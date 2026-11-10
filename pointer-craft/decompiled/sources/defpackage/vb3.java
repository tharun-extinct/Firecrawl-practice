package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vb3 {
    public static final vb3 j;
    public static final /* synthetic */ vb3[] t;

    static {
        vb3 vb3Var = new vb3("Default", 0);
        j = vb3Var;
        t = new vb3[]{vb3Var, new vb3("UserInput", 1), new vb3("PreventUserInput", 2)};
    }

    public static vb3 valueOf(String str) {
        return (vb3) Enum.valueOf(vb3.class, str);
    }

    public static vb3[] values() {
        return (vb3[]) t.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w65 {
    public static final w65 a;
    public static final w65 j;
    public static final w65 m;
    public static final /* synthetic */ w65[] q;
    public static final w65 t;

    static {
        w65 w65Var = new w65("StartInput", 0);
        j = w65Var;
        w65 w65Var2 = new w65("StopInput", 1);
        t = w65Var2;
        w65 w65Var3 = new w65("ShowKeyboard", 2);
        a = w65Var3;
        w65 w65Var4 = new w65("HideKeyboard", 3);
        m = w65Var4;
        q = new w65[]{w65Var, w65Var2, w65Var3, w65Var4};
    }

    public static w65 valueOf(String str) {
        return (w65) Enum.valueOf(w65.class, str);
    }

    public static w65[] values() {
        return (w65[]) q.clone();
    }
}

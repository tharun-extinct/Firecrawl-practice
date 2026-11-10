package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fi4 {
    public static final fi4 j;
    public static final /* synthetic */ fi4[] t;

    static {
        fi4 fi4Var = new fi4("EditableText", 0);
        j = fi4Var;
        t = new fi4[]{fi4Var, new fi4("StaticText", 1)};
    }

    public static fi4 valueOf(String str) {
        return (fi4) Enum.valueOf(fi4.class, str);
    }

    public static fi4[] values() {
        return (fi4[]) t.clone();
    }
}

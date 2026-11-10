package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m72 {
    public static final m72 a;
    public static final /* synthetic */ m72[] c;
    public static final m72 j;
    public static final m72 m;
    public static final m72 q;
    public static final m72 t;
    public static final m72 w;

    static {
        m72 m72Var = new m72("Bonding", 0);
        j = m72Var;
        m72 m72Var2 = new m72("NeedsPairing", 1);
        t = m72Var2;
        m72 m72Var3 = new m72("AlreadyConnected", 2);
        a = m72Var3;
        m72 m72Var4 = new m72("Connecting", 3);
        m = m72Var4;
        m72 m72Var5 = new m72("Refused", 4);
        q = m72Var5;
        m72 m72Var6 = new m72("MissingPermission", 5);
        w = m72Var6;
        c = new m72[]{m72Var, m72Var2, m72Var3, m72Var4, m72Var5, m72Var6};
    }

    public static m72 valueOf(String str) {
        return (m72) Enum.valueOf(m72.class, str);
    }

    public static m72[] values() {
        return (m72[]) c.clone();
    }
}

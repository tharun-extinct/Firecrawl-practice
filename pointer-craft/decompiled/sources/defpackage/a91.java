package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a91 {
    public static final a91 a;
    public static final /* synthetic */ jk1 c;
    public static final a91 j;
    public static final a91 m;
    public static final a91 q;
    public static final a91 t;
    public static final /* synthetic */ a91[] w;

    static {
        a91 a91Var = new a91("PlayStore", 0);
        j = a91Var;
        a91 a91Var2 = new a91("Connection", 1);
        t = a91Var2;
        a91 a91Var3 = new a91("Products", 2);
        a = a91Var3;
        a91 a91Var4 = new a91("Purchases", 3);
        m = a91Var4;
        a91 a91Var5 = new a91("Entitlement", 4);
        q = a91Var5;
        a91[] a91VarArr = {a91Var, a91Var2, a91Var3, a91Var4, a91Var5};
        w = a91VarArr;
        c = new jk1(a91VarArr);
    }

    public static a91 valueOf(String str) {
        return (a91) Enum.valueOf(a91.class, str);
    }

    public static a91[] values() {
        return (a91[]) w.clone();
    }
}

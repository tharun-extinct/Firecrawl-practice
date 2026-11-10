package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ok4 {
    public static final ok4 a;
    public static final /* synthetic */ ok4[] b;
    public static final ok4 c;
    public static final ok4 i;
    public static final ok4 j;
    public static final ok4 m;
    public static final ok4 q;
    public static final ok4 t;
    public static final ok4 w;

    /* JADX INFO: Fake field, exist only in values array */
    ok4 EF0;

    static {
        ok4 ok4Var = new ok4("ERROR_TYPE_MISSING_MAS", 0);
        ok4 ok4Var2 = new ok4("ERROR_BLUETOOTH_NOT_ACTIVE", 1);
        j = ok4Var2;
        ok4 ok4Var3 = new ok4("ERROR_BLUETOOTH_SERVER", 2);
        t = ok4Var3;
        ok4 ok4Var4 = new ok4("ERROR_DEVICE_NOT_SUPPORTED", 3);
        a = ok4Var4;
        ok4 ok4Var5 = new ok4("ERROR_BLUETOOTH_DEVICE_NOT_AVAILABLE", 4);
        m = ok4Var5;
        ok4 ok4Var6 = new ok4("ERROR_BLUETOOTH_DISABLED", 5);
        q = ok4Var6;
        ok4 ok4Var7 = new ok4("ERROR_MISSING_PERMISSION", 6);
        w = ok4Var7;
        ok4 ok4Var8 = new ok4("ERROR_HID_PROFILE", 7);
        ok4 ok4Var9 = new ok4("ERROR_HID_REGISTER", 8);
        c = ok4Var9;
        ok4 ok4Var10 = new ok4("ERROR_HID_ALREADY_REGISTERED", 9);
        i = ok4Var10;
        b = new ok4[]{ok4Var, ok4Var2, ok4Var3, ok4Var4, ok4Var5, ok4Var6, ok4Var7, ok4Var8, ok4Var9, ok4Var10};
    }

    public static ok4 valueOf(String str) {
        return (ok4) Enum.valueOf(ok4.class, str);
    }

    public static ok4[] values() {
        return (ok4[]) b.clone();
    }
}

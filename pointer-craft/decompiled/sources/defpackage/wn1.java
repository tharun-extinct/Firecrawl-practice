package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class wn1 {
    public static final wn1 a;
    public static final wn1[] m;
    public static final /* synthetic */ wn1[] q;
    public static final wn1 t;
    public final byte j;

    /* JADX INFO: Fake field, exist only in values array */
    wn1 EF0;

    static {
        bh2 bh2Var = bh2.DOUBLE;
        wn1 wn1Var = new wn1("DOUBLE", 0, 0, 1, bh2Var);
        bh2 bh2Var2 = bh2.FLOAT;
        wn1 wn1Var2 = new wn1("FLOAT", 1, 1, 1, bh2Var2);
        bh2 bh2Var3 = bh2.LONG;
        wn1 wn1Var3 = new wn1("INT64", 2, 2, 1, bh2Var3);
        wn1 wn1Var4 = new wn1("UINT64", 3, 3, 1, bh2Var3);
        bh2 bh2Var4 = bh2.INT;
        wn1 wn1Var5 = new wn1("INT32", 4, 4, 1, bh2Var4);
        wn1 wn1Var6 = new wn1("FIXED64", 5, 5, 1, bh2Var3);
        wn1 wn1Var7 = new wn1("FIXED32", 6, 6, 1, bh2Var4);
        bh2 bh2Var5 = bh2.BOOLEAN;
        wn1 wn1Var8 = new wn1("BOOL", 7, 7, 1, bh2Var5);
        bh2 bh2Var6 = bh2.STRING;
        wn1 wn1Var9 = new wn1("STRING", 8, 8, 1, bh2Var6);
        bh2 bh2Var7 = bh2.MESSAGE;
        wn1 wn1Var10 = new wn1("MESSAGE", 9, 9, 1, bh2Var7);
        bh2 bh2Var8 = bh2.BYTE_STRING;
        wn1 wn1Var11 = new wn1("BYTES", 10, 10, 1, bh2Var8);
        wn1 wn1Var12 = new wn1("UINT32", 11, 11, 1, bh2Var4);
        bh2 bh2Var9 = bh2.ENUM;
        wn1 wn1Var13 = new wn1("ENUM", 12, 12, 1, bh2Var9);
        wn1 wn1Var14 = new wn1("SFIXED32", 13, 13, 1, bh2Var4);
        wn1 wn1Var15 = new wn1("SFIXED64", 14, 14, 1, bh2Var3);
        wn1 wn1Var16 = new wn1("SINT32", 15, 15, 1, bh2Var4);
        wn1 wn1Var17 = new wn1("SINT64", 16, 16, 1, bh2Var3);
        wn1 wn1Var18 = new wn1("GROUP", 17, 17, 1, bh2Var7);
        wn1 wn1Var19 = new wn1("DOUBLE_LIST", 18, 18, 2, bh2Var);
        wn1 wn1Var20 = new wn1("FLOAT_LIST", 19, 19, 2, bh2Var2);
        wn1 wn1Var21 = new wn1("INT64_LIST", 20, 20, 2, bh2Var3);
        wn1 wn1Var22 = new wn1("UINT64_LIST", 21, 21, 2, bh2Var3);
        wn1 wn1Var23 = new wn1("INT32_LIST", 22, 22, 2, bh2Var4);
        wn1 wn1Var24 = new wn1("FIXED64_LIST", 23, 23, 2, bh2Var3);
        wn1 wn1Var25 = new wn1("FIXED32_LIST", 24, 24, 2, bh2Var4);
        wn1 wn1Var26 = new wn1("BOOL_LIST", 25, 25, 2, bh2Var5);
        wn1 wn1Var27 = new wn1("STRING_LIST", 26, 26, 2, bh2Var6);
        wn1 wn1Var28 = new wn1("MESSAGE_LIST", 27, 27, 2, bh2Var7);
        wn1 wn1Var29 = new wn1("BYTES_LIST", 28, 28, 2, bh2Var8);
        wn1 wn1Var30 = new wn1("UINT32_LIST", 29, 29, 2, bh2Var4);
        wn1 wn1Var31 = new wn1("ENUM_LIST", 30, 30, 2, bh2Var9);
        wn1 wn1Var32 = new wn1("SFIXED32_LIST", 31, 31, 2, bh2Var4);
        wn1 wn1Var33 = new wn1("SFIXED64_LIST", 32, 32, 2, bh2Var3);
        wn1 wn1Var34 = new wn1("SINT32_LIST", 33, 33, 2, bh2Var4);
        wn1 wn1Var35 = new wn1("SINT64_LIST", 34, 34, 2, bh2Var3);
        wn1 wn1Var36 = new wn1("DOUBLE_LIST_PACKED", 35, 35, 3, bh2Var);
        t = wn1Var36;
        wn1 wn1Var37 = new wn1("FLOAT_LIST_PACKED", 36, 36, 3, bh2Var2);
        wn1 wn1Var38 = new wn1("INT64_LIST_PACKED", 37, 37, 3, bh2Var3);
        wn1 wn1Var39 = new wn1("UINT64_LIST_PACKED", 38, 38, 3, bh2Var3);
        wn1 wn1Var40 = new wn1("INT32_LIST_PACKED", 39, 39, 3, bh2Var4);
        wn1 wn1Var41 = new wn1("FIXED64_LIST_PACKED", 40, 40, 3, bh2Var3);
        wn1 wn1Var42 = new wn1("FIXED32_LIST_PACKED", 41, 41, 3, bh2Var4);
        wn1 wn1Var43 = new wn1("BOOL_LIST_PACKED", 42, 42, 3, bh2Var5);
        wn1 wn1Var44 = new wn1("UINT32_LIST_PACKED", 43, 43, 3, bh2Var4);
        wn1 wn1Var45 = new wn1("ENUM_LIST_PACKED", 44, 44, 3, bh2Var9);
        wn1 wn1Var46 = new wn1("SFIXED32_LIST_PACKED", 45, 45, 3, bh2Var4);
        wn1 wn1Var47 = new wn1("SFIXED64_LIST_PACKED", 46, 46, 3, bh2Var3);
        wn1 wn1Var48 = new wn1("SINT32_LIST_PACKED", 47, 47, 3, bh2Var4);
        wn1 wn1Var49 = new wn1("SINT64_LIST_PACKED", 48, 48, 3, bh2Var3);
        a = wn1Var49;
        q = new wn1[]{wn1Var, wn1Var2, wn1Var3, wn1Var4, wn1Var5, wn1Var6, wn1Var7, wn1Var8, wn1Var9, wn1Var10, wn1Var11, wn1Var12, wn1Var13, wn1Var14, wn1Var15, wn1Var16, wn1Var17, wn1Var18, wn1Var19, wn1Var20, wn1Var21, wn1Var22, wn1Var23, wn1Var24, wn1Var25, wn1Var26, wn1Var27, wn1Var28, wn1Var29, wn1Var30, wn1Var31, wn1Var32, wn1Var33, wn1Var34, wn1Var35, wn1Var36, wn1Var37, wn1Var38, wn1Var39, wn1Var40, wn1Var41, wn1Var42, wn1Var43, wn1Var44, wn1Var45, wn1Var46, wn1Var47, wn1Var48, wn1Var49, new wn1("GROUP_LIST", 49, 49, 2, bh2Var7), new wn1("MAP", 50, 50, 4, bh2.VOID)};
        wn1[] wn1VarArrValues = values();
        m = new wn1[wn1VarArrValues.length];
        for (wn1 wn1Var50 : wn1VarArrValues) {
            m[wn1Var50.j] = wn1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wn1(String str, int i, int i2, int i3, bh2 bh2Var) {
        super(str, i);
        this.j = i2;
        int iD = du4.D(i3);
        if (iD == 1 || iD == 3) {
            Class cls = bh2Var.j;
        }
        if (i3 == 1) {
            bh2Var.ordinal();
        }
    }

    public static wn1 valueOf(String str) {
        return (wn1) Enum.valueOf(wn1.class, str);
    }

    public static wn1[] values() {
        return (wn1[]) q.clone();
    }

    public final int g() {
        return this.j;
    }
}

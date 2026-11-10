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
/* JADX INFO: loaded from: classes.dex */
public final class xn1 {
    public static final xn1 a;
    public static final xn1[] m;
    public static final /* synthetic */ xn1[] q;
    public static final xn1 t;
    public final byte j;

    /* JADX INFO: Fake field, exist only in values array */
    xn1 EF0;

    static {
        ch2 ch2Var = ch2.DOUBLE;
        xn1 xn1Var = new xn1("DOUBLE", 0, 0, 1, ch2Var);
        ch2 ch2Var2 = ch2.FLOAT;
        xn1 xn1Var2 = new xn1("FLOAT", 1, 1, 1, ch2Var2);
        ch2 ch2Var3 = ch2.LONG;
        xn1 xn1Var3 = new xn1("INT64", 2, 2, 1, ch2Var3);
        xn1 xn1Var4 = new xn1("UINT64", 3, 3, 1, ch2Var3);
        ch2 ch2Var4 = ch2.INT;
        xn1 xn1Var5 = new xn1("INT32", 4, 4, 1, ch2Var4);
        xn1 xn1Var6 = new xn1("FIXED64", 5, 5, 1, ch2Var3);
        xn1 xn1Var7 = new xn1("FIXED32", 6, 6, 1, ch2Var4);
        ch2 ch2Var5 = ch2.BOOLEAN;
        xn1 xn1Var8 = new xn1("BOOL", 7, 7, 1, ch2Var5);
        ch2 ch2Var6 = ch2.STRING;
        xn1 xn1Var9 = new xn1("STRING", 8, 8, 1, ch2Var6);
        ch2 ch2Var7 = ch2.MESSAGE;
        xn1 xn1Var10 = new xn1("MESSAGE", 9, 9, 1, ch2Var7);
        ch2 ch2Var8 = ch2.BYTE_STRING;
        xn1 xn1Var11 = new xn1("BYTES", 10, 10, 1, ch2Var8);
        xn1 xn1Var12 = new xn1("UINT32", 11, 11, 1, ch2Var4);
        ch2 ch2Var9 = ch2.ENUM;
        xn1 xn1Var13 = new xn1("ENUM", 12, 12, 1, ch2Var9);
        xn1 xn1Var14 = new xn1("SFIXED32", 13, 13, 1, ch2Var4);
        xn1 xn1Var15 = new xn1("SFIXED64", 14, 14, 1, ch2Var3);
        xn1 xn1Var16 = new xn1("SINT32", 15, 15, 1, ch2Var4);
        xn1 xn1Var17 = new xn1("SINT64", 16, 16, 1, ch2Var3);
        xn1 xn1Var18 = new xn1("GROUP", 17, 17, 1, ch2Var7);
        xn1 xn1Var19 = new xn1("DOUBLE_LIST", 18, 18, 2, ch2Var);
        xn1 xn1Var20 = new xn1("FLOAT_LIST", 19, 19, 2, ch2Var2);
        xn1 xn1Var21 = new xn1("INT64_LIST", 20, 20, 2, ch2Var3);
        xn1 xn1Var22 = new xn1("UINT64_LIST", 21, 21, 2, ch2Var3);
        xn1 xn1Var23 = new xn1("INT32_LIST", 22, 22, 2, ch2Var4);
        xn1 xn1Var24 = new xn1("FIXED64_LIST", 23, 23, 2, ch2Var3);
        xn1 xn1Var25 = new xn1("FIXED32_LIST", 24, 24, 2, ch2Var4);
        xn1 xn1Var26 = new xn1("BOOL_LIST", 25, 25, 2, ch2Var5);
        xn1 xn1Var27 = new xn1("STRING_LIST", 26, 26, 2, ch2Var6);
        xn1 xn1Var28 = new xn1("MESSAGE_LIST", 27, 27, 2, ch2Var7);
        xn1 xn1Var29 = new xn1("BYTES_LIST", 28, 28, 2, ch2Var8);
        xn1 xn1Var30 = new xn1("UINT32_LIST", 29, 29, 2, ch2Var4);
        xn1 xn1Var31 = new xn1("ENUM_LIST", 30, 30, 2, ch2Var9);
        xn1 xn1Var32 = new xn1("SFIXED32_LIST", 31, 31, 2, ch2Var4);
        xn1 xn1Var33 = new xn1("SFIXED64_LIST", 32, 32, 2, ch2Var3);
        xn1 xn1Var34 = new xn1("SINT32_LIST", 33, 33, 2, ch2Var4);
        xn1 xn1Var35 = new xn1("SINT64_LIST", 34, 34, 2, ch2Var3);
        xn1 xn1Var36 = new xn1("DOUBLE_LIST_PACKED", 35, 35, 3, ch2Var);
        t = xn1Var36;
        xn1 xn1Var37 = new xn1("FLOAT_LIST_PACKED", 36, 36, 3, ch2Var2);
        xn1 xn1Var38 = new xn1("INT64_LIST_PACKED", 37, 37, 3, ch2Var3);
        xn1 xn1Var39 = new xn1("UINT64_LIST_PACKED", 38, 38, 3, ch2Var3);
        xn1 xn1Var40 = new xn1("INT32_LIST_PACKED", 39, 39, 3, ch2Var4);
        xn1 xn1Var41 = new xn1("FIXED64_LIST_PACKED", 40, 40, 3, ch2Var3);
        xn1 xn1Var42 = new xn1("FIXED32_LIST_PACKED", 41, 41, 3, ch2Var4);
        xn1 xn1Var43 = new xn1("BOOL_LIST_PACKED", 42, 42, 3, ch2Var5);
        xn1 xn1Var44 = new xn1("UINT32_LIST_PACKED", 43, 43, 3, ch2Var4);
        xn1 xn1Var45 = new xn1("ENUM_LIST_PACKED", 44, 44, 3, ch2Var9);
        xn1 xn1Var46 = new xn1("SFIXED32_LIST_PACKED", 45, 45, 3, ch2Var4);
        xn1 xn1Var47 = new xn1("SFIXED64_LIST_PACKED", 46, 46, 3, ch2Var3);
        xn1 xn1Var48 = new xn1("SINT32_LIST_PACKED", 47, 47, 3, ch2Var4);
        xn1 xn1Var49 = new xn1("SINT64_LIST_PACKED", 48, 48, 3, ch2Var3);
        a = xn1Var49;
        q = new xn1[]{xn1Var, xn1Var2, xn1Var3, xn1Var4, xn1Var5, xn1Var6, xn1Var7, xn1Var8, xn1Var9, xn1Var10, xn1Var11, xn1Var12, xn1Var13, xn1Var14, xn1Var15, xn1Var16, xn1Var17, xn1Var18, xn1Var19, xn1Var20, xn1Var21, xn1Var22, xn1Var23, xn1Var24, xn1Var25, xn1Var26, xn1Var27, xn1Var28, xn1Var29, xn1Var30, xn1Var31, xn1Var32, xn1Var33, xn1Var34, xn1Var35, xn1Var36, xn1Var37, xn1Var38, xn1Var39, xn1Var40, xn1Var41, xn1Var42, xn1Var43, xn1Var44, xn1Var45, xn1Var46, xn1Var47, xn1Var48, xn1Var49, new xn1("GROUP_LIST", 49, 49, 2, ch2Var7), new xn1("MAP", 50, 50, 4, ch2.VOID)};
        xn1[] xn1VarArrValues = values();
        m = new xn1[xn1VarArrValues.length];
        for (xn1 xn1Var50 : xn1VarArrValues) {
            m[xn1Var50.j] = xn1Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xn1(String str, int i, int i2, int i3, ch2 ch2Var) {
        super(str, i);
        this.j = i2;
        int iD = du4.D(i3);
        if (iD == 1 || iD == 3) {
            Class cls = ch2Var.j;
        }
        if (i3 == 1) {
            ch2Var.ordinal();
        }
    }

    public static xn1 valueOf(String str) {
        return (xn1) Enum.valueOf(xn1.class, str);
    }

    public static xn1[] values() {
        return (xn1[]) q.clone();
    }
}

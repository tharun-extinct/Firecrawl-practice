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
public final class p66 {
    public static final p66 a;
    public static final p66[] m;
    public static final /* synthetic */ p66[] q;
    public static final p66 t;
    public final byte j;

    /* JADX INFO: Fake field, exist only in values array */
    p66 EF0;

    static {
        s76 s76Var = s76.DOUBLE;
        p66 p66Var = new p66("DOUBLE", 0, 0, 1, s76Var);
        s76 s76Var2 = s76.FLOAT;
        p66 p66Var2 = new p66("FLOAT", 1, 1, 1, s76Var2);
        s76 s76Var3 = s76.LONG;
        p66 p66Var3 = new p66("INT64", 2, 2, 1, s76Var3);
        p66 p66Var4 = new p66("UINT64", 3, 3, 1, s76Var3);
        s76 s76Var4 = s76.INT;
        p66 p66Var5 = new p66("INT32", 4, 4, 1, s76Var4);
        p66 p66Var6 = new p66("FIXED64", 5, 5, 1, s76Var3);
        p66 p66Var7 = new p66("FIXED32", 6, 6, 1, s76Var4);
        s76 s76Var5 = s76.BOOLEAN;
        p66 p66Var8 = new p66("BOOL", 7, 7, 1, s76Var5);
        s76 s76Var6 = s76.STRING;
        p66 p66Var9 = new p66("STRING", 8, 8, 1, s76Var6);
        s76 s76Var7 = s76.MESSAGE;
        p66 p66Var10 = new p66("MESSAGE", 9, 9, 1, s76Var7);
        s76 s76Var8 = s76.BYTE_STRING;
        p66 p66Var11 = new p66("BYTES", 10, 10, 1, s76Var8);
        p66 p66Var12 = new p66("UINT32", 11, 11, 1, s76Var4);
        s76 s76Var9 = s76.ENUM;
        p66 p66Var13 = new p66("ENUM", 12, 12, 1, s76Var9);
        p66 p66Var14 = new p66("SFIXED32", 13, 13, 1, s76Var4);
        p66 p66Var15 = new p66("SFIXED64", 14, 14, 1, s76Var3);
        p66 p66Var16 = new p66("SINT32", 15, 15, 1, s76Var4);
        p66 p66Var17 = new p66("SINT64", 16, 16, 1, s76Var3);
        p66 p66Var18 = new p66("GROUP", 17, 17, 1, s76Var7);
        p66 p66Var19 = new p66("DOUBLE_LIST", 18, 18, 2, s76Var);
        p66 p66Var20 = new p66("FLOAT_LIST", 19, 19, 2, s76Var2);
        p66 p66Var21 = new p66("INT64_LIST", 20, 20, 2, s76Var3);
        p66 p66Var22 = new p66("UINT64_LIST", 21, 21, 2, s76Var3);
        p66 p66Var23 = new p66("INT32_LIST", 22, 22, 2, s76Var4);
        p66 p66Var24 = new p66("FIXED64_LIST", 23, 23, 2, s76Var3);
        p66 p66Var25 = new p66("FIXED32_LIST", 24, 24, 2, s76Var4);
        p66 p66Var26 = new p66("BOOL_LIST", 25, 25, 2, s76Var5);
        p66 p66Var27 = new p66("STRING_LIST", 26, 26, 2, s76Var6);
        p66 p66Var28 = new p66("MESSAGE_LIST", 27, 27, 2, s76Var7);
        p66 p66Var29 = new p66("BYTES_LIST", 28, 28, 2, s76Var8);
        p66 p66Var30 = new p66("UINT32_LIST", 29, 29, 2, s76Var4);
        p66 p66Var31 = new p66("ENUM_LIST", 30, 30, 2, s76Var9);
        p66 p66Var32 = new p66("SFIXED32_LIST", 31, 31, 2, s76Var4);
        p66 p66Var33 = new p66("SFIXED64_LIST", 32, 32, 2, s76Var3);
        p66 p66Var34 = new p66("SINT32_LIST", 33, 33, 2, s76Var4);
        p66 p66Var35 = new p66("SINT64_LIST", 34, 34, 2, s76Var3);
        p66 p66Var36 = new p66("DOUBLE_LIST_PACKED", 35, 35, 3, s76Var);
        t = p66Var36;
        p66 p66Var37 = new p66("FLOAT_LIST_PACKED", 36, 36, 3, s76Var2);
        p66 p66Var38 = new p66("INT64_LIST_PACKED", 37, 37, 3, s76Var3);
        p66 p66Var39 = new p66("UINT64_LIST_PACKED", 38, 38, 3, s76Var3);
        p66 p66Var40 = new p66("INT32_LIST_PACKED", 39, 39, 3, s76Var4);
        p66 p66Var41 = new p66("FIXED64_LIST_PACKED", 40, 40, 3, s76Var3);
        p66 p66Var42 = new p66("FIXED32_LIST_PACKED", 41, 41, 3, s76Var4);
        p66 p66Var43 = new p66("BOOL_LIST_PACKED", 42, 42, 3, s76Var5);
        p66 p66Var44 = new p66("UINT32_LIST_PACKED", 43, 43, 3, s76Var4);
        p66 p66Var45 = new p66("ENUM_LIST_PACKED", 44, 44, 3, s76Var9);
        p66 p66Var46 = new p66("SFIXED32_LIST_PACKED", 45, 45, 3, s76Var4);
        p66 p66Var47 = new p66("SFIXED64_LIST_PACKED", 46, 46, 3, s76Var3);
        p66 p66Var48 = new p66("SINT32_LIST_PACKED", 47, 47, 3, s76Var4);
        p66 p66Var49 = new p66("SINT64_LIST_PACKED", 48, 48, 3, s76Var3);
        a = p66Var49;
        q = new p66[]{p66Var, p66Var2, p66Var3, p66Var4, p66Var5, p66Var6, p66Var7, p66Var8, p66Var9, p66Var10, p66Var11, p66Var12, p66Var13, p66Var14, p66Var15, p66Var16, p66Var17, p66Var18, p66Var19, p66Var20, p66Var21, p66Var22, p66Var23, p66Var24, p66Var25, p66Var26, p66Var27, p66Var28, p66Var29, p66Var30, p66Var31, p66Var32, p66Var33, p66Var34, p66Var35, p66Var36, p66Var37, p66Var38, p66Var39, p66Var40, p66Var41, p66Var42, p66Var43, p66Var44, p66Var45, p66Var46, p66Var47, p66Var48, p66Var49, new p66("GROUP_LIST", 49, 49, 2, s76Var7), new p66("MAP", 50, 50, 4, s76.VOID)};
        p66[] p66VarArrValues = values();
        m = new p66[p66VarArrValues.length];
        for (p66 p66Var50 : p66VarArrValues) {
            m[p66Var50.j] = p66Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p66(String str, int i, int i2, int i3, s76 s76Var) {
        super(str, i);
        this.j = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = s76Var.j;
        }
        if (i3 == 1) {
            s76 s76Var2 = s76.VOID;
            s76Var.ordinal();
        }
    }

    public static p66[] values() {
        return (p66[]) q.clone();
    }
}

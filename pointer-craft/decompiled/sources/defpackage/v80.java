package defpackage;

import io.appground.blek.R;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v80 implements cz1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object w;

    public /* synthetic */ v80(Serializable serializable, Object[] objArr, Object obj, Object obj2, ob3 ob3Var, byte b) {
        this.j = b;
        this.t = serializable;
        this.a = objArr;
        this.m = obj;
        this.w = obj2;
        this.q = ob3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r11v30 */
    @Override // defpackage.cz1
    public final Object x(Object obj, Object obj2, Object obj3) {
        ?? r11;
        hp2[] hp2VarArr;
        zf5[] zf5VarArr;
        i63 i63Var;
        int i;
        cn4 cn4VarG;
        byte b = this.j;
        Object obj4 = oo0.g;
        char c = 14;
        og5 og5Var = og5.g;
        Object obj5 = this.w;
        Object obj6 = this.q;
        Object obj7 = this.m;
        Object obj8 = this.a;
        Object obj9 = this.t;
        int i2 = 0;
        switch (b) {
            case 0:
                gx4 gx4Var = (gx4) obj9;
                b90 b90Var = (b90) obj8;
                bg5 bg5Var = (bg5) obj7;
                List list = bg5Var.y;
                int i3 = bg5Var.r;
                ob3 ob3Var = (ob3) obj6;
                ob3 ob3Var2 = (ob3) obj5;
                int iIntValue = ((Integer) obj).intValue();
                h02 h02Var = (h02) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= h02Var.n(iIntValue) ? 4 : 2;
                }
                if (!h02Var.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    h02Var.Q();
                    return og5Var;
                }
                if (iIntValue != 0) {
                    if (iIntValue == 1) {
                        h02Var.X(-1862084739);
                        boolean zN = h02Var.n(i3) | h02Var.n(list.size());
                        Object objK = h02Var.K();
                        if (zN || objK == obj4) {
                            uz5 uz5Var = gx4Var.y;
                            o90 o90Var = uz5Var instanceof o90 ? (o90) uz5Var : null;
                            objK = o90Var != null ? Integer.valueOf(o90Var.y) : null;
                            h02Var.i0(objK);
                        }
                        Integer num = (Integer) objK;
                        int size = list.size();
                        boolean zJ = h02Var.j(b90Var);
                        Object objK2 = h02Var.K();
                        if (zJ || objK2 == obj4) {
                            objK2 = new w30(2, b90Var, b90.class, "updateFunctionAction", "updateFunctionAction(Ljava/lang/String;I)V", 0);
                            h02Var.i0(objK2);
                        }
                        bz1 bz1Var = (bz1) ((nz1) objK2);
                        boolean zBooleanValue = ((Boolean) ob3Var.getValue()).booleanValue();
                        boolean zX = h02Var.x(ob3Var);
                        Object objK3 = h02Var.K();
                        if (zX || objK3 == obj4) {
                            objK3 = new ff(ob3Var, (byte) 6);
                            h02Var.i0(objK3);
                        }
                        zb6.y(num, size, bz1Var, zBooleanValue, (xy1) objK3, h02Var, 0);
                        h02Var.b(false);
                    } else if (iIntValue != 2) {
                        h02Var.X(-1860926300);
                        h02Var.b(false);
                    } else {
                        h02Var.X(-1861420812);
                        boolean zN2 = h02Var.n(list.size()) | h02Var.n(i3);
                        Object objK4 = h02Var.K();
                        if (zN2 || objK4 == obj4) {
                            uz5 uz5Var2 = gx4Var.y;
                            q90 q90Var = uz5Var2 instanceof q90 ? (q90) uz5Var2 : null;
                            String str = q90Var != null ? q90Var.y : null;
                            h02Var.i0(str);
                            objK4 = str;
                        }
                        String str2 = (String) objK4;
                        boolean zJ2 = h02Var.j(b90Var);
                        Object objK5 = h02Var.K();
                        if (zJ2 || objK5 == obj4) {
                            objK5 = new c80(b90Var, (byte) 1);
                            h02Var.i0(objK5);
                        }
                        rz5.c(str2, (xy1) objK5, h02Var, 0);
                        h02Var.b(false);
                    }
                    return og5Var;
                }
                h02Var.X(-1862722595);
                boolean zX2 = h02Var.x(gx4Var);
                Object objK6 = h02Var.K();
                if (zX2 || objK6 == obj4) {
                    uz5 uz5Var3 = gx4Var.y;
                    p90 p90Var = uz5Var3 instanceof p90 ? (p90) uz5Var3 : null;
                    objK6 = p90Var != null ? cj0.E0(p90Var.y) : new int[0];
                    h02Var.i0(objK6);
                }
                int[] iArr = (int[]) objK6;
                tj2 tj2Var = (tj2) ob3Var2.getValue();
                if (tj2Var != null) {
                    wi2 wi2Var = tj2Var.g;
                    boolean z = wi2Var.y;
                    zf5[] zf5VarArr2 = {ey5.v("Esc", 41, 0.0f, null, 14), ey5.v("F1", 58, 0.0f, null, 14), ey5.v("F2", 59, 0.0f, null, 14), ey5.v("F3", 60, 0.0f, null, 14), ey5.v("F4", 61, 0.0f, null, 14), ey5.v("F5", 62, 0.0f, null, 14), ey5.v("F6", 63, 0.0f, null, 14), ey5.v("F7", 64, 0.0f, null, 14), ey5.v("F8", 65, 0.0f, null, 14), ey5.v("F9", 66, 0.0f, null, 14), ey5.v("F10", 67, 0.0f, null, 14), ey5.v("F11", 68, 0.0f, null, 14), ey5.v("F12", 69, 0.0f, null, 14)};
                    zf5[] zf5VarArr3 = {ey5.v("F13", 104, 0.0f, null, 14), ey5.v("F14", 105, 0.0f, null, 14), ey5.v("F15", 106, 0.0f, null, 14), ey5.v("F16", 107, 0.0f, null, 14), ey5.v("F17", 108, 0.0f, null, 14), ey5.v("F18", 109, 0.0f, null, 14), ey5.v("F19", 110, 0.0f, null, 14), ey5.v("F20", 111, 0.0f, null, 14), ey5.v("F21", 112, 0.0f, null, 14), ey5.v("F22", 113, 0.0f, null, 14), ey5.v("F23", 114, 0.0f, null, 14), ey5.v("F24", 115, 0.0f, null, 14)};
                    ei2 ei2Var = wi2Var.N;
                    zf5 zf5VarN = ei2Var != null ? ey5.n(ei2Var, 53) : null;
                    ei2 ei2Var2 = wi2Var.O;
                    zf5 zf5VarN2 = ei2Var2 != null ? ey5.n(ei2Var2, 30) : null;
                    ei2 ei2Var3 = wi2Var.P;
                    zf5 zf5VarN3 = ei2Var3 != null ? ey5.n(ei2Var3, 31) : null;
                    ei2 ei2Var4 = wi2Var.Q;
                    zf5 zf5VarN4 = ei2Var4 != null ? ey5.n(ei2Var4, 32) : null;
                    ei2 ei2Var5 = wi2Var.R;
                    zf5 zf5VarN5 = ei2Var5 != null ? ey5.n(ei2Var5, 33) : null;
                    ei2 ei2Var6 = wi2Var.S;
                    zf5 zf5VarN6 = ei2Var6 != null ? ey5.n(ei2Var6, 34) : null;
                    ei2 ei2Var7 = wi2Var.T;
                    zf5 zf5VarN7 = ei2Var7 != null ? ey5.n(ei2Var7, 35) : null;
                    ei2 ei2Var8 = wi2Var.U;
                    zf5 zf5VarN8 = ei2Var8 != null ? ey5.n(ei2Var8, 36) : null;
                    ei2 ei2Var9 = wi2Var.V;
                    zf5 zf5VarN9 = ei2Var9 != null ? ey5.n(ei2Var9, 37) : null;
                    ei2 ei2Var10 = wi2Var.W;
                    zf5 zf5VarN10 = ei2Var10 != null ? ey5.n(ei2Var10, 38) : null;
                    ei2 ei2Var11 = wi2Var.X;
                    zf5 zf5VarN11 = ei2Var11 != null ? ey5.n(ei2Var11, 39) : null;
                    ei2 ei2Var12 = wi2Var.Y;
                    zf5 zf5VarN12 = ei2Var12 != null ? ey5.n(ei2Var12, 45) : null;
                    ei2 ei2Var13 = wi2Var.Z;
                    zf5[] zf5VarArr4 = (zf5[]) pr.W(new zf5[]{zf5VarN, zf5VarN2, zf5VarN3, zf5VarN4, zf5VarN5, zf5VarN6, zf5VarN7, zf5VarN8, zf5VarN9, zf5VarN10, zf5VarN11, zf5VarN12, ei2Var13 != null ? ey5.n(ei2Var13, 46) : null, ey5.v("←", 42, 1.7f, null, 12)}).toArray(new zf5[0]);
                    zf5 zf5VarV = ey5.v("Tab", 43, 1.5f, null, 12);
                    ei2 ei2Var14 = wi2Var.A;
                    zf5 zf5VarN13 = ei2Var14 != null ? ey5.n(ei2Var14, 20) : null;
                    ei2 ei2Var15 = wi2Var.B;
                    zf5 zf5VarN14 = ei2Var15 != null ? ey5.n(ei2Var15, 26) : null;
                    ei2 ei2Var16 = wi2Var.C;
                    zf5 zf5VarN15 = ei2Var16 != null ? ey5.n(ei2Var16, 8) : null;
                    ei2 ei2Var17 = wi2Var.D;
                    zf5 zf5VarN16 = ei2Var17 != null ? ey5.n(ei2Var17, 21) : null;
                    ei2 ei2Var18 = wi2Var.E;
                    zf5 zf5VarN17 = ei2Var18 != null ? ey5.n(ei2Var18, 23) : null;
                    ei2 ei2Var19 = wi2Var.F;
                    zf5 zf5VarN18 = ei2Var19 != null ? ey5.n(ei2Var19, 28) : null;
                    ei2 ei2Var20 = wi2Var.G;
                    zf5 zf5VarN19 = ei2Var20 != null ? ey5.n(ei2Var20, 24) : null;
                    ei2 ei2Var21 = wi2Var.H;
                    zf5 zf5VarN20 = ei2Var21 != null ? ey5.n(ei2Var21, 12) : null;
                    ei2 ei2Var22 = wi2Var.I;
                    zf5 zf5VarN21 = ei2Var22 != null ? ey5.n(ei2Var22, 18) : null;
                    ei2 ei2Var23 = wi2Var.J;
                    zf5 zf5VarN22 = ei2Var23 != null ? ey5.n(ei2Var23, 19) : null;
                    ei2 ei2Var24 = wi2Var.K;
                    zf5 zf5VarN23 = ei2Var24 != null ? ey5.n(ei2Var24, 47) : null;
                    ei2 ei2Var25 = wi2Var.L;
                    zf5 zf5VarN24 = ei2Var25 != null ? ey5.n(ei2Var25, 48) : null;
                    ei2 ei2Var26 = wi2Var.M;
                    zf5[] zf5VarArr5 = (zf5[]) pr.W(new zf5[]{zf5VarV, zf5VarN13, zf5VarN14, zf5VarN15, zf5VarN16, zf5VarN17, zf5VarN18, zf5VarN19, zf5VarN20, zf5VarN21, zf5VarN22, zf5VarN23, zf5VarN24, ei2Var26 != null ? ey5.n(ei2Var26, 50) : null}).toArray(new zf5[0]);
                    zf5 zf5VarV2 = ey5.v("Caps", 57, 1.7f, null, 12);
                    ei2 ei2Var27 = wi2Var.i;
                    zf5 zf5VarN25 = ei2Var27 != null ? ey5.n(ei2Var27, 4) : null;
                    ei2 ei2Var28 = wi2Var.b;
                    zf5 zf5VarN26 = ei2Var28 != null ? ey5.n(ei2Var28, 22) : null;
                    ei2 ei2Var29 = wi2Var.s;
                    zf5 zf5VarN27 = ei2Var29 != null ? ey5.n(ei2Var29, 7) : null;
                    ei2 ei2Var30 = wi2Var.p;
                    zf5 zf5VarN28 = ei2Var30 != null ? ey5.n(ei2Var30, 9) : null;
                    ei2 ei2Var31 = wi2Var.u;
                    zf5 zf5VarN29 = ei2Var31 != null ? ey5.n(ei2Var31, 10) : null;
                    ei2 ei2Var32 = wi2Var.z;
                    zf5 zf5VarN30 = ei2Var32 != null ? ey5.n(ei2Var32, 11) : null;
                    ei2 ei2Var33 = wi2Var.h;
                    zf5 zf5VarN31 = ei2Var33 != null ? ey5.n(ei2Var33, 13) : null;
                    ei2 ei2Var34 = wi2Var.o;
                    zf5 zf5VarN32 = ei2Var34 != null ? ey5.n(ei2Var34, 14) : null;
                    ei2 ei2Var35 = wi2Var.f;
                    zf5 zf5VarN33 = ei2Var35 != null ? ey5.n(ei2Var35, 15) : null;
                    ei2 ei2Var36 = wi2Var.k;
                    zf5 zf5VarN34 = ei2Var36 != null ? ey5.n(ei2Var36, 51) : null;
                    ei2 ei2Var37 = wi2Var.d;
                    zf5 zf5VarN35 = ei2Var37 != null ? ey5.n(ei2Var37, 52) : null;
                    ei2 ei2Var38 = wi2Var.e;
                    zf5[] zf5VarArr6 = (zf5[]) pr.W(new zf5[]{zf5VarV2, zf5VarN25, zf5VarN26, zf5VarN27, zf5VarN28, zf5VarN29, zf5VarN30, zf5VarN31, zf5VarN32, zf5VarN33, zf5VarN34, zf5VarN35, ei2Var38 != null ? ey5.n(ei2Var38, 49) : null}).toArray(new zf5[0]);
                    zf5 zf5VarV3 = ey5.v("Shift", 225, 1.5f, i63.t, 8);
                    ei2 ei2Var39 = wi2Var.n;
                    zf5 zf5VarN36 = ei2Var39 != null ? ey5.n(ei2Var39, 100) : null;
                    ei2 ei2Var40 = wi2Var.v;
                    zf5 zf5VarN37 = ei2Var40 != null ? ey5.n(ei2Var40, 29) : null;
                    ei2 ei2Var41 = wi2Var.x;
                    zf5 zf5VarN38 = ei2Var41 != null ? ey5.n(ei2Var41, 27) : null;
                    ei2 ei2Var42 = wi2Var.l;
                    zf5 zf5VarN39 = ei2Var42 != null ? ey5.n(ei2Var42, 6) : null;
                    ei2 ei2Var43 = wi2Var.j;
                    zf5 zf5VarN40 = ei2Var43 != null ? ey5.n(ei2Var43, 25) : null;
                    ei2 ei2Var44 = wi2Var.t;
                    zf5 zf5VarN41 = ei2Var44 != null ? ey5.n(ei2Var44, 5) : null;
                    ei2 ei2Var45 = wi2Var.a;
                    zf5 zf5VarN42 = ei2Var45 != null ? ey5.n(ei2Var45, 17) : null;
                    ei2 ei2Var46 = wi2Var.m;
                    zf5 zf5VarN43 = ei2Var46 != null ? ey5.n(ei2Var46, 16) : null;
                    ei2 ei2Var47 = wi2Var.q;
                    zf5 zf5VarN44 = ei2Var47 != null ? ey5.n(ei2Var47, 54) : null;
                    ei2 ei2Var48 = wi2Var.w;
                    zf5 zf5VarN45 = ei2Var48 != null ? ey5.n(ei2Var48, 55) : null;
                    ei2 ei2Var49 = wi2Var.c;
                    zf5[] zf5VarArr7 = (zf5[]) pr.W(new zf5[]{zf5VarV3, zf5VarN36, zf5VarN37, zf5VarN38, zf5VarN39, zf5VarN40, zf5VarN41, zf5VarN42, zf5VarN43, zf5VarN44, zf5VarN45, ei2Var49 != null ? ey5.n(ei2Var49, 56) : null, ey5.v("Shift", 229, 0.0f, i63.q, 10)}).toArray(new zf5[0]);
                    i63 i63Var2 = i63.w;
                    i63 i63Var3 = i63.m;
                    i63 i63Var4 = i63.a;
                    i63 i63Var5 = i63.j;
                    if (z) {
                        zf5VarArr = new zf5[]{ey5.v("⌃ Ctrl", 224, 0.0f, i63Var5, 10), ey5.v("⌥ Opt", 226, 2.0f, i63Var4, 8), ey5.v("⌘ Cmd", 227, 2.0f, i63Var3, 8), ey5.v("Cmd ⌘", 231, 2.0f, i63.c, 8), ey5.v("Opt ⌥", 230, 2.0f, i63Var2, 8)};
                        i = 4;
                        i63Var = null;
                    } else {
                        i63Var = null;
                        i = 4;
                        zf5VarArr = new zf5[]{ey5.v("Ctrl", 224, 0.0f, i63Var5, 10), ey5.v("Win", 227, 2.0f, i63Var3, 8), ey5.v("Alt", 226, 2.0f, i63Var4, 8), ey5.v("Alt Gr", 230, 2.0f, i63Var2, 8), ey5.v("Menu", 101, 0.0f, null, 14)};
                    }
                    hp2VarArr = new hp2[]{new hp2(R.string.keyboard_section_function_keys, new zf5[][]{zf5VarArr2, zf5VarArr3}), new hp2(R.string.keyboard_section_alphanumeric_modifier_keys, new zf5[][]{zf5VarArr4, zf5VarArr5, zf5VarArr6, zf5VarArr7, zf5VarArr, new zf5[]{ey5.v("Space", 44, 3.0f, i63Var, i), ey5.v(z ? "Return" : "Enter", 40, 2.0f, i63Var, 12)}}), new hp2(R.string.keyboard_section_navigation_system_keys, new zf5[][]{new zf5[]{ey5.v("Print", 70, 0.0f, i63Var, 14), ey5.v("Scroll Lock", 71, 0.0f, i63Var, 14), ey5.v("Pause", 72, 0.0f, i63Var, 14)}, new zf5[]{ey5.v("Ins", 73, 0.0f, i63Var, 14), ey5.v("⇱ Home", 74, 0.0f, i63Var, 14), ey5.v("Pg Up", 75, 0.0f, i63Var, 14)}, new zf5[]{ey5.v("Del", 76, 0.0f, i63Var, 14), ey5.v("⇲ End", 77, 0.0f, i63Var, 14), ey5.v("Pg Dn", 78, 0.0f, i63Var, 14)}, new zf5[]{ey5.v("↑", 82, 0.0f, i63Var, 14)}, new zf5[]{ey5.v("←", 80, 0.0f, i63Var, 14), ey5.v("↓", 81, 0.0f, i63Var, 14), ey5.v("→", 79, 0.0f, i63Var, 14)}}), new hp2(R.string.keyboard_section_browser_keys, new zf5[][]{new zf5[]{ey5.v("Back", 241, 2.0f, i63Var, 12), ey5.v("Forward", 242, 2.0f, i63Var, 12)}}), new hp2(R.string.keyboard_section_numpad, new zf5[][]{new zf5[]{ey5.v("Num Lock", 83, 0.0f, i63Var, 14), ey5.v("/", 84, 0.0f, i63Var, 6), ey5.v("*", 85, 0.0f, i63Var, 6)}, new zf5[]{ey5.v("-", 86, 0.0f, i63Var, 6), ey5.v("+", 87, 0.0f, i63Var, 6), ey5.v("Enter", 88, 0.0f, i63Var, 14)}, new zf5[]{ey5.v("7", 95, 0.0f, i63Var, 6), ey5.v("8", 96, 0.0f, i63Var, 6), ey5.v("9", 97, 0.0f, i63Var, 6)}, new zf5[]{ey5.v("4", 92, 0.0f, i63Var, 6), ey5.v("5", 93, 0.0f, i63Var, 6), ey5.v("6", 94, 0.0f, i63Var, 6)}, new zf5[]{ey5.v("1", 89, 0.0f, i63Var, 6), ey5.v("2", 90, 0.0f, i63Var, 6), ey5.v("3", 91, 0.0f, i63Var, 6)}, new zf5[]{ey5.v("0", 98, 2.0f, i63Var, 4), ey5.v(".", 99, 0.0f, i63Var, 6)}})};
                    r11 = 0;
                } else {
                    r11 = 0;
                    hp2VarArr = new hp2[0];
                }
                boolean zJ3 = h02Var.j(b90Var);
                Object objK7 = h02Var.K();
                if (zJ3 || objK7 == obj4) {
                    objK7 = new c80(b90Var, r11);
                    h02Var.i0(objK7);
                }
                kp4.n(hp2VarArr, iArr, (xy1) objK7, h02Var, r11);
                h02Var.b(r11);
                return og5Var;
            case 1:
                g61 g61Var = (g61) obj9;
                xy1 xy1Var = (xy1) obj8;
                xy1 xy1Var2 = (xy1) obj7;
                my1 my1Var = (my1) obj6;
                xy1 xy1Var3 = (xy1) obj5;
                bq2 bq2Var = (bq2) obj;
                h02 h02Var2 = (h02) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                bq2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= h02Var2.x(bq2Var) ? 4 : 2;
                }
                if (h02Var2.N(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    j73 j73VarG = bq2.g(bq2Var);
                    boolean zX3 = h02Var2.x(xy1Var) | h02Var2.j(g61Var);
                    Object objK8 = h02Var2.K();
                    if (zX3 || objK8 == obj4) {
                        objK8 = new t61(xy1Var, g61Var, (byte) 0);
                        h02Var2.i0(objK8);
                    }
                    my1 my1Var2 = (my1) objK8;
                    boolean zX4 = h02Var2.x(xy1Var2) | h02Var2.j(g61Var);
                    Object objK9 = h02Var2.K();
                    if (zX4 || objK9 == obj4) {
                        objK9 = new t61(xy1Var2, g61Var, (byte) 1);
                        h02Var2.i0(objK9);
                    }
                    my1 my1Var3 = (my1) objK9;
                    boolean zX5 = h02Var2.x(my1Var);
                    Object objK10 = h02Var2.K();
                    if (zX5 || objK10 == obj4) {
                        objK10 = new ss(my1Var, (byte) 1);
                        h02Var2.i0(objK10);
                    }
                    my1 my1Var4 = (my1) objK10;
                    boolean zX6 = h02Var2.x(xy1Var3) | h02Var2.j(g61Var);
                    Object objK11 = h02Var2.K();
                    if (zX6 || objK11 == obj4) {
                        objK11 = new t61(xy1Var3, g61Var, (byte) 2);
                        h02Var2.i0(objK11);
                    }
                    ue5.l(g61Var, j73VarG, my1Var2, my1Var3, my1Var4, (my1) objK11, h02Var2, 0);
                } else {
                    h02Var2.Q();
                }
                return og5Var;
            case 2:
                n85[] n85VarArr = (n85[]) obj8;
                q75 q75Var = (q75) obj7;
                k85 k85Var = (k85) obj5;
                ob3 ob3Var3 = (ob3) obj6;
                v33 v33Var = (v33) obj;
                p33 p33Var = (p33) obj2;
                ws0 ws0Var = (ws0) obj3;
                v33Var.getClass();
                p33Var.getClass();
                us3 us3VarV = p33Var.v(ws0Var.g);
                cj cjVar = new cj((String) obj9);
                int length = n85VarArr.length;
                while (i2 < length) {
                    k85 k85VarG = k85.g(k85Var, 0L, n85VarArr[i2].g, null, null, 0L, 0L, null, 16777213);
                    k85 k85Var2 = k85Var;
                    cj cjVar2 = cjVar;
                    j75 j75VarG = q75.g(q75Var, cjVar2, k85VarG, 0L, 2044);
                    if (((int) (j75VarG.r >> 32)) < ws0.t(ws0Var.g) || i2 == n85VarArr.length - 1) {
                        ob3Var3.setValue(j75VarG);
                        return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 4));
                    }
                    i2++;
                    cjVar = cjVar2;
                    k85Var = k85Var2;
                }
                return v33Var.k0(us3VarV.j, us3VarV.t, qi1.j, new sw(us3VarV, (byte) 4));
            case 3:
                ao2 ao2Var = (ao2) obj9;
                xy1 xy1Var4 = (xy1) obj8;
                xy1 xy1Var5 = (xy1) obj7;
                xy1 xy1Var6 = (xy1) obj6;
                xy1 xy1Var7 = (xy1) obj5;
                int iIntValue4 = ((Integer) obj).intValue();
                h02 h02Var3 = (h02) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= h02Var3.n(iIntValue4) ? 4 : 2;
                }
                if (!h02Var3.N(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    h02Var3.Q();
                } else if (iIntValue4 == 0) {
                    h02Var3.X(1632344744);
                    nc6.v(ao2Var, xy1Var4, xy1Var5, xy1Var6, h02Var3, 8);
                    h02Var3.b(false);
                } else if (iIntValue4 != 1) {
                    h02Var3.X(-936559832);
                    h02Var3.b(false);
                } else {
                    h02Var3.X(1632352954);
                    vx5.r(null, xy1Var7, h02Var3, 0);
                    h02Var3.b(false);
                }
                return og5Var;
            case 4:
                String[] strArr = (String[]) obj9;
                String[] strArr2 = (String[]) obj8;
                gx3 gx3Var = (gx3) obj7;
                jm3 jm3Var = (jm3) obj5;
                ob3 ob3Var4 = (ob3) obj6;
                z83 z83Var = (z83) obj;
                h02 h02Var4 = (h02) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                z83Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= h02Var4.x(z83Var) ? 4 : 2;
                }
                if (h02Var4.N(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    int length2 = strArr.length;
                    int i4 = 0;
                    while (i2 < length2) {
                        char c2 = c;
                        String str3 = strArr[i2];
                        int i5 = i4 + 1;
                        String str4 = strArr2[i4];
                        if (i4 == 0) {
                            cn4VarG = na4.g(6);
                        } else {
                            cn4VarG = i4 == strArr.length + (-1) ? na4.g(9) : yf2.b;
                        }
                        boolean zContains = ((Set) ob3Var4.getValue()).contains(str4);
                        boolean zJ4 = h02Var4.j(gx3Var) | h02Var4.j(jm3Var) | h02Var4.x(ob3Var4) | h02Var4.x(str4);
                        String[] strArr3 = strArr;
                        Object objK12 = h02Var4.K();
                        if (zJ4 || objK12 == obj4) {
                            objK12 = new mg(gx3Var, jm3Var, ob3Var4, str4, (byte) 6);
                            h02Var4.i0(objK12);
                        }
                        mf6.r(z83Var, zContains, (xy1) objK12, cn4VarG, null, false, null, null, null, null, ue5.m0(951003730, new wo(str3, (byte) 11), h02Var4), h02Var4, iIntValue6 & 14);
                        i2++;
                        i4 = i5;
                        c = c2;
                        strArr = strArr3;
                    }
                } else {
                    h02Var4.Q();
                }
                return og5Var;
            default:
                String str5 = (String) obj5;
                mb4 mb4Var = (mb4) obj;
                h02 h02Var5 = (h02) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ue5.n(lr2.D(xq2.J(m22.g, 48.0f), 2.0f, 14), t6.n, ue5.m0(-510985574, new jp4((qj0) obj8, (he) obj7, (byte) 4), h02Var5), h02Var5, 384, 0);
                j85 j85Var = new j85((qj0) obj6, new n85(kq2.G(16)), new pv1(), 56);
                mb4Var.getClass();
                mx5.g(str5, new go5(t91.g), j85Var, 1, h02Var5, 3072, 0);
                ((cz1) obj9).x(mb4Var, h02Var5, Integer.valueOf(iIntValue7 & 14));
                return og5Var;
        }
    }

    public /* synthetic */ v80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.j = b;
        this.t = obj;
        this.a = obj2;
        this.m = obj3;
        this.q = obj4;
        this.w = obj5;
    }
}

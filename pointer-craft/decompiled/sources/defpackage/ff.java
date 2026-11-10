package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ff implements xy1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ ob3 t;

    public /* synthetic */ ff(ob3 ob3Var, byte b) {
        this.j = b;
        this.t = ob3Var;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        ob3 ob3Var = this.t;
        switch (b) {
            case 0:
                ob3Var.setValue((bl2) obj);
                return og5Var;
            case 1:
                xl4 xl4Var = (xl4) obj;
                xl4Var.getClass();
                ob3Var.setValue(xl4Var);
                return og5Var;
            case 2:
                String str = (String) obj;
                str.getClass();
                ((xy1) ob3Var.getValue()).a(str);
                return og5Var;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ((xy1) ob3Var.getValue()).a(str2);
                return og5Var;
            case 4:
                ob3Var.setValue((bl2) obj);
                return og5Var;
            case 5:
                List list = (List) obj;
                if (ob3Var != null) {
                    ob3Var.setValue(list);
                }
                return og5Var;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ob3Var.setValue(bool);
                return og5Var;
            case 7:
                ky0 ky0Var = (ky0) obj;
                ky0Var.getClass();
                ob3Var.setValue(new fd(1, ky0Var, ky0.class, "loadLayout", "loadLayout(Lio/appground/blek/nano/Proto$LayoutData;)V", 0, (byte) 1));
                return og5Var;
            case 8:
                bl2 bl2Var = (bl2) obj;
                bl2Var.getClass();
                bl2 bl2VarM = bl2Var.m();
                ob3Var.setValue(Boolean.valueOf(Float.intBitsToFloat((int) ((bl2VarM != null ? bl2VarM.p(bl2Var, 0L) : 0L) & 4294967295L)) <= 0.0f));
                return og5Var;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                ob3Var.setValue(str3);
                return og5Var;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                ob3Var.setValue(str4);
                return og5Var;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                String str5 = (String) obj;
                str5.getClass();
                ob3Var.setValue(str5);
                return og5Var;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ob3Var.setValue(bool2);
                return og5Var;
            case 13:
                String str6 = (String) obj;
                str6.getClass();
                ob3Var.setValue(wn4.g((wn4) ob3Var.getValue(), null, str6, null, 13));
                return og5Var;
            case 14:
                String str7 = (String) obj;
                str7.getClass();
                ob3Var.setValue(wn4.g((wn4) ob3Var.getValue(), str7, null, null, 14));
                return og5Var;
            case kq2.x /* 15 */:
                String str8 = (String) obj;
                str8.getClass();
                ob3Var.setValue(wn4.g((wn4) ob3Var.getValue(), null, null, str8, 7));
                return og5Var;
            case 16:
                ((Boolean) obj).getClass();
                ob3Var.setValue(Boolean.valueOf(!((Boolean) ob3Var.getValue()).booleanValue()));
                return og5Var;
            case 17:
                ob3Var.setValue((bl2) obj);
                return og5Var;
            case 18:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((xy1) ob3Var.getValue()).a(f)).floatValue());
            case 19:
                g61 g61Var = (g61) obj;
                g61Var.getClass();
                ob3Var.setValue(g61Var.t);
                return og5Var;
            case 20:
                wm2 wm2Var = (wm2) obj;
                wm2Var.getClass();
                if (((Boolean) ob3Var.getValue()).booleanValue()) {
                    wm2Var.g();
                }
                return og5Var;
            case 21:
                ((xy1) ob3Var.getValue()).a((wi3) obj);
                return og5Var;
            case 22:
                j75 j75Var = (j75) obj;
                j75Var.getClass();
                ob3Var.setValue(j75Var);
                return og5Var;
            case 23:
                ob3Var.setValue((bl2) obj);
                return og5Var;
            default:
                sk2 sk2Var = (sk2) obj;
                sk2Var.getClass();
                ob3Var.setValue(sk2Var);
                return og5Var;
        }
    }
}

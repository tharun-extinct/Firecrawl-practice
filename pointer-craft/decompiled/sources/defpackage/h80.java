package defpackage;

import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h80 implements xy1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object q;
    public final /* synthetic */ xy1 t;
    public final /* synthetic */ Object w;

    public /* synthetic */ h80(Object obj, Object obj2, Object obj3, xy1 xy1Var, Object obj4, Object obj5, Object obj6, byte b) {
        this.j = b;
        this.a = obj;
        this.m = obj2;
        this.q = obj3;
        this.t = xy1Var;
        this.w = obj4;
        this.c = obj5;
        this.i = obj6;
    }

    @Override // defpackage.xy1
    public final Object a(Object obj) {
        byte b = this.j;
        og5 og5Var = og5.g;
        Object obj2 = this.i;
        Object obj3 = this.c;
        Object obj4 = this.w;
        Object obj5 = this.q;
        Object obj6 = this.m;
        Object obj7 = this.a;
        int i = 2;
        switch (b) {
            case 0:
                final bg5 bg5Var = (bg5) obj7;
                final DecimalFormat decimalFormat = (DecimalFormat) obj6;
                final bz1 bz1Var = (bz1) obj5;
                final xy1 xy1Var = (xy1) obj4;
                final xy1 xy1Var2 = (xy1) obj3;
                ox0 ox0Var = (ox0) obj2;
                es2 es2Var = (es2) obj;
                es2Var.getClass();
                final int i2 = 0;
                for (Object obj8 : bg5Var.y) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        pw5.R();
                        throw null;
                    }
                    final gx4 gx4Var = (gx4) obj8;
                    if (i2 != 0) {
                        es2.G(es2Var, null, new nm0(-945381300, true, new cz1() { // from class: j80
                            @Override // defpackage.cz1
                            public final Object x(Object obj9, Object obj10, Object obj11) {
                                h02 h02Var = (h02) obj10;
                                int iIntValue = ((Integer) obj11).intValue();
                                ((bq2) obj9).getClass();
                                if (h02Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    int i4 = gx4Var.r;
                                    bz1 bz1Var2 = bz1Var;
                                    boolean zX = h02Var.x(bz1Var2);
                                    int i5 = i2;
                                    boolean zN = zX | h02Var.n(i5);
                                    Object objK = h02Var.K();
                                    if (zN || objK == oo0.g) {
                                        objK = new v2(bz1Var2, i5, (byte) 1);
                                        h02Var.i0(objK);
                                    }
                                    rz5.l(decimalFormat, i4, (xy1) objK, h02Var, 0);
                                } else {
                                    h02Var.Q();
                                }
                                return og5.g;
                            }
                        }), 3);
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    final xy1 xy1Var3 = this.t;
                    final int i4 = i2;
                    nm0 nm0Var = new nm0(-830339087, true, new cz1() { // from class: k80
                        @Override // defpackage.cz1
                        public final Object x(Object obj9, Object obj10, Object obj11) {
                            bq2 bq2Var = (bq2) obj9;
                            h02 h02Var = (h02) obj10;
                            int iIntValue = ((Integer) obj11).intValue();
                            bq2Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= h02Var.x(bq2Var) ? 4 : 2;
                            }
                            boolean z = false;
                            if (h02Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                                j73 j73VarG = bq2.g(bq2Var);
                                bg5 bg5Var2 = bg5Var;
                                int i5 = bg5Var2.r;
                                int i6 = i4;
                                if (i5 == i6) {
                                    z = true;
                                }
                                boolean z2 = bg5Var2.y.size() > 1;
                                String str = gx4Var.g;
                                if (str.length() == 0) {
                                    str = "???";
                                }
                                rz5.m(j73VarG, z, z2, str, i6, xy1Var3, xy1Var, xy1Var2, h02Var, 0);
                            } else {
                                h02Var.Q();
                            }
                            return og5.g;
                        }
                    });
                    i = 2;
                    es2.G(es2Var, numValueOf, nm0Var, 2);
                    i2 = i3;
                    og5Var = og5Var;
                }
                og5 og5Var2 = og5Var;
                es2.G(es2Var, "add", new nm0(1385082406, true, new ya4(bg5Var, xy1Var2, ox0Var, (byte) 3)), i);
                return og5Var2;
            default:
                List list = (List) obj7;
                List<mk2> list2 = (List) obj6;
                bw4 bw4Var = (bw4) obj5;
                sj2 sj2Var = (sj2) obj4;
                bw4 bw4Var2 = (bw4) obj3;
                ob3 ob3Var = (ob3) obj2;
                es2 es2Var2 = (es2) obj;
                es2Var2.getClass();
                es2.G(es2Var2, null, jz5.v, 3);
                if (!((List) bw4Var.getValue()).isEmpty()) {
                    es2Var2.I(null, null, jz5.l);
                }
                List list3 = (List) bw4Var.getValue();
                m92 m92Var = new m92((byte) 2);
                int size = list3.size();
                sd sdVar = new sd(m92Var, list3, (byte) 5);
                wk0 wk0Var = new wk0(list3, (byte) 5);
                xy1 xy1Var4 = this.t;
                es2Var2.H(size, sdVar, wk0Var, new nm0(802480018, true, new c71(list3, xy1Var4, sj2Var, bw4Var2, bw4Var, (byte) 2)));
                es2Var2.I(null, null, jz5.t);
                es2Var2.H(list.size(), null, new wk0(list, (byte) 6), new nm0(802480018, true, new hj2(list, xy1Var4, ob3Var)));
                if (!yf2.p((String) bw4Var2.getValue(), "en-t-k0-windows")) {
                    es2Var2.I(null, null, jz5.m);
                    es2.G(es2Var2, null, new nm0(1013504455, true, new s61(xy1Var4, (byte) 1)), 3);
                }
                es2Var2.I(null, null, jz5.c);
                for (mk2 mk2Var : list2) {
                    String str = mk2Var.g;
                    es2.G(es2Var2, str, new nm0(-672957690, true, new cv0(str, mk2Var.y, xy1Var4, ob3Var)), 2);
                }
                return og5Var;
        }
    }
}

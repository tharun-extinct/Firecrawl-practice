package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class rc implements gr1 {
    public final /* synthetic */ byte j;
    public final /* synthetic */ Object t;

    public /* synthetic */ rc(Object obj, byte b) {
        this.j = b;
        this.t = obj;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        Object objI;
        Object value;
        p04 p04VarZ;
        r04 r04Var;
        byte b = this.j;
        px0 px0Var = px0.j;
        og5 og5Var = og5.g;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                cd2 cd2Var = (cd2) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    cd2Var.i().startStylusHandwriting((View) cd2Var.t);
                }
                return og5Var;
            case 1:
                ((ga1) obj2).g.e(Math.min(((sv) obj).r + 0.2f, 1.0f));
                return og5Var;
            case 2:
                x83 x83Var = (x83) obj;
                gy gyVar = (gy) obj2;
                return (gyVar.o0 || (objI = gyVar.T().i(x83Var.g, x83Var.y, mu0Var)) != px0Var) ? og5Var : objI;
            case 3:
                q04 q04Var = (q04) obj;
                ew4 ew4Var = ((yv0) obj2).v;
                do {
                    value = ew4Var.getValue();
                } while (!ew4Var.t(value, tv0.g((tv0) value, q04Var, null, null, null, null, false, 14)));
                return og5Var;
            case 4:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) obj2).edit();
                if (obj instanceof Float) {
                    editorEdit.putFloat("mouse_jiggle_mode", ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit.putInt("mouse_jiggle_mode", ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong("mouse_jiggle_mode", ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean("mouse_jiggle_mode", ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit.putString("mouse_jiggle_mode", (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit.putStringSet("mouse_jiggle_mode", (Set) obj);
                }
                editorEdit.apply();
                return og5Var;
            case 5:
                Object objR = ((ez3) obj2).q.r(mu0Var, obj);
                return objR == px0Var ? objR : og5Var;
            case 6:
                ((u54) obj2).j = obj;
                throw new r(this);
            case 7:
                q04 q04Var2 = ((vl2) obj).g;
                if (q04Var2 != null) {
                    tl2 tl2Var = (tl2) obj2;
                    rw1 rw1Var = tl2Var.B;
                    yk ykVar = rw1Var == null ? null : rw1Var.f;
                    ykVar.getClass();
                    no5 no5VarB = ykVar.b();
                    if (no5VarB != null) {
                        String strI = q04Var2.q;
                        if (tx4.Y(strI)) {
                            strI = tl2Var.i(R.string.control_custom);
                        }
                        oa5 oa5Var = (oa5) no5VarB.v;
                        oa5Var.t = strI;
                        if ((oa5Var.y & 8) != 0) {
                            oa5Var.g.setSubtitle(strI);
                        }
                    }
                    RecyclerView recyclerView = tl2Var.p0;
                    if (recyclerView == null) {
                        yf2.Y("recyclerView");
                        throw null;
                    }
                    if (recyclerView.getLayoutManager() == null) {
                        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager((yk5) tl2Var.m());
                        flexboxLayoutManager.h1(q04Var2.z().m);
                        flexboxLayoutManager.i1(q04Var2.z().i);
                        int i = q04Var2.z().q;
                        if (flexboxLayoutManager.d != i) {
                            flexboxLayoutManager.d = i;
                            flexboxLayoutManager.B0();
                        }
                        flexboxLayoutManager.g1(q04Var2.z().w);
                        RecyclerView recyclerView2 = tl2Var.p0;
                        if (recyclerView2 == null) {
                            yf2.Y("recyclerView");
                            throw null;
                        }
                        recyclerView2.setLayoutManager(flexboxLayoutManager);
                    }
                    r04[] r04VarArr = q04Var2.z().a;
                    r04VarArr.getClass();
                    r04 r04Var2 = (r04) pr.a0(tl2Var.y0, r04VarArr);
                    if (r04Var2 == null || (p04VarZ = r04Var2.k()) == null) {
                        p04VarZ = q04Var2.z();
                    }
                    p04VarZ.getClass();
                    wk2 wk2Var = new wk2(p04VarZ, new cd2((byte) 14, p04VarZ, tl2Var, false));
                    wg2 wg2Var = tl2Var.v0;
                    if (wg2Var != null) {
                        wg2Var.l(null);
                    }
                    wg2 wg2Var2 = new wg2(new ld1(wk2Var));
                    tl2Var.v0 = wg2Var2;
                    wk2Var.x = wg2Var2;
                    RecyclerView recyclerView3 = tl2Var.p0;
                    if (recyclerView3 == null) {
                        yf2.Y("recyclerView");
                        throw null;
                    }
                    recyclerView3.setAdapter(wk2Var);
                    wg2 wg2Var3 = tl2Var.v0;
                    if (wg2Var3 != null) {
                        RecyclerView recyclerView4 = tl2Var.p0;
                        if (recyclerView4 == null) {
                            yf2.Y("recyclerView");
                            throw null;
                        }
                        wg2Var3.l(recyclerView4);
                    }
                    fa4 fa4Var = new fa4(p04VarZ, (byte) 17);
                    RecyclerView recyclerView5 = tl2Var.p0;
                    if (recyclerView5 == null) {
                        yf2.Y("recyclerView");
                        throw null;
                    }
                    p8 p8Var = new p8(recyclerView5, fa4Var, (ql2) tl2Var.s0.getValue(), new aj6((byte) 28));
                    ui4 ui4Var = new ui4((byte) 1);
                    p8Var.v = ui4Var;
                    Object obj3 = p8Var.l;
                    fa4 fa4Var2 = (fa4) obj3;
                    d31 d31Var = new d31(fa4Var2, ui4Var, (aj6) p8Var.n);
                    p44 p44Var = (p44) p8Var.y;
                    RecyclerView recyclerView6 = (RecyclerView) p8Var.g;
                    Objects.requireNonNull(recyclerView6);
                    ArrayList arrayList = recyclerView6.k;
                    new al1(d31Var, fa4Var2, p44Var, new wi4(recyclerView6));
                    p44Var.g.registerObserver(d31Var.x);
                    gw4 gw4Var = new gw4(new k12(recyclerView6, false));
                    j12 j12Var = new j12();
                    GestureDetector gestureDetector = new GestureDetector((Context) p8Var.r, j12Var);
                    ui4 ui4Var2 = (ui4) p8Var.v;
                    Object obj4 = p8Var.x;
                    l12 l12Var = new l12(d31Var, ui4Var2, new k12(recyclerView6), gw4Var, (m46) obj4);
                    fa1 fa1Var = new fa1();
                    fa1 fa1Var2 = new fa1(gestureDetector, (byte) 2);
                    fa1 fa1Var3 = new fa1();
                    zk1 zk1Var = new zk1();
                    fa1 fa1Var4 = new fa1(zk1Var, (byte) 0);
                    fa1Var3.x(new fa5(0), fa1Var4);
                    arrayList.add(fa1Var);
                    arrayList.add(fa1Var2);
                    arrayList.add(fa1Var3);
                    q70 q70Var = new q70((byte) 9);
                    rl2 rl2Var = (rl2) q70Var.m;
                    ArrayList arrayList2 = d31Var.y;
                    arrayList2.add(rl2Var);
                    fa1Var.x(new fa5(0), (sg2) q70Var.a);
                    q70Var.u(d31Var);
                    q70Var.u((dm3) ((m46) obj4).r);
                    q70Var.u(l12Var);
                    q70Var.u(fa1Var2);
                    q70Var.u(fa1Var);
                    q70Var.u(fa1Var3);
                    q70Var.u(zk1Var);
                    q70Var.u(fa1Var4);
                    t32 t32Var = (t32) p8Var.m;
                    byte b2 = 27;
                    if (t32Var == null) {
                        t32Var = new t32((byte) 27);
                    }
                    p8Var.m = t32Var;
                    bi6 bi6Var = (bi6) p8Var.a;
                    if (bi6Var == null) {
                        bi6Var = new bi6(b2);
                    }
                    p8Var.a = bi6Var;
                    aj6 aj6Var = (aj6) p8Var.q;
                    if (aj6Var == null) {
                        aj6Var = new aj6((byte) 27);
                    }
                    p8Var.q = aj6Var;
                    Object obj5 = p8Var.j;
                    ui4 ui4Var3 = (ui4) p8Var.v;
                    j4 j4Var = new j4(l12Var, (byte) 10);
                    t32 t32Var2 = (t32) p8Var.m;
                    bi6 bi6Var2 = (bi6) p8Var.a;
                    Object obj6 = p8Var.t;
                    fb5 fb5Var = new fb5(d31Var, (fa4) obj3, (ql2) obj5, ui4Var3, j4Var, t32Var2, bi6Var2, (bi6) obj6, new ml(p8Var, (byte) 10), new j4(zk1Var, (byte) 11));
                    int[] iArr = (int[]) p8Var.w;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        cd2 cd2Var2 = j12Var.g;
                        if (i2 < length) {
                            j12 j12Var2 = j12Var;
                            fa5 fa5Var = new fa5(iArr[i2]);
                            ((HashMap) cd2Var2.t).put(fa5Var, fb5Var);
                            fa1Var.x(fa5Var, l12Var);
                            i2++;
                            j12Var = j12Var2;
                        } else {
                            k83 k83Var = new k83(d31Var, (fa4) obj3, (ql2) obj5, (aj6) p8Var.q, (bi6) p8Var.a, (bi6) obj6);
                            for (int i3 : (int[]) p8Var.c) {
                                ((HashMap) cd2Var2.t).put(new fa5(i3), k83Var);
                            }
                            fa5 fa5Var2 = new fa5(1, 8194);
                            ((HashMap) cd2Var2.t).put(fa5Var2, k83Var);
                            iu3 iu3Var = new iu3((ql2) obj5, (t32) p8Var.m, null);
                            fa1Var.x(new fa5(3), iu3Var);
                            fa1Var.x(fa5Var2, iu3Var);
                            rl2 rl2Var2 = tl2Var.w0;
                            xs2.l(rl2Var2 != null);
                            arrayList2.add(rl2Var2);
                            wk2Var.v = d31Var;
                            xl2 xl2Var = tl2Var.o0;
                            if (xl2Var != null && (r04Var = xl2Var.j) != null) {
                                d31Var.m(Long.valueOf(r04Var.m));
                            }
                        }
                    }
                }
                return og5Var;
            case 8:
                kw3 kw3Var = (kw3) obj2;
                float fG = jw3.g.g(((sv) obj).r);
                kw3Var.getClass();
                kw3Var.y.e(lr2.e(1.0f, 0.95f, fG));
                kw3Var.r.e(lr2.e(0.0f, kw3Var.g, fG));
                return og5Var;
            default:
                ue2 ue2Var = (ue2) obj;
                qp3 qp3Var = (qp3) obj2;
                if ((ue2Var instanceof mx3) || (ue2Var instanceof gt1)) {
                    qp3Var.e(qp3Var.d() + 1);
                } else if ((ue2Var instanceof nx3) || (ue2Var instanceof ht1) || (ue2Var instanceof lx3)) {
                    qp3Var.e(qp3Var.d() - 1);
                }
                return og5Var;
        }
    }
}

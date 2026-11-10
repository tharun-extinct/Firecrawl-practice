package defpackage;

import android.util.Log;
import io.appground.blek.data.room.AppDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class xl2 extends pl5 {
    public r04 j;
    public byte[] l;
    public final wh4 n;
    public final tg1 r;
    public Integer t;
    public final ew4 v;
    public final f34 x;
    public final el2 y;

    public xl2(el2 el2Var, tg1 tg1Var, wh4 wh4Var) {
        el2Var.getClass();
        tg1Var.getClass();
        wh4Var.getClass();
        this.y = el2Var;
        this.r = tg1Var;
        this.n = wh4Var;
        ew4 ew4VarW = y94.w(new vl2(null, 0));
        this.v = ew4VarW;
        this.x = pw5.j(ew4VarW);
        Log.d("LayoutEditViewModel", "init");
    }

    public final void j(q04 q04Var) {
        ew4 ew4Var;
        Object value;
        p04 p04VarZ = q04Var.z();
        if (p04VarZ != null) {
            r04[] r04VarArr = p04VarZ.a;
            r04VarArr.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                if (!(i < r04VarArr.length)) {
                    break;
                }
                int i2 = i + 1;
                try {
                    Integer numValueOf = Integer.valueOf(r04VarArr[i].m);
                    Object s54Var = linkedHashMap.get(numValueOf);
                    if (s54Var == null && !linkedHashMap.containsKey(numValueOf)) {
                        s54Var = new s54();
                    }
                    s54 s54Var2 = (s54) s54Var;
                    s54Var2.j++;
                    linkedHashMap.put(numValueOf, s54Var2);
                    i = i2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    l0.s(e.getMessage());
                    return;
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                entry.getClass();
                if ((entry instanceof vh2) && !(entry instanceof xh2)) {
                    ue5.t0(entry, "kotlin.collections.MutableMap.MutableEntry");
                    throw null;
                }
                entry.setValue(Integer.valueOf(((s54) entry.getValue()).j));
            }
            Map mapO = ue5.o(linkedHashMap);
            if (!mapO.isEmpty()) {
                Iterator it = mapO.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 1) {
                        r04[] r04VarArr2 = p04VarZ.a;
                        r04VarArr2.getClass();
                        ArrayList arrayListK0 = pr.k0(r04VarArr2);
                        int size = arrayListK0.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayListK0.get(i4);
                            i4++;
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                pw5.R();
                                throw null;
                            }
                            ((r04) obj).m = i5;
                            i3 = i5;
                        }
                        p04VarZ.a = (r04[]) arrayListK0.toArray(new r04[0]);
                        break;
                    }
                }
            }
        }
        this.l = np3.t(q04Var);
        do {
            ew4Var = this.v;
            value = ew4Var.getValue();
        } while (!ew4Var.t(value, new vl2(q04Var, ((vl2) value).y + 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(ou0 ou0Var) {
        wl2 wl2Var;
        Integer num;
        q04 q04Var;
        if (ou0Var instanceof wl2) {
            wl2Var = (wl2) ou0Var;
            int i = wl2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wl2Var.c = i - Integer.MIN_VALUE;
            } else {
                wl2Var = new wl2(this, ou0Var);
            }
        } else {
            wl2Var = new wl2(this, ou0Var);
        }
        Object obj = wl2Var.q;
        int i2 = wl2Var.c;
        og5 og5Var = og5.g;
        if (i2 == 0) {
            js2.o(obj);
            q04 q04Var2 = ((vl2) this.v.getValue()).g;
            if (q04Var2 != null && (num = this.t) != null) {
                int iIntValue = num.intValue();
                wl2Var.m = q04Var2;
                wl2Var.c = 1;
                el2 el2VarZ = ((AppDatabase) this.n.j).z();
                String str = q04Var2.q;
                Object objF = pw5.F(wl2Var, new h22(iIntValue, tx4.Y(str) ? null : str, np3.t(q04Var2)), el2VarZ.g, false, true);
                px0 px0Var = px0.j;
                if (objF != px0Var) {
                    objF = og5Var;
                }
                if (objF != px0Var) {
                    objF = og5Var;
                }
                if (objF == px0Var) {
                    return px0Var;
                }
                q04Var = q04Var2;
            }
            return og5Var;
        }
        if (i2 != 1) {
            l0.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q04Var = wl2Var.m;
        js2.o(obj);
        q04Var.getClass();
        this.l = np3.t(q04Var);
        return og5Var;
    }

    public final void v(r04 r04Var) {
        ew4 ew4Var;
        Object value;
        vl2 vl2Var;
        Integer num;
        do {
            ew4Var = this.v;
            value = ew4Var.getValue();
            vl2Var = (vl2) value;
            q04 q04Var = vl2Var.g;
            if (q04Var != null) {
                p04 p04VarZ = q04Var.z();
                r04[] r04VarArr = p04VarZ.a;
                r04VarArr.getClass();
                Iterator it = pr.j0(r04VarArr).iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((r04) it.next()).m);
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((r04) it.next()).m);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                r04Var.m = (num != null ? num.intValue() : 0) + 1;
                r04[] r04VarArr2 = p04VarZ.a;
                r04VarArr2.getClass();
                ArrayList arrayListK0 = pr.k0(r04VarArr2);
                arrayListK0.add(r04Var);
                p04VarZ.a = (r04[]) arrayListK0.toArray(new r04[0]);
                q04Var.t = (byte) 6;
                q04Var.a = p04VarZ;
            }
        } while (!ew4Var.t(value, new vl2(vl2Var.g, vl2Var.y + 1)));
    }

    public final f34 x() {
        return this.x;
    }
}

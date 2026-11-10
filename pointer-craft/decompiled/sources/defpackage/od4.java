package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od4 implements bz1 {
    public final /* synthetic */ byte j;

    public /* synthetic */ od4(byte b) {
        this.j = b;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        byte b = this.j;
        og5 og5Var = og5.g;
        switch (b) {
            case 0:
                return ((wh5) obj2).g();
            case 1:
                pc4 pc4Var = (pc4) obj;
                ju4 ju4Var = (ju4) obj2;
                jj0 jj0Var = new jj0(ju4Var.g.y());
                pd4 pd4Var = qd4.b;
                Object objG = qd4.g(jj0Var, pd4Var, pc4Var);
                n85 n85Var = new n85(ju4Var.y);
                pd4 pd4Var2 = qd4.o;
                Object objG2 = qd4.g(n85Var, pd4Var2, pc4Var);
                qv1 qv1Var = ju4Var.r;
                qv1 qv1Var2 = qv1.t;
                Object objG3 = qd4.g(qv1Var, qd4.w, pc4Var);
                Object objG4 = qd4.g(ju4Var.n, qd4.z, pc4Var);
                Object objG5 = qd4.g(ju4Var.v, qd4.h, pc4Var);
                String str = ju4Var.l;
                Object objG6 = qd4.g(new n85(ju4Var.j), pd4Var2, pc4Var);
                Object objG7 = qd4.g(ju4Var.t, qd4.c, pc4Var);
                Object objG8 = qd4.g(ju4Var.a, qd4.m, pc4Var);
                tx2 tx2Var = ju4Var.m;
                tx2 tx2Var2 = tx2.a;
                Object objG9 = qd4.g(tx2Var, qd4.d, pc4Var);
                Object objG10 = qd4.g(new jj0(ju4Var.q), pd4Var, pc4Var);
                Object objG11 = qd4.g(ju4Var.w, qd4.a, pc4Var);
                ym4 ym4Var = ju4Var.c;
                ym4 ym4Var2 = ym4.n;
                return pw5.l(objG, objG2, objG3, objG4, objG5, -1, str, objG6, objG7, objG8, objG9, objG10, objG11, qd4.g(ym4Var, qd4.i, pc4Var));
            case 2:
                pc4 pc4Var2 = (pc4) obj;
                p75 p75Var = (p75) obj2;
                ju4 ju4Var2 = p75Var.g;
                ji jiVar = qd4.j;
                return pw5.l(qd4.g(ju4Var2, jiVar, pc4Var2), qd4.g(p75Var.y, jiVar, pc4Var2), qd4.g(p75Var.r, jiVar, pc4Var2), qd4.g(p75Var.n, jiVar, pc4Var2));
            case 3:
                return Integer.valueOf(((rf4) obj2).g.d());
            case 4:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = pi1.j;
                }
                return cj0.w0(collection, list);
            case 5:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 6:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 9:
                return (o94) obj;
            case 10:
                return (String) obj;
            case zo2.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return (og5) obj;
            case 12:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 13:
                return (cn4) obj;
            case 14:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case kq2.x /* 15 */:
                return (bu0) obj;
            case 16:
                return (za) obj;
            case 17:
                return (jo1) obj;
            case 18:
                return obj == null ? obj2 : obj;
            case 19:
                ((gh1) obj).r = ((yb1) obj2).g;
                return og5Var;
            case 20:
                ((gh1) obj).n = (pq4) obj2;
                return og5Var;
            case 21:
                dx0 dx0Var = (dx0) obj2;
                if (!(dx0Var instanceof u85)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? dx0Var : Integer.valueOf(iIntValue + 1);
            case 22:
                u85 u85Var = (u85) obj;
                dx0 dx0Var2 = (dx0) obj2;
                if (u85Var != null) {
                    return u85Var;
                }
                if (dx0Var2 instanceof u85) {
                    return (u85) dx0Var2;
                }
                return null;
            case 23:
                a95 a95Var = (a95) obj;
                dx0 dx0Var3 = (dx0) obj2;
                if (dx0Var3 instanceof u85) {
                    u85 u85Var2 = (u85) dx0Var3;
                    fx0 fx0Var = a95Var.g;
                    a95Var.g(u85Var2, u85Var2.t());
                }
                return a95Var;
            default:
                tg1.i.a(obj);
                return og5Var;
        }
    }
}

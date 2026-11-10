package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import io.appground.blek.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ip2 {
    public static final Map g = v13.o(new fp3(np2.m, Integer.valueOf(R.layout.glance_text)), new fp3(np2.q, Integer.valueOf(R.layout.glance_list)), new fp3(np2.w, Integer.valueOf(R.layout.glance_check_box)), new fp3(np2.c, Integer.valueOf(R.layout.glance_check_box_backport)), new fp3(np2.i, Integer.valueOf(R.layout.glance_button)), new fp3(np2.d, Integer.valueOf(R.layout.glance_swtch)), new fp3(np2.e, Integer.valueOf(R.layout.glance_swtch_backport)), new fp3(np2.b, Integer.valueOf(R.layout.glance_frame)), new fp3(np2.A, Integer.valueOf(R.layout.glance_image_crop)), new fp3(np2.D, Integer.valueOf(R.layout.glance_image_crop_decorative)), new fp3(np2.B, Integer.valueOf(R.layout.glance_image_fit)), new fp3(np2.E, Integer.valueOf(R.layout.glance_image_fit_decorative)), new fp3(np2.C, Integer.valueOf(R.layout.glance_image_fill_bounds)), new fp3(np2.F, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new fp3(np2.s, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new fp3(np2.p, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new fp3(np2.u, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new fp3(np2.z, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new fp3(np2.h, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new fp3(np2.o, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new fp3(np2.f, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new fp3(np2.k, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new fp3(np2.G, Integer.valueOf(R.layout.glance_radio_button)), new fp3(np2.H, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int r;
    public static final int y;

    static {
        int size = u02.x.size();
        y = size;
        r = Build.VERSION.SDK_INT >= 31 ? u02.j : u02.j / size;
    }

    public static final t64 g(ad5 ad5Var, o22 o22Var, int i) {
        Map mapSingletonMap;
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        Context context = ad5Var.g;
        int i2 = Build.VERSION.SDK_INT;
        jp2 jp2Var = jp2.j;
        if (i2 >= 31) {
            short s = u02.j;
            if (i >= s) {
                l0.t(du4.m(s, i, "Index of the root view cannot be more than ", ", currently "));
                return null;
            }
            rq4 rq4Var = new rq4(jp2Var, jp2Var);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), u02.l + i);
            go5 go5Var = (go5) o22Var.g(cn0.z, null);
            if (go5Var != null) {
                m50.B(context, remoteViews, go5Var, R.id.rootView);
            }
            k52 k52Var = (k52) o22Var.g(cn0.h, null);
            if (k52Var != null) {
                m50.A(context, remoteViews, k52Var, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                mapSingletonMap = qi1.j;
            } else {
                Map mapSingletonMap2 = Collections.singletonMap(rq4Var, numValueOf);
                mapSingletonMap2.getClass();
                mapSingletonMap = Collections.singletonMap(0, mapSingletonMap2);
                mapSingletonMap.getClass();
            }
            return new t64(remoteViews, new kd2(R.id.rootView, 0, mapSingletonMap, 2));
        }
        int i3 = y * i;
        short s2 = u02.j;
        if (i3 >= s2) {
            uo1.v(s2 / 4, i, ", currently ", "Index of the root view cannot be more than ");
            return null;
        }
        go5 go5Var2 = (go5) o22Var.g(pm0.b, null);
        x91 x91VarV = w91.g;
        x91 x91VarV2 = go5Var2 != null ? v(go5Var2.g, context) : x91VarV;
        k52 k52Var2 = (k52) o22Var.g(pm0.s, null);
        if (k52Var2 != null) {
            x91VarV = v(k52Var2.g, context);
        }
        u91 u91Var = u91.g;
        boolean zEquals = x91VarV2.equals(u91Var);
        jp2 jp2Var2 = jp2.m;
        jp2 jp2Var3 = zEquals ? jp2Var2 : jp2Var;
        if (!x91VarV.equals(u91Var)) {
            jp2Var2 = jp2Var;
        }
        jp2 jp2Var4 = jp2.t;
        jp2 jp2Var5 = jp2Var3 == jp2Var4 ? jp2Var : jp2Var3;
        if (jp2Var2 != jp2Var4) {
            jp2Var = jp2Var2;
        }
        rq4 rq4Var2 = new rq4(jp2Var5, jp2Var);
        Integer num = (Integer) u02.x.get(rq4Var2);
        if (num != null) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i3 + u02.l + num.intValue());
            Map mapSingletonMap3 = Collections.singletonMap(rq4Var2, numValueOf);
            mapSingletonMap3.getClass();
            Map mapSingletonMap4 = Collections.singletonMap(0, mapSingletonMap3);
            mapSingletonMap4.getClass();
            return new t64(remoteViews2, new kd2(0, 0, mapSingletonMap4, 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + jp2Var3 + ", " + jp2Var2 + ']');
    }

    public static final jp2 j(x91 x91Var) {
        if (x91Var instanceof w91) {
            return jp2.j;
        }
        if (x91Var instanceof t91) {
            return jp2.a;
        }
        if (x91Var instanceof u91) {
            return jp2.m;
        }
        if ((x91Var instanceof s91) || (x91Var instanceof v91)) {
            return jp2.t;
        }
        uo1.g();
        return null;
    }

    public static final Integer l(np2 np2Var, o22 o22Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            c7 c7Var = (c7) o22Var.g(cn0.k, null);
            go5 go5Var = (go5) o22Var.g(cn0.d, null);
            t91 t91Var = t91.g;
            boolean zEquals = go5Var != null ? go5Var.g.equals(t91Var) : false;
            k52 k52Var = (k52) o22Var.g(cn0.e, null);
            boolean zEquals2 = k52Var != null ? k52Var.g.equals(t91Var) : false;
            if (c7Var != null) {
                t6 t6Var = c7Var.g;
                dm2 dm2Var = (dm2) u02.r.get(new v50(np2Var, t6Var.g, t6Var.y));
                if (dm2Var != null) {
                    return Integer.valueOf(dm2Var.g);
                }
                l0.w("Cannot find ", np2Var, " with alignment ", t6Var);
                return null;
            }
            if (zEquals || zEquals2) {
                dm2 dm2Var2 = (dm2) u02.n.get(new eb4(np2Var, zEquals, zEquals2));
                if (dm2Var2 != null) {
                    return Integer.valueOf(dm2Var2.g);
                }
                t94.r(np2Var, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final kd2 n(RemoteViews remoteViews, ad5 ad5Var, int i, o22 o22Var) {
        Integer numValueOf;
        int iIntValue;
        int i2 = ad5Var.v;
        Context context = ad5Var.g;
        go5 go5Var = (go5) o22Var.g(cn0.o, null);
        x91 x91Var = w91.g;
        x91 x91Var2 = go5Var != null ? go5Var.g : x91Var;
        k52 k52Var = (k52) o22Var.g(cn0.f, null);
        if (k52Var != null) {
            x91Var = k52Var.g;
        }
        if (o22Var.y(new q21((byte) 22))) {
            numValueOf = null;
        } else {
            if (ad5Var.t.getAndSet(true)) {
                l0.z("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int iIncrementAndGet = ad5Var.l.incrementAndGet();
                if (iIncrementAndGet >= u02.a) {
                    l0.z("There are too many views");
                    return null;
                }
                iIntValue = iIncrementAndGet + u02.t;
            }
            RemoteViews remoteViewsN = nq.n(i, iIntValue, context.getPackageName());
            int i4 = ad5Var.j.g;
            if (i3 >= 31) {
                nq.g(remoteViews, i4, remoteViewsN, i2);
            } else {
                remoteViews.addView(i4, remoteViewsN);
            }
            return new kd2(iIntValue, 0, null, 6);
        }
        if (i3 >= 31) {
            t91 t91Var = t91.g;
            boolean zEquals = x91Var2.equals(t91Var);
            jp2 jp2Var = jp2.j;
            jp2 jp2Var2 = jp2.a;
            jp2 jp2Var3 = zEquals ? jp2Var2 : jp2Var;
            if (x91Var.equals(t91Var)) {
                jp2Var = jp2Var2;
            }
            return new kd2(v13.s(remoteViews, ad5Var, x(remoteViews, ad5Var, i2, jp2Var3, jp2Var), i, numValueOf), 0, null, 6);
        }
        jp2 jp2VarJ = j(v(x91Var2, context));
        jp2 jp2VarJ2 = j(v(x91Var, context));
        int iX = x(remoteViews, ad5Var, i2, jp2VarJ, jp2VarJ2);
        jp2 jp2Var4 = jp2.t;
        if (jp2VarJ != jp2Var4 && jp2VarJ2 != jp2Var4) {
            return new kd2(v13.s(remoteViews, ad5Var, iX, i, numValueOf), 0, null, 6);
        }
        dm2 dm2Var = (dm2) u02.v.get(new rq4(jp2VarJ, jp2VarJ2));
        if (dm2Var != null) {
            return new kd2(v13.s(remoteViews, ad5Var, R.id.glanceViewStub, i, numValueOf), v13.s(remoteViews, ad5Var, iX, dm2Var.g, null), null, 4);
        }
        l0.w("Could not find complex layout for width=", jp2VarJ, ", height=", jp2VarJ2);
        return null;
    }

    public static final kd2 r(RemoteViews remoteViews, ad5 ad5Var, np2 np2Var, o22 o22Var) {
        Integer numL = l(np2Var, o22Var);
        if (numL != null || (numL = (Integer) g.get(np2Var)) != null) {
            return n(remoteViews, ad5Var, numL.intValue(), o22Var);
        }
        l0.m(np2Var, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final x91 v(x91 x91Var, Context context) {
        if (!(x91Var instanceof v91)) {
            return x91Var;
        }
        float dimension = context.getResources().getDimension(((v91) x91Var).g);
        int i = (int) dimension;
        if (i != -2) {
            return i != -1 ? new s91(dimension / context.getResources().getDisplayMetrics().density) : u91.g;
        }
        return w91.g;
    }

    public static final int x(RemoteViews remoteViews, ad5 ad5Var, int i, jp2 jp2Var, jp2 jp2Var2) {
        jp2 jp2Var3 = jp2.j;
        jp2 jp2Var4 = jp2.t;
        jp2 jp2Var5 = jp2Var == jp2Var4 ? jp2Var3 : jp2Var;
        if (jp2Var2 != jp2Var4) {
            jp2Var3 = jp2Var2;
        }
        rq4 rq4Var = new rq4(jp2Var5, jp2Var3);
        Map map = (Map) ad5Var.j.r.get(Integer.valueOf(i));
        int i2 = 0;
        if (map == null) {
            l0.z(xi3.j("Parent doesn't have child position ", i));
            return 0;
        }
        Integer num = (Integer) map.get(rq4Var);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + jp2Var + " x " + jp2Var2);
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            v13.s(remoteViews, ad5Var, ((Number) obj2).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    public static final kd2 y(RemoteViews remoteViews, ad5 ad5Var, np2 np2Var, int i, o22 o22Var, q6 q6Var, s6 s6Var) {
        int iIntValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + np2Var + " container from " + i + " to 10 elements", new IllegalArgumentException(np2Var + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer numL = l(np2Var, o22Var);
        if (numL != null) {
            iIntValue = numL.intValue();
        } else {
            gt0 gt0Var = (gt0) u02.g.get(new ht0(np2Var, i2, q6Var, s6Var));
            Integer numValueOf = gt0Var != null ? Integer.valueOf(gt0Var.g) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + np2Var + " with " + i + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) u02.y.get(np2Var);
        if (map == null) {
            l0.m(np2Var, "Cannot find generated children for ");
            return null;
        }
        kd2 kd2VarN = n(remoteViews, ad5Var, iIntValue, o22Var);
        int i3 = kd2VarN.g;
        kd2 kd2Var = new kd2(i3, kd2VarN.y, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return kd2Var;
    }
}

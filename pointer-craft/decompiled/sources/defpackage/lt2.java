package defpackage;

import android.content.Context;
import android.graphics.Color;
import io.appground.blek.R;
import io.appground.blek.nano.Proto$ShortcutData;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lt2 extends zz4 implements bz1 {
    public final /* synthetic */ Context b;
    public boolean c;
    public /* synthetic */ Object i;
    public final /* synthetic */ boolean p;
    public File q;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ el2 u;
    public sk2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt2(Context context, boolean z, boolean z2, el2 el2Var, mu0 mu0Var) {
        super(2, mu0Var);
        this.b = context;
        this.s = z;
        this.p = z2;
        this.u = el2Var;
    }

    @Override // defpackage.ix
    public final mu0 b(mu0 mu0Var, Object obj) {
        lt2 lt2Var = new lt2(this.b, this.s, this.p, this.u, mu0Var);
        lt2Var.i = obj;
        return lt2Var;
    }

    @Override // defpackage.bz1
    public final Object l(Object obj, Object obj2) {
        return ((lt2) b((mu0) obj2, (ox0) obj)).u(og5.g);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @Override // defpackage.ix
    public final Object u(Object obj) {
        Object g84Var;
        Object objG;
        sk2 sk2Var;
        File file;
        Object obj2 = pi1.j;
        boolean z = this.c;
        if (!z) {
            js2.o(obj);
            Context context = this.b;
            File file2 = new File(context.getFilesDir(), "shortcuts.proto");
            if (!file2.exists()) {
                return null;
            }
            try {
                byte[] bArrJ0 = ue5.j0(file2);
                if (bArrJ0.length != 0) {
                    Proto$ShortcutData[] proto$ShortcutDataArr = t04.z(bArrJ0).t;
                    g84Var = proto$ShortcutDataArr != null ? pr.j0(proto$ShortcutDataArr) : null;
                    if (g84Var == null) {
                        g84Var = obj2;
                    }
                } else {
                    g84Var = obj2;
                }
            } catch (Throwable th) {
                g84Var = new g84(th);
            }
            if (h84.g(g84Var) == null) {
                obj2 = g84Var;
            }
            List list = (List) obj2;
            if (list.isEmpty()) {
                file2.delete();
                return null;
            }
            ArrayList arrayList = new ArrayList(dj0.Y(list, 10));
            int i = 0;
            for (Object obj3 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    pw5.R();
                    throw null;
                }
                Proto$ShortcutData proto$ShortcutData = (Proto$ShortcutData) obj3;
                String str = proto$ShortcutData.t;
                if (tx4.Y(str)) {
                    str = null;
                }
                if (str == null) {
                    str = proto$ShortcutData.q;
                    if (tx4.Y(str)) {
                        str = null;
                    }
                    if (str == null) {
                        str = "???";
                    }
                }
                r04 r04Var = new r04();
                r04Var.m = i2;
                s04 s04Var = new s04();
                s04Var.a = 1.0f;
                float f = proto$ShortcutData.w;
                if (f > 0.0f) {
                    s04Var.c = f;
                }
                r04Var.q = s04Var;
                o04 o04Var = new o04();
                o04Var.m = str;
                n04 n04Var = new n04();
                l04 l04Var = new l04();
                l04Var.t = proto$ShortcutData.m;
                l04Var.a = false;
                n04Var.t = (byte) 2;
                n04Var.a = l04Var;
                o04Var.t = new n04[]{n04Var};
                r04Var.t = (byte) 2;
                r04Var.a = o04Var;
                arrayList.add(r04Var);
                i = i2;
            }
            q04 q04VarY = rp2.y();
            q04VarY.q = context.getString(R.string.control_shortcuts);
            p04 p04VarZ = q04VarY.z();
            uv2 uv2VarC = pw5.c();
            qi2 qi2Var = qi2.t;
            if (this.s) {
                uv2VarC.add(rp2.r(qi2Var, "Vol-", new int[]{rp2.w}, 0, null, 1.0f, 440));
                uv2VarC.add(rp2.r(qi2Var, "Vol+", new int[]{rp2.q}, 0, null, 1.0f, 440));
                uv2VarC.add(rp2.r(qi2Var, "Mute", new int[]{rp2.m}, 0, null, 1.0f, 440));
                uv2VarC.add(rp2.r(qi2Var, "Play/Pause", new int[]{rp2.a}, 0, null, 1.0f, 440));
            }
            uv2VarC.add(rp2.x());
            Object[] array = arrayList.toArray(new r04[0]);
            array.getClass();
            List listAsList = Arrays.asList(array);
            listAsList.getClass();
            uv2VarC.addAll(listAsList);
            if (this.p) {
                int color = Color.parseColor("#607d8b");
                qi2 qi2Var2 = qi2.j;
                uv2VarC.add(rp2.r(qi2Var2, "Back", new int[]{4}, color, null, 1.0f, 296));
                uv2VarC.add(rp2.r(qi2Var, "Home", new int[]{rp2.c}, Color.parseColor("#607d8b"), null, 1.0f, 424));
                uv2VarC.add(rp2.r(qi2Var2, "Recents", new int[]{117, 61}, Color.parseColor("#607d8b"), null, 1.0f, 424));
            }
            p04VarZ.a = (r04[]) pw5.a(uv2VarC).toArray(new r04[0]);
            q04VarY.t = (byte) 6;
            q04VarY.a = p04VarZ;
            sk2 sk2VarF = a11.F(q04VarY, 3);
            this.i = null;
            this.q = file2;
            this.w = sk2VarF;
            this.c = true;
            objG = this.u.g(new sk2[]{sk2VarF}, this);
            px0 px0Var = px0.j;
            if (objG == px0Var) {
                return px0Var;
            }
            sk2Var = sk2VarF;
            file = file2;
        } else {
            if (!z) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sk2 sk2Var2 = this.w;
            File file3 = this.q;
            js2.o(obj);
            sk2Var = sk2Var2;
            file = file3;
            objG = obj;
        }
        Long l = (Long) cj0.l0((List) objG);
        file.delete();
        if (l != null) {
            return sk2.g(sk2Var, (int) l.longValue(), null, null, null, null, null, 254);
        }
        return null;
    }
}

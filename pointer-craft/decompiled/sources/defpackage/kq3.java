package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class kq3 {
    public final ArrayList g;

    public kq3(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new hz3(jSONObjectOptJSONObject));
                }
            }
        }
        this.g = arrayList;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.g.add(new tq3(f, f2, f3, f4));
    }

    public void g() {
        this.g.add(nq3.r);
    }

    public void j(float f, float f2) {
        this.g.add(new rq3(f, f2));
    }

    public void l(float f, float f2) {
        this.g.add(new yq3(f, f2));
    }

    public void m(float f, float f2, float f3, float f4) {
        this.g.add(new br3(f, f2, f3, f4));
    }

    public void n(float f) {
        this.g.add(new pq3(f));
    }

    public void q(float f) {
        this.g.add(new er3(f));
    }

    public void r(float f, float f2, float f3, float f4, float f5, float f6) {
        this.g.add(new wq3(f, f2, f3, f4, f5, f6));
    }

    public void t(float f, float f2) {
        this.g.add(new zq3(f, f2));
    }

    public void v(float f) {
        this.g.add(new xq3(f));
    }

    public void w(float f) {
        this.g.add(new dr3(f));
    }

    public void x(float f, float f2) {
        this.g.add(new qq3(f, f2));
    }

    public void y(float f, float f2, float f3, float f4, float f5, float f6) {
        this.g.add(new oq3(f, f2, f3, f4, f5, f6));
    }

    public kq3() {
        this.g = new ArrayList(32);
    }
}

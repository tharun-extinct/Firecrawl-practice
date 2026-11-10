package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class th2 implements ki3, ni5 {
    public final boolean g = true;
    public final Map n;
    public final Map r;
    public final ji3 v;
    public final boolean x;
    public final JsonWriter y;

    public th2(Writer writer, Map map, Map map2, ji3 ji3Var, boolean z) {
        this.y = new JsonWriter(writer);
        this.r = map;
        this.n = map2;
        this.v = ji3Var;
        this.x = z;
    }

    @Override // defpackage.ki3
    public final ki3 g(un1 un1Var, Object obj) throws IOException {
        x(obj, un1Var.g);
        return this;
    }

    public final void l() {
        if (this.g) {
            return;
        }
        l0.z("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // defpackage.ki3
    public final ki3 n(un1 un1Var, long j) throws IOException {
        String str = un1Var.g;
        l();
        JsonWriter jsonWriter = this.y;
        jsonWriter.name(str);
        l();
        jsonWriter.value(j);
        return this;
    }

    @Override // defpackage.ni5
    public final ni5 r(boolean z) throws IOException {
        l();
        this.y.value(z);
        return this;
    }

    public final th2 v(Object obj) throws IOException {
        JsonWriter jsonWriter = this.y;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    v(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        x(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new ej1(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ji3 ji3Var = (ji3) this.r.get(obj.getClass());
            if (ji3Var != null) {
                jsonWriter.beginObject();
                ji3Var.g(obj, this);
                jsonWriter.endObject();
                return this;
            }
            mi5 mi5Var = (mi5) this.n.get(obj.getClass());
            if (mi5Var != null) {
                mi5Var.g(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                l();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.v.g(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            l();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                l();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                v(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                v(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final th2 x(Object obj, String str) throws IOException {
        boolean z = this.x;
        JsonWriter jsonWriter = this.y;
        if (z) {
            if (obj == null) {
                return this;
            }
            l();
            jsonWriter.name(str);
            v(obj);
            return this;
        }
        l();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        v(obj);
        return this;
    }

    @Override // defpackage.ni5
    public final ni5 y(String str) throws IOException {
        l();
        this.y.value(str);
        return this;
    }
}

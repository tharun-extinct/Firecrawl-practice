package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class kz2 {
    public final byte g;
    public int n;
    public final tg1 r;
    public int v;
    public int x;
    public final jc2 y;

    /* JADX WARN: Multi-variable type inference failed */
    public kz2(int i) {
        this.g = i;
        if (i <= 0) {
            cf6.l("maxSize <= 0");
            throw null;
        }
        this.y = new jc2((byte) 1);
        this.r = new tg1((byte) 13);
    }

    public Object g(Object obj) {
        return null;
    }

    public final Object n(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (this.r) {
            this.n++;
            objPut = this.y.g.put(obj, obj2);
            if (objPut != null) {
                this.n--;
            }
        }
        if (objPut != null) {
            y(obj, objPut, obj2);
        }
        x(this.g);
        return objPut;
    }

    public final Object r(Object obj) {
        Object objPut;
        synchronized (this.r) {
            Object obj2 = this.y.g.get(obj);
            if (obj2 != null) {
                this.v++;
                return obj2;
            }
            this.x++;
            Object objG = g(obj);
            if (objG == null) {
                return null;
            }
            synchronized (this.r) {
                try {
                    objPut = this.y.g.put(obj, objG);
                    if (objPut != null) {
                        this.y.g.put(obj, objPut);
                    } else {
                        this.n++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                y(obj, objG, objPut);
                return objPut;
            }
            x(this.g);
            return objG;
        }
    }

    public final String toString() {
        String str;
        synchronized (this.r) {
            try {
                int i = this.v;
                int i2 = this.x + i;
                str = "LruCache[maxSize=" + ((int) this.g) + ",hits=" + this.v + ",misses=" + this.x + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final Object v(Object obj) {
        Object objRemove;
        synchronized (this.r) {
            objRemove = this.y.g.remove(obj);
            if (objRemove != null) {
                this.n--;
            }
        }
        if (objRemove != null) {
            y(obj, objRemove, null);
        }
        return objRemove;
    }

    public final void x(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.r) {
                try {
                    if (this.n < 0 || (this.y.g.isEmpty() && this.n != 0)) {
                        break;
                    }
                    if (this.n > i && !this.y.g.isEmpty()) {
                        Set setEntrySet = this.y.g.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) cj0.k0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        jc2 jc2Var = this.y;
                        key.getClass();
                        jc2Var.g.remove(key);
                        int i2 = this.n;
                        value.getClass();
                        this.n = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            y(key, value, null);
        }
        cf6.j("LruCache.sizeOf() is reporting inconsistent results!");
        throw null;
    }

    public void y(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }
}

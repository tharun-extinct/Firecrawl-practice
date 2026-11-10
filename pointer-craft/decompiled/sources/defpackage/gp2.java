package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class gp2 {
    public final zo1 g;

    public gp2(zo1 zo1Var) {
        zo1Var.getClass();
        this.g = zo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, ou0 ou0Var) {
        dp2 dp2Var;
        if (ou0Var instanceof dp2) {
            dp2Var = (dp2) ou0Var;
            int i = dp2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp2Var.w = i - Integer.MIN_VALUE;
            } else {
                dp2Var = new dp2(this, ou0Var);
            }
        } else {
            dp2Var = new dp2(this, ou0Var);
        }
        Object objR = dp2Var.m;
        int i2 = dp2Var.w;
        try {
            if (i2 == 0) {
                js2.o(objR);
                fp3 fp3Var = new fp3("layout", str);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("instance_id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    string.getClass();
                }
                HashMap mapB = v13.b(fp3Var, new fp3("instance", string), new fp3("version_code", new Integer(263)), new fp3("version_name", "6.25.2"));
                zo1 zo1Var = this.g;
                zo1Var.getClass();
                aj6 aj6Var = new aj6((byte) 21);
                nj6 nj6Var = zo1.t.g;
                Executor executor = zo1Var.g;
                nj6 nj6VarV = nj6Var.v(executor, new gc0(zo1Var, aj6Var)).v(executor, new w21(zo1Var, "fetchLayout", mapB, aj6Var));
                dp2Var.w = 1;
                objR = hh6.r(nj6VarV, dp2Var);
                px0 px0Var = px0.j;
                if (objR == px0Var) {
                    return px0Var;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(objR);
            }
            Object obj = ((c92) objR).g;
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                String strValueOf = String.valueOf(map.get("name"));
                byte[] bArrDecode = Base64.decode(String.valueOf(map.get("data")), 0);
                bArrDecode.getClass();
                return new go4(bArrDecode, strValueOf);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object r(sk2 sk2Var, wn4 wn4Var, ou0 ou0Var) {
        fp2 fp2Var;
        String strEncodeToString;
        if (ou0Var instanceof fp2) {
            fp2Var = (fp2) ou0Var;
            int i = fp2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp2Var.w = i - Integer.MIN_VALUE;
            } else {
                fp2Var = new fp2(this, ou0Var);
            }
        } else {
            fp2Var = new fp2(this, ou0Var);
        }
        Object objR = fp2Var.m;
        int i2 = fp2Var.w;
        try {
            if (i2 == 0) {
                js2.o(objR);
                SharedPreferences sharedPreferences = d52.b;
                sharedPreferences.getClass();
                String string = sharedPreferences.getString("instance_id", null);
                if (string == null) {
                    string = UUID.randomUUID().toString();
                    string.getClass();
                }
                fp3 fp3Var = new fp3("instance", string);
                String str = wn4Var.y;
                if (str.length() == 0) {
                    str = sk2Var.y;
                }
                fp3 fp3Var2 = new fp3("name", str);
                fp3 fp3Var3 = new fp3("author", wn4Var.g);
                fp3 fp3Var4 = new fp3("platform", null);
                fp3 fp3Var5 = new fp3("language", wn4Var.r);
                fp3 fp3Var6 = new fp3("parentId", sk2Var.v);
                byte[] bArr = sk2Var.j;
                if (bArr != null) {
                    strEncodeToString = Base64.encodeToString(bArr, 0);
                    strEncodeToString.getClass();
                } else {
                    strEncodeToString = null;
                }
                HashMap mapB = v13.b(fp3Var, fp3Var2, fp3Var3, fp3Var4, fp3Var5, fp3Var6, new fp3("data", strEncodeToString), new fp3("version_code", new Integer(263)), new fp3("version_name", "6.25.2"));
                String str2 = sk2Var.n;
                if (str2 != null) {
                    mapB.put("share_id", str2);
                    mapB.put("upload_key", sk2Var.l);
                }
                zo1 zo1Var = this.g;
                zo1Var.getClass();
                aj6 aj6Var = new aj6((byte) 21);
                nj6 nj6Var = zo1.t.g;
                Executor executor = zo1Var.g;
                nj6 nj6VarV = nj6Var.v(executor, new gc0(zo1Var, aj6Var)).v(executor, new w21(zo1Var, "uploadLayout", mapB, aj6Var));
                fp2Var.w = 1;
                objR = hh6.r(nj6VarV, fp2Var);
                px0 px0Var = px0.j;
                if (objR == px0Var) {
                    return px0Var;
                }
            } else {
                if (i2 != 1) {
                    l0.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js2.o(objR);
            }
            c92 c92Var = (c92) objR;
            if (c92Var == null) {
                return null;
            }
            Object obj = c92Var.g;
            obj.getClass();
            c04 c04Var = c04.y;
            t32 t32Var = c04Var.g;
            di2 di2VarSerializer = qp2.Companion.serializer();
            di2VarSerializer.getClass();
            return (qp2) new d04(c04Var, (Map) obj, di2VarSerializer.r()).n(di2VarSerializer);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(ou0 ou0Var) throws Exception {
        ep2 ep2Var;
        if (ou0Var instanceof ep2) {
            ep2Var = (ep2) ou0Var;
            int i = ep2Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ep2Var.w = i - Integer.MIN_VALUE;
            } else {
                ep2Var = new ep2(this, ou0Var);
            }
        } else {
            ep2Var = new ep2(this, ou0Var);
        }
        Object objR = ep2Var.m;
        int i2 = ep2Var.w;
        if (i2 == 0) {
            js2.o(objR);
            HashMap mapB = v13.b(new fp3("version_code", new Integer(263)), new fp3("version_name", "6.25.2"));
            zo1 zo1Var = this.g;
            zo1Var.getClass();
            aj6 aj6Var = new aj6((byte) 21);
            nj6 nj6Var = zo1.t.g;
            Executor executor = zo1Var.g;
            nj6 nj6VarV = nj6Var.v(executor, new gc0(zo1Var, aj6Var)).v(executor, new w21(zo1Var, "sharedLayouts", mapB, aj6Var));
            ep2Var.w = 1;
            objR = hh6.r(nj6VarV, ep2Var);
            px0 px0Var = px0.j;
            if (objR == px0Var) {
                return px0Var;
            }
        } else {
            if (i2 != 1) {
                l0.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            js2.o(objR);
        }
        Object obj = ((c92) objR).g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}

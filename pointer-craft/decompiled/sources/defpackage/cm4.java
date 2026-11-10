package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class cm4 implements gr1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte j;
    public final /* synthetic */ SharedPreferences t;

    public /* synthetic */ cm4(SharedPreferences sharedPreferences, String str, byte b) {
        this.j = b;
        this.t = sharedPreferences;
        this.a = str;
    }

    @Override // defpackage.gr1
    public final Object c(Object obj, mu0 mu0Var) {
        byte b = this.j;
        og5 og5Var = og5.g;
        SharedPreferences sharedPreferences = this.t;
        String str = this.a;
        switch (b) {
            case 0:
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit.putStringSet(str, (Set) obj);
                }
                editorEdit.apply();
                break;
            case 1:
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit2.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit2.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit2.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit2.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit2.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit2.putStringSet(str, (Set) obj);
                }
                editorEdit2.apply();
                break;
            case 2:
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit3.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit3.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit3.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit3.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit3.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit3.putStringSet(str, (Set) obj);
                }
                editorEdit3.apply();
                break;
            case 3:
                SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit4.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit4.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit4.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit4.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit4.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit4.putStringSet(str, (Set) obj);
                }
                editorEdit4.apply();
                break;
            case 4:
                SharedPreferences.Editor editorEdit5 = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit5.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit5.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit5.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit5.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit5.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit5.putStringSet(str, (Set) obj);
                }
                editorEdit5.apply();
                break;
            default:
                SharedPreferences.Editor editorEdit6 = sharedPreferences.edit();
                if (obj instanceof Float) {
                    editorEdit6.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Integer) {
                    editorEdit6.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    editorEdit6.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit6.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    editorEdit6.putString(str, (String) obj);
                } else if (obj instanceof Set) {
                    editorEdit6.putStringSet(str, (Set) obj);
                }
                editorEdit6.apply();
                break;
        }
        return og5Var;
    }
}

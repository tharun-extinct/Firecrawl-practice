package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class t4 extends pw5 {
    public final /* synthetic */ byte k;

    public /* synthetic */ t4(byte b) {
        this.k = b;
    }

    @Override // defpackage.pw5
    public final Object E(Intent intent, int i) {
        switch (this.k) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                return new r4(intent, i);
            default:
                if (intent == null || i != -1) {
                    return null;
                }
                return intent.getData();
        }
    }

    @Override // defpackage.pw5
    public k2 h(Context context, Object obj) {
        switch (this.k) {
            case 0:
                ((String) obj).getClass();
                return null;
            case 1:
            default:
                return super.h(context, obj);
            case 2:
                ((String) obj).getClass();
                return null;
        }
    }

    @Override // defpackage.pw5
    public final Intent w(Context context, Object obj) {
        switch (this.k) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                type.getClass();
                return type;
            case 1:
                te2 te2Var = (te2) obj;
                te2Var.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", te2Var);
                intentPutExtra.getClass();
                return intentPutExtra;
            default:
                String str2 = (String) obj;
                str2.getClass();
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/octet-stream");
                intent.putExtra("android.intent.extra.TITLE", str2);
                return intent;
        }
    }
}

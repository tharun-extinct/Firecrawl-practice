package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import io.appground.blek.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends pw5 {
    public final /* synthetic */ byte k;

    public /* synthetic */ u4(byte b) {
        this.k = b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    @Override // defpackage.pw5
    public final Object E(Intent intent, int i) {
        Integer numValueOf;
        Serializable g84Var;
        ArrayList<String> stringArrayListExtra;
        boolean z = true;
        switch (this.k) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListW = pr.W(stringArrayExtra);
                        Iterator it = arrayListW.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(dj0.Y(arrayListW, 10), dj0.Y(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new fp3(it.next(), it2.next()));
                        }
                        return v13.I(arrayList2);
                    }
                }
                return qi1.j;
            case 1:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i3 : intArrayExtra2) {
                        if (i3 != 0) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return new r4(intent, i);
            case 3:
                return new r4(intent, i);
            default:
                Integer numValueOf2 = Integer.valueOf(R.string.message_error);
                String str = null;
                switch (i) {
                    case -1:
                        numValueOf = null;
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    case 0:
                        g84Var = new g84(new CancellationException());
                        break;
                    case 1:
                        numValueOf = Integer.valueOf(R.string.message_error_speech_not_matched);
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    case 2:
                        numValueOf = Integer.valueOf(R.string.message_error_speech_client);
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    case 3:
                        numValueOf = Integer.valueOf(R.string.message_error_speech_server);
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    case 4:
                        numValueOf = Integer.valueOf(R.string.message_error_speech_network);
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    case 5:
                        numValueOf = Integer.valueOf(R.string.message_error_speech_audio);
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                    default:
                        numValueOf = numValueOf2;
                        if (numValueOf != null) {
                            g84Var = new g84(new uu4(numValueOf));
                        } else {
                            if (intent != null) {
                                str = stringArrayListExtra.get(0);
                            }
                            if (str != null) {
                                g84Var = str;
                            } else {
                                g84Var = new g84(new uu4(numValueOf2));
                            }
                        }
                        break;
                }
                return new h84(g84Var);
        }
    }

    @Override // defpackage.pw5
    public k2 h(Context context, Object obj) {
        switch (this.k) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new k2(qi1.j);
                }
                for (String str : strArr) {
                    if (ue5.D(context, str) != 0) {
                        return null;
                    }
                }
                int iH = v13.h(strArr.length);
                if (iH < 16) {
                    iH = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new k2(linkedHashMap);
            case 1:
                String str3 = (String) obj;
                str3.getClass();
                if (ue5.D(context, str3) == 0) {
                    return new k2(Boolean.TRUE);
                }
                return null;
            default:
                return super.h(context, obj);
        }
    }

    @Override // defpackage.pw5
    public final Intent w(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.k) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 1:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 2:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case 3:
                te2 te2VarG = (te2) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intentR = te2VarG.r();
                if (intentR != null && (bundleExtra = intentR.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intentR.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intentR.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        hs0 hs0Var = new hs0(te2VarG.t());
                        hs0Var.w(te2VarG.l(), te2VarG.n());
                        te2VarG = hs0Var.g();
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", te2VarG);
                if (kx1.N(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
            default:
                String str2 = (String) obj;
                str2.getClass();
                Intent intent3 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
                return intent3;
        }
    }
}

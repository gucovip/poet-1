package com.github.bpazy.poetry;

import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

/**
 * @author ziyuan
 * created on 2018/3/10
 */
public class PinyinUtil {
    public static String getPinyin(String str) {
        try {
            return PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITHOUT_TONE);
        } catch (PinyinException ignore) {
        }
        return "";
    }
}

package com.github.bpazy.poetry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ziyuan
 * created on 2018/3/9
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Word {
    private String origin;
    private String pinyin;

    public String convert() {
        String value = PropertyUtil.getValue(origin);
        if (StringUtils.isNotEmpty(value)) return value;

        value = PropertyUtil.getValue(pinyin);
        if (StringUtils.isNotEmpty(value)) return value;

        return String.valueOf(pinyin.charAt(0));
    }
}

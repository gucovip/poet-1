package com.github.bpazy.poetry;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * @author ziyuan
 * created on 2018/3/9
 */
@Data
public class Sentence {
    private List<Word> words = Lists.newArrayList();

    public Sentence(String str) {
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            words.add(new Word(s, PinyinUtil.getPinyin(s)));
        }
    }

    public String convert() {
        String wordConverted = words.stream().map(Word::convert).reduce(String::concat).orElse("");
        wordConverted = wordConverted.substring(0, 1).toUpperCase() + wordConverted.substring(1);
        return wordConverted;
    }
}

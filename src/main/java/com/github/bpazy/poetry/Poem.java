package com.github.bpazy.poetry;

import com.google.common.collect.Lists;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by Ziyuan
 * on 2018/3/10
 */
@Data
public class Poem {
    private List<Sentence> sentences = Lists.newArrayList();

    public Poem(String poem) {
        poem = poem.replaceAll("\\s+", "");
        String[] sentences = poem.split("[,，。？?]");
        for (String sentence : sentences) {
            this.sentences.add(new Sentence(sentence));
        }
    }

    public String convert() {
        return this.sentences.stream().map(Sentence::convert).reduce(String::concat).orElse("");
    }
}

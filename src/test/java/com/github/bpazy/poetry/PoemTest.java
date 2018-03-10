package com.github.bpazy.poetry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ziyuan
 * on 2018/3/10
 */
@RunWith(Parameterized.class)
public class PoemTest {
    private String poem;
    private String pwd;

    public PoemTest(String poem, String pwd) {
        this.poem = poem;
        this.pwd = pwd;
    }

    @Parameterized.Parameters
    public static Collection addPoems() {
        return Arrays.asList(
                new String[][]{
//                        {"碧玉妆成一树高，万条垂下绿丝绦。不知细叶谁裁出，二月春风似剪刀。", "Byzc1|gWtc_l~d!zxy?cc2)c~sj("},
                        {"碧玉妆成一树高，万条垂下绿丝绦。不知细叶谁裁出，二月春风似剪刀。", "Byzc1|gWtc_l~t!zxy?cc2)c~4j("},
                        {"两个黄鹂鸣翠柳，一行白鹭上青天。窗含西岭千秋雪，门泊东吴万里船。", "2ghlmcl1hbl^qtChx0qq*Mb}5wlc"},
                        {"清明时节雨纷纷，路上行人欲断魂。借问酒家何处有，牧童遥指杏花村。", "Qm4j~f~6^xrydhJ?9+?cyMtyzxhc"},
                        {"锦城丝管日纷纷，半入江风半入云。此曲只应天上有，人间能得几回闻。", "Jc4g*f~Brj~br~C7zyt^yRjnd?hw"},
                        {"绿蚁新醅酒，红泥小火炉。晚来天欲雪，能饮一杯无？", "#L1xp9Hn<hl#Wlty*Ny1b!"},
                        {"天高云淡，望断南飞雁。不到长城非好汉，屈指行程二万。六盘山上高峰，红旗漫卷西风。今日长缨在手，何时缚住苍龙？", "#Tg~dWd_fy#!dcc!hhQzxc2w#6p3^gfHqmj{~#J*cy@s?4fzc$"},
                        {"好雨知时节， 当春乃发生。随风潜入夜， 润物细无声。野径云俱黑， 江船火独明。晓看红湿处， 花重锦官城。", "#H~z4jDcnfs#S~qryRwx!s#Yj~jhJchdm#Xkh4c*`jgc"},
                        {"梅子黄时日日晴，小溪泛尽却山行。绿阴不减来时路，添得黄鹂四五声。", "#Mzh4*~q<xfjq3x#Ly!-l46Tdhl45s"},
                        {"种豆南山下，草盛豆苗稀。晨兴理荒秽，带月荷锄归。道狭草木长，夕露沾我衣。衣沾不足惜，但使愿无违。", "#Z,_3_Cs,mx#CxlhhD)chg##xcmcX6z51#1z!zxD4y!w"},
                }
        );
    }

    @Test
    public void convert() {
        Poem p = new Poem(poem);
        System.out.println(poem);
        assertEquals(pwd, p.convert());
    }
}
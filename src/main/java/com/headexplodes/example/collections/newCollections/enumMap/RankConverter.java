package com.headexplodes.example.collections.newCollections.enumMap;

import com.headexplodes.example.Job;

public interface RankConverter {

    MilitaryRank toMilitaryRank(Job job);

    Job toPosition(MilitaryRank rank);
}

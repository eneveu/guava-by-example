package com.headexplodes.example.collections.newCollections.enumMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.ImmutableMap;
import com.headexplodes.example.Job;

/**
 * Deliberate typo on Job.DESIGNER:
 * ImmutableMap throws an IllegalArgumentException("duplicate key : DESIGNER")
 */
public class RankConverterUsingBiMapTypo implements RankConverter {

    private BiMap<Job, MilitaryRank> positionToRank = EnumBiMap.create(ImmutableMap.of(
            Job.CEO, MilitaryRank.GENERAL,
            Job.DEVELOPER, MilitaryRank.NINJA,
            Job.DESIGNER, MilitaryRank.NINJA
    ));

    @Override
    public MilitaryRank toMilitaryRank(Job job) {
        return positionToRank.get(job);
    }

    @Override
    public Job toPosition(MilitaryRank rank) {
        return positionToRank.inverse().get(rank);
    }
}

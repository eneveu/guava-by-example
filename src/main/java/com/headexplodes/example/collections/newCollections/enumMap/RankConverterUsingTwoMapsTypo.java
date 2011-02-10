package com.headexplodes.example.collections.newCollections.enumMap;

import com.google.common.collect.Maps;
import com.headexplodes.example.Job;

import java.util.Map;

/**
 * Deliberate typo on Job.DESIGNER: silently fails
 */
public class RankConverterUsingTwoMapsTypo implements RankConverter {

    private Map<Job, MilitaryRank> positionToRank = Maps.newHashMap();
    private Map<MilitaryRank, Job> rankToPosition = Maps.newHashMap();

    {
        putInBothMaps(Job.CEO, MilitaryRank.GENERAL);
        putInBothMaps(Job.DEVELOPER, MilitaryRank.NINJA);
        putInBothMaps(Job.DESIGNER, MilitaryRank.NINJA);
    }

    private void putInBothMaps(Job job, MilitaryRank rank) {
        positionToRank.put(job, rank);
        rankToPosition.put(rank, job);
    }

    @Override
    public MilitaryRank toMilitaryRank(Job job) {
        return positionToRank.get(job);
    }

    @Override
    public Job toPosition(MilitaryRank rank) {
        return rankToPosition.get(rank);
    }
}

package com.headexplodes.example.collections.newCollections.enumMap;

import com.headexplodes.example.Job;

public class RankConverterUsingSwitches implements RankConverter {


    @Override
    public MilitaryRank toMilitaryRank(Job job) {
        switch (job) {
            case CEO:
                return MilitaryRank.GENERAL;
            case DEVELOPER:
                return MilitaryRank.SOLDIER;
            case DESIGNER:
                return MilitaryRank.NINJA;
            default:
                return null;
        }
    }

    @Override
    public Job toPosition(MilitaryRank rank) {
        switch (rank) {
            case GENERAL:
                return Job.CEO;
            case SOLDIER:
                return Job.DEVELOPER;
            case NINJA:
                return Job.DESIGNER;
            default:
                return null;
        }
    }
}

package com.headexplodes.example.collections.newCollections.enumMap;

import com.headexplodes.example.Position;

public class RankConverterUsingSwitches implements RankConverter {


    @Override
    public MilitaryRank toMilitaryRank(Position position) {
        switch (position) {
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
    public Position toPosition(MilitaryRank rank) {
        switch (rank) {
            case GENERAL:
                return Position.CEO;
            case SOLDIER:
                return Position.DEVELOPER;
            case NINJA:
                return Position.DESIGNER;
            default:
                return null;
        }
    }
}

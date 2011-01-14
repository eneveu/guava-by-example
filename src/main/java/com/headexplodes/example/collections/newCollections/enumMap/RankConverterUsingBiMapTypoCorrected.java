package com.headexplodes.example.collections.newCollections.enumMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.ImmutableMap;
import com.headexplodes.example.Position;

/**
 * Typo corrected
 */
public class RankConverterUsingBiMapTypoCorrected implements RankConverter {

    private BiMap<Position, MilitaryRank> positionToRank = EnumBiMap.create(ImmutableMap.of(
            Position.CEO, MilitaryRank.GENERAL,
            Position.DEVELOPER, MilitaryRank.SOLDIER,
            Position.DESIGNER, MilitaryRank.NINJA
    ));

    @Override
    public MilitaryRank toMilitaryRank(Position position) {
        return positionToRank.get(position);
    }

    @Override
    public Position toPosition(MilitaryRank rank) {
        return positionToRank.inverse().get(rank);
    }
}

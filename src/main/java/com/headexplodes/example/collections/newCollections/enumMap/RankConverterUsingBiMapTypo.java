package com.headexplodes.example.collections.newCollections.enumMap;

import com.google.common.collect.BiMap;
import com.google.common.collect.EnumBiMap;
import com.google.common.collect.ImmutableMap;
import com.headexplodes.example.Position;

/**
 * Deliberate typo on Position.DESIGNER:
 * ImmutableMap throws an IllegalArgumentException("duplicate key : DESIGNER")
 */
public class RankConverterUsingBiMapTypo implements RankConverter {

    private BiMap<Position, MilitaryRank> positionToRank = EnumBiMap.create(ImmutableMap.of(
            Position.CEO, MilitaryRank.GENERAL,
            Position.DEVELOPER, MilitaryRank.NINJA,
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

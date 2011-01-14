package com.headexplodes.example.collections.newCollections.enumMap;

import com.google.common.collect.Maps;
import com.headexplodes.example.Position;

import java.util.EnumMap;
import java.util.Map;

/**
 * Deliberate typo on Position.DESIGNER: silently fails
 */
public class RankConverterUsingTwoMapsTypo implements RankConverter {

    private Map<Position, MilitaryRank> positionToRank = Maps.newHashMap();
    private Map<MilitaryRank, Position> rankToPosition = Maps.newHashMap();

    {
        putInBothMaps(Position.CEO, MilitaryRank.GENERAL);
        putInBothMaps(Position.DEVELOPER, MilitaryRank.NINJA);
        putInBothMaps(Position.DESIGNER, MilitaryRank.NINJA);
    }

    private void putInBothMaps(Position position, MilitaryRank rank) {
        positionToRank.put(position, rank);
        rankToPosition.put(rank, position);
    }

    @Override
    public MilitaryRank toMilitaryRank(Position position) {
        return positionToRank.get(position);
    }

    @Override
    public Position toPosition(MilitaryRank rank) {
        return rankToPosition.get(rank);
    }
}

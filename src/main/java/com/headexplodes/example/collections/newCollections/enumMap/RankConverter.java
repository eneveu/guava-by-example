package com.headexplodes.example.collections.newCollections.enumMap;

import com.headexplodes.example.Position;

public interface RankConverter {

    MilitaryRank toMilitaryRank(Position position);

    Position toPosition(MilitaryRank rank);
}

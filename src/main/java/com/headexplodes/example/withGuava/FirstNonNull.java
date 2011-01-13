package com.headexplodes.example.withGuava;

public class FirstNonNull {

	private static final Employee DIDIER = null;

    public Employee findBoss() {
        return findBossWithComplicatedAlgorithm() != null ?
                    findBossWithComplicatedAlgorithm() : DIDIER;
    }

	public Employee findBossWithComplicatedAlgorithm() {
              return null;
	}


}

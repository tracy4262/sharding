package com.example.mutiple10.algorithm;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 彭诗杰
 * \* Date: 2018/10/29
 * \* Time: 23:39
 * \* Description:
 * \
 */
public class DatabaseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {

        int size = availableTargetNames.size();
        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % size + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}

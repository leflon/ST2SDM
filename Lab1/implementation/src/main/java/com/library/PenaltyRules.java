package com.library;

import java.util.Map;

public class PenaltyRules {
    private Map<Role, Integer> borrowingDurationPerRoleInDays;
    private Map<Role, Float> dailyLateFeePerRole;
    private float penaltyLimit;
    private int lateReturnsSuspensionThreshold;
}

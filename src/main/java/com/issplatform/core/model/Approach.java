package com.issplatform.core.model;

import java.time.Instant;

public record Approach(
        String primaryId,
        String otherId,
        String otherName,
        Instant closestAt,
        double minDistanceKm,
        double relativeSpeedKmS) {}

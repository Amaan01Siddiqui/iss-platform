package com.issplatform.core.model;

import java.time.Instant;

public record TrackedObject(
        String id,
        String name,
        Domain domain,
        double latDeg, double lonDeg, double altKm,
        double xKm, double yKm, double zKm,
        double speedKmS,
        Instant timestamp) {}

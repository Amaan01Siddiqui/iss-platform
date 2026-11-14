package com.issplatform.core.proximity;

import com.issplatform.core.model.Approach;
import com.issplatform.core.model.Domain;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

public interface ProximityStrategy {
    Domain domain();
    List<Approach> screen(String primaryId, Instant from, Duration window);
}

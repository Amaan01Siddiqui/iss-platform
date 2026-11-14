package com.issplatform.core.source;

import com.issplatform.core.model.Domain;
import com.issplatform.core.model.TrackedObject;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public interface DataSource {
    String name();
    Domain domain();
    Duration pollInterval();
    List<TrackedObject> fetch() throws IOException;
}

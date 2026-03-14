package pl.wsb.fitnesstracker.healthmetrics.api;

import java.util.List;
import java.util.Optional;

public interface HealthMetricsProvider {
    Optional<HealthMetrics> getHealthMetrics(Long healthMetricsId);

    List<HealthMetrics> getHealthMetricsByUserId(Long userId);

    List<HealthMetrics> findAllHealthMetrics();

}

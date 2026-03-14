package pl.wsb.fitnesstracker.healthmetrics.api;

import pl.wsb.fitnesstracker.exception.api.NotFoundException;

@SuppressWarnings("squid:S110")
public class HealthMetricsNotFoundException extends NotFoundException {

    private HealthMetricsNotFoundException(String message) {
        super(message);
    }

    public HealthMetricsNotFoundException(Long id) {
        this("HealthMetrics with ID=%s was not found".formatted(id));
    }

}
